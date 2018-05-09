<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Form Member</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.10.16/datatables.min.css"/>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.16/datatables.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$('.add-to-cart').on('click', function(){
			
			_addRowItemWistlist(this);
			_removeRowOld(this);
			_wistlistInfoTable();
		});
		
		//append table add row item wistlist
		function _addRowItemWistlist(data){
			var nameItem = $(data).parent().parent().find('td').eq(0).text();
			var price = $(data).parent().parent().find('td').eq(2).text();
			var qty = $(data).parent().parent().find('td').eq(4).find('select').val();
			var id = $(data).parent().parent().attr('items-id');
			var itemsStock = $(data).parent().parent().attr('items-stock');
			var totalPrice = (price * qty);
			var oTable = $('#dt-wishlist');
			var tBody = oTable.find('tbody');
			//console.log(totalPrice);
			var appendString = "<tr items-id='"+id+"' items-stock='"+itemsStock+"'>";
				appendString += "<td>";
					appendString += nameItem;
				appendString += "</td>";
				appendString += "<td>";
					appendString += price;
				appendString += "</td>";
				appendString += "<td>";
					appendString += qty;
				appendString += "</td>";
				appendString += "<td>";
					appendString += totalPrice;
				appendString += "</td>";
			appendString += "</tr>";
			tBody.append(appendString);
		}
		
		//remove row
	    function _removeRowOld(data){
	    	var row = $(data).parent().parent().remove();
		}
		
		//table wishlist info
		function _wistlistInfoTable(){
			var totalPrice = 0;
			var i = 0;
			$('#dt-wishlist > tbody > tr').each(function(index, value){
				totalPrice = totalPrice + parseInt($(value).find('td').eq(3).text());
				i++;
			});
			
			$('#customerName').text($('#data-customer option:selected').text());
			$('#totalPrice').text(totalPrice);
			$('#jumlahItem').text(i);
		}
		
		$('#bayar').on('click', function(){
			var detailPembelian = [];
			
			$('#dt-wishlist > tbody > tr').each(function(index, value){
				detailPembelian.push({
					items : {
						id : $(value).attr('items-id'),
						stock : $(value).attr('items-stock')
					},
					totalQty : $(value).find('td').eq(2).text() 
				});
			});
			
			var pembelian = {
				quantityItems : parseInt($('#jumlahItem').text()),
				totalPrice : parseInt($('#totalPrice').text()),
				customer : {
					id : $('#data-customer option:selected').val()
				},
				detailPembelian :detailPembelian
			}
			console.log(pembelian);
			/*
				1. buat data object yang akan dikirim ke server
				2. save data pembelian
				3. save data detail pembelian untuk item yang di beli
				4. update stok di item
				5. ubah status item dari 0 ke 1 (terjual) untuk setiap item
			*/
			$.ajax({
				url : '${pageContext.request.contextPath}/pembelian/bayar',
				type : 'POST',
				data : JSON.stringify(pembelian),
				contentType : 'application/json',
				success : function(data){
					console.log(data);
				}, error : function(){
					alert('processing data failed');
				}
			});
		});
	});
</script>
</head>
<body>

	<div id="container" style="width: 1000px; margin: auto;">
		<p>
		<div id="data-customer">
			Customer : 
			<select id="data-customer">
				<c:forEach items="${listCustomers}" var="customer">
					<option value="${customer.id }">${customer.name }</option>
				</c:forEach>
			</select>
		</div>
		</p>
		<div id="data-items">
			<table id="dt-items" class="display" style="width:100%">
				<thead>
					<tr>
						<th>Name</th>
						<th>Code</th>
						<th>price</th>
						<th>Description</th>
						<th>QTY</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${listItems }" var="item">
						<tr items-id='${item.id }' items-stock='${item.stock }'>
							<td>${item.name }</td>
							<td>${item.itemCode }</td>
							<td>${item.price }</td>
							<td>${item.description }</td>
							<td>
								<% int i = 0; %>
								<select>
								<c:forEach begin="1" end="${item.stock }">
									<option value="<%=++i %>"><%=i %></option>
								</c:forEach>
								</select>
							</td>
							<td>
								<a class="add-to-cart btn btn-sm btn-primary" href="#">Add to cart</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<hr/>
		<div id="wishlist">
		<p>
			<h4>Daftar nama item dalam wishlist</h4>
		</p>
		Total Price : <span id="totalPrice">-</span><br/>
		Customer Name : <span id="customerName">-</span><br/>
		Jumlah item : <span id="jumlahItem">-</span><br/> 
		
			<table id="dt-wishlist" class="display" style="width:100%">
				<thead>
					<tr>
						<th>Name</th>
						<th>Price</th>
						<th>QTY</th>
						<th>Total Price</th>
					</tr>
				</thead>
				<tbody>
					
				</tbody>
			</table>
			<hr/>
			<a href="#" id="bayar" class="btn btn-primary">Bayar</a>
		</div>
	</div>
	<!-- Modal -->
	<div class="modal fade" id="modalEdit" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalLabel">Edit Mahasiswa</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
	       	 <div class="form-group">
			    <label for="name">Name</label>
			    <input type="hidden" id="idEdit"  />
			    <input type="text" class="form-control" id="nameEdit" aria-describedby="emailHelp" placeholder="Enter your name">
			    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
			  </div>
			  <div class="form-group">
			    <label for="address">Address</label>
			    <input type="text" class="form-control" id="addressEdit" placeholder="Enter your address">
			  </div>
			  <div class="form-group">
			    <label for="email">Email</label>
			    <input type="email" class="form-control" id="emailEdit" placeholder="Enter your email">
			  </div>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
	        <button type="button" id="btn-submit-edit" class="btn btn-primary">Save changes</button>
	      </div>
	    </div>
	  </div>
	</div>
	
</body>
<script type="text/javascript">
	function deleteById(id){
		var conf = confirm("are you sure delete data ?");
		if(conf){
			window.location="${pageContext.request.contextPath}/mahasiswa/delete/"+ id;
		}
		
		return false;
	}
</script>
</html>