<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng ký đề tài</title>
</head>
<body>


	<div class="content-wrapper">
		<!-- Content Header (Page header) -->
		<div class="content-header">
			<div class="container-fluid">
				<div class="row mb-2">
					<div class="col-sm-6">
						<h1 class="m-0"></h1>
					</div>
					<!-- /.col -->
					<div class="col-sm-6">
						<ol class="breadcrumb float-sm-right">
							<li class="breadcrumb-item"><a href="admin-home">Home</a></li>
							<li class="breadcrumb-item active">Dashboard v1</li>
						</ol>
					</div>
					<!-- /.col -->
				</div>
				<!-- /.row -->
			</div>
			<!-- /.container-fluid -->
		</div>
		<!-- /.content-header -->
		<section class="content">


			<div class="container">
				<div class="card">
					<div class="container-fliud">
						<div class="wrapper row">

							<div class="details col-md-5">
								<form action="admin-dangtintuyendungcontroller" method="get">
									<fieldset>
										<legend class="text-center dautintuyendung">TẠO TIN TUYỂN DỤNG
											</legend>

										<div class="form-group">
											<div class="inputWithIcon">
												<input class="form-control"  type="text" placeholder="Tên doanh nghiệp" name ="ten_doanh_nghiep" required>
													
													<i class="fas fa-building fa-lg fa-fw" aria-hidden="true"></i>
											</div>
										</div>


										<div class="form-group">
											<div class="inputWithIcon">
												<input class="form-control"  type="text" placeholder="Người đăng" name ="nguoi_dang" required>
												<i class="fas fa-user-tie fa-lg fa-fw" aria-hidden="true"></i> 
											</div>
										</div>


										<div class="form-group">
											<div class="inputWithIcon">
												<input class="form-control"  type="text" placeholder="Chức vụ" name ="chuc_vu" required> 
												<i class="fas fa-award fa-lg fa-fw" aria-hidden="true"></i>
											</div>
										</div>

										<div class="form-group">
											<div class="inputWithIcon">
												<input class="form-control"  type="text" placeholder="Số điện thoại" name ="so_dien_thoai" required> <i
													class="fa fa-phone fa-lg fa-fw" aria-hidden="true"></i>
											</div>
										</div>

										<div class="form-group">
											<div class="inputWithIcon">
												<input class="form-control"  type="text" placeholder="Email" name ="email" required>
												 <i class="fas fa-envelope fa-lg fa-fw" aria-hidden="true"></i>
											</div>
										</div>

										<div class="form-group">
											<div class="inputWithIcon">
												<input class="form-control"   type="text" placeholder="Website" name ="website" required>
												 <i class="fab fa-internet-explorer fa-lg fa-fw" aria-hidden="true"></i>
											</div>
										</div>

										<div class="form-group">
											<div class="inputWithIcon">
												<input type="text" placeholder="Tiêu đề" class="form-control"  name ="tieu_de" required>
												 <i class="fas fa-heading fa-lg fa-fw" aria-hidden="true"></i>
											</div>
										</div>


										<div class="form-group">
											<span class="col-md-1 col-md-offset-2 text-center"><i
												class="fa fa-pencil-square-o bigicon"></i></span>
											<div class="col-md-12">
												<textarea class="form-control" id="message" name="noi_dung"
													placeholder="Nhập nội dung cho bài tin tuyển dụng."
													rows="7"></textarea>
											</div>
										</div>

										<div class="form-group">
											<div class="col-md-12 text-center">
												<button type="submit" class="btn btn-primary btn-lg">Đăng bài</button>
											</div>
										</div>











									</fieldset>
								</form>
							</div>




							<div class="details col-md-7">
								<h3 style="padding-top:12px; text-align: center;font-size: x-large; font-style: italic;color: orange;  "> CÁC TIN ĐÃ ĐĂNG </h3>
									
								<div class="col-md-12">
   
                 
        <div class="table-responsive">
             <table id="mytable" class="table table-bordred table-striped"> 
                   <thead>
                         
                   <th style="color : green">STT</th>
                    <th style="color : green">TIÊU ĐỀ</th>
                     <th style="color : green">CHI TIẾT</th>                  
                     <th style="color : green">CẬP NHẬT</th>                                     
                       <th style="color : green">XÓA</th>
                   </thead>
    <tbody id="myTable1">
    <c:forEach var = "i" items="${listTinTuyenDung}" >
    <tr>
    <td>${i.id}</td>
        <td>${i.tieuDe}</td>
        <td style ="text-align: center;"><a href="admin-xemchitiettintuyendungdoanhnghiepcontroller?id=${i.id }"><i class="fas fa-info-circle"></i></a></td>    
       
      
        
    
    <td><a href="admin-detailupdatetintuyendungcontroller?id=${i.id}"><p data-placement="top" data-toggle="tooltip" title="Edit"><button class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><i class="fas fa-edit"></i></button></p></a></td>
    <td><a href="admin-xoatintuyendungcontroller?id=${i.id}"><p data-placement="top" data-toggle="tooltip" title="Delete"><button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><i class="fas fa-trash-alt"></i></button></p></a></td>
    
    
    </tr>
    
 </c:forEach>
    
   
    
   
    
    </tbody>
        
</table>

<div class="clearfix"></div>

                
            </div>
            
        </div>
							</div>








						</div>



					</div>
				</div>
			</div>
	</div>





	</section>
	</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
  $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#myTable1 tr").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});
</script>










</body>
</html>