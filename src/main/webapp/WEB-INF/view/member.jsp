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
		
		$('#dt-member').DataTable();
		
		//add data even listener
		$('#member-form').on('submit', function(evn){
			evn.preventDefault();
			//json -> javascript object notation
			var member = {
				name : $('#name').val(),
				address : $('#address').val(),
				email : $('#email').val()
			}
			//ajax (asyncronous javascript and xml)
			$.ajax({
				url : '${pageContext.request.contextPath}/member/save',
				type : 'POST',
				contentType : 'application/json',
				data : JSON.stringify(member),
				success : function(data){
					window.location="${pageContext.request.contextPath}/member";
				}, error: function(){
					alert('error');
				}
			});
		});
		
		//delete event function
		$(document).on('click','.btn-del-member', function(){
			var id = $(this).attr('data-id');
			
			var conf = confirm("Are you sure delete this data ?");
			if(conf){
				$.ajax({
					url : '${pageContext.request.contextPath}/member/delete?id=' + id,
					type : 'DELETE',
				    success: function(data){
				    	window.location='${pageContext.request.contextPath}/member';
				    }, error : function(){
				    	alert('failed');
				    }
				});
			} return false;
		});
		
		//edit listener
		$(document).on('click','.btn-edit', function(){
			var id = $(this).attr('data-id');
			$.ajax({
				url : '${pageContext.request.contextPath}/member/getmember?id='+id,
				type: 'GET',
				success : function(obj){
					$('#idEdit').val(obj.id);
					$('#nameEdit').val(obj.name);
					$('#addressEdit').val(obj.address);
					$('#emailEdit').val(obj.email);
				}
			});
			
			$("#modalEdit").modal();
		});
		
		//submit edit
		$('#btn-submit-edit').click(function(){
			var member = {
				id : $('#idEdit').val(),
				name : $('#nameEdit').val(),
				address : $('#addressEdit').val(),
				email : $('#emailEdit').val()
			}
			//console.log(member);
			//do ajax
			$.ajax({
				url : '${pageContext.request.contextPath}/member/update',
				type: 'PUT',
				data : JSON.stringify(member),
				contentType: 'application/json',
				success : function(data){
					window.location="${pageContext.request.contextPath}/member";
				}, error : function(){
					alert('failed');
				}
			});
		});
		
		//show detail
		$(document).on('click', '.btn-detail', function(){
			var id = $(this).attr('data-id');
			$.ajax({
				url : '${pageContext.request.contextPath}/member/getmember?id='+id,
				type: 'GET',
				success : function(obj){
					$('#nameDetail').text(obj.name);
					$('#addressDetail').text(obj.address);
					$('#emailDetail').text(obj.email);
				}
			});
			
			$('#modalViewDetail').modal();
		});
	});
</script>
</head>
<body>

	<div id="container" style="width: 1000px; margin: auto;">
		<form id="member-form">
			<input type="text" id="name"  placeholder="enter your name" /><br/>
			<input type="text" id="address" placeholder="enter your address"/></br>
			<input type="text" id="email" placeholder="enter your email"/></br>
			<input type="submit" value="save" />
		</form>
		<div id="data-mahasiswa">
			<table id="dt-member" class="display" style="width:100%">
				<thead>
					<tr>
						<th>Name</th>
						<th>Address</th>
						<th>Email</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${listMember }" var="member">
						<tr>
							<td>${member.name }</td>
							<td>${member.address }</td>
							<td>${member.email }</td>
							<td>
								<a href="#" data-id='${member.id }' class="btn btn-sm btn-danger btn-del-member">Delete</a>
								|
								<a href="#" data-id='${member.id }' class="btn btn-sm btn-edit btn-warning">Edit</a>
								|
								<a href="#" data-id='${member.id }' class="btn btn-sm btn-detail btn-info">Detail</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
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
	<%@ include file="modal/modal-member-detail.jsp" %>
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