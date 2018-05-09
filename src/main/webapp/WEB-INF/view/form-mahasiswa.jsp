<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Form Mahasiswa</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script type="text/javascript">
	$(document).ready(function(){
		//edit even listener
		$('.edit').on('click', function(){
			var id = $(this).attr('id');
			$.ajax({
				url : '${pageContext.request.contextPath}/mahasiswa/getmhs/'+ id,
				type : 'GET',
				success : function(data){
					console.log(data);
					$('#id').val(data.id);
					$('#name').val(data.name);
					$('#address').val(data.address);
					$('#email').val(data.email);
				},
				error : function(){
					alert('data mahasiswa tidak ada');
				},
				dataType: 'json'
			});
			$('#modalEdit').modal();
		});
		
		//ketika submit edit di click 
		$('#btn-submit-edit').on('click', function(){
			var mahasiswa = {
					id : $('#id').val(),
					name : $('#name').val(),
					address: $('#address').val(),
					email : $('#email').val()
			}
			
			console.log(mahasiswa);
			
			//ajax nya kaya gini
			$.ajax({
				url : '${pageContext.request.contextPath}/mahasiswa/update',
				type : 'POST',
				data : JSON.stringify(mahasiswa),
				contentType: 'application/json',
				success : function(data){
					alert('update ok..');
					window.location = '${pageContext.request.contextPath}/mahasiswa'
				}, error : function(){
					alert('operasi gagal');
				}
			});
		});
	});
</script>
</head>
<body>

	<div id="container">
		<form action="${pageContext.request.contextPath }/mahasiswa/save" method="POST">
			<input type="text" name="name" placeholder="enter your name" /><br/>
			<input type="text" name="address" placeholder="enter your address"/></br>
			<input type="text" name="email" placeholder="enter your email"/></br>
			<input type="submit" value="save" />
		</form>
		<div id="data-mahasiswa">
			<table>
				<thead>
					<tr>
						<th>Name</th>
						<th>Address</th>
						<th>Email</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${ listMahasiswa}" var="mahasiswa">
					<tr>
						<td>${mahasiswa.name }</td>
						<td>${mahasiswa.address }</td>
						<td>${mahasiswa.email }</td>
						<td>
							<a href="#" onclick="deleteById('${mahasiswa.id }')">Delete</a>
							|
							<a class="edit" id="${mahasiswa.id }" href="#">Edit</a>
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
			    <input type="hidden" id="id"  />
			    <input type="text" class="form-control" id="name" aria-describedby="emailHelp" placeholder="Enter your name">
			    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
			  </div>
			  <div class="form-group">
			    <label for="address">Address</label>
			    <input type="text" class="form-control" id="address" placeholder="Enter your address">
			  </div>
			  <div class="form-group">
			    <label for="email">Email</label>
			    <input type="email" class="form-control" id="email" placeholder="Enter your email">
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