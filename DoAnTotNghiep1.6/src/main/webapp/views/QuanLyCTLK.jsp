<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quản lý chương trình liên kết</title>
</head>
<body>


 <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1 style="color:brown" ><i class="far fa-calendar-check"></i>: Quản lý chương trình liên kết từ doanh nghiệp  </h1>
          </div><!-- /.col -->
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="admin-home">Home</a></li>
              <li class="breadcrumb-item active">Dashboard v1</li>
            </ol>
          </div><!-- /.col -->
        </div><!-- /.row -->
      </div><!-- /.container-fluid -->
    </div>
    <!-- /.content-header -->
           <section class="content">
           <div class="container-fluid">

                
                 <div class="container">
	<div class="row">
		
        
        <div class="col-md-12">
   
                 
        <div class="table-responsive">
             <table id="mytable" class="table table-bordred table-striped"> 
                   <thead>
                         
                   <th style="color : green">STT</th>
                   <th style="color : green">CTLK ĐỀ XUẤT</th>
                    <th style="color : green">DOANH NGHIỆP</th>
                     <th style="color : green">ĐẠI DIỆN</th>               
                     <th style="color : green">CHỨC VỤ</th>
						 <th style="color : green">XEM CHI TIẾT</th>                                             
                       <th style="color : green">TRẠNG THÁI</th>
                       <th style="color : green">PHẢN HỒI</th>
                       <th style="color : green">XÓA</th>
                     
                   </thead>
    <tbody id="myTable1">
    <c:forEach var = "i" items="${listCtlk}" >
    <tr>
    <td>${i.id}</td>
        <td>${i.tenChuongTrinh}</td>
        <td>${i.tenDoanhNghiep}</td>  
        <td>${i.nguoiDaiDien}</td>
         <td>${i.chucVu}</td>
         <td style ="text-align: center;"><a href="admin-detailxemchitietchuongtrinhlienketcontroller?id=${i.id }"><i class="fas fa-info-circle"></i></a></td>
        <td style="color: red">${i.trangThaiXacNhan}</td>
       
     
        
    
    <td><a href="admin-detailtrangthaixacnhanchuongtrinhlienketcontroller?id=${i.id}"><p data-placement="top" data-toggle="tooltip" title="Edit"><button class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><i class="fas fa-edit"></i></button></p></a></td>
    <td><a href="admin-xoachuongtrinhlienketcontroller?id=${i.id}"><p data-placement="top" data-toggle="tooltip" title="Delete"><button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><i class="fas fa-trash-alt"></i></button></p></a></td>
    
    
    </tr>
    
 </c:forEach>
    
   
    
   
    
    </tbody>
        
</table>

<div class="clearfix"></div>

                
            </div>
            
        </div>
	</div>
</div>

<!-- add Modal HTML -->
 
                
                
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