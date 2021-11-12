<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tai lieu nghien cuu</title>


</head>
<body>


 <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1 class="m-0"><i style="color:red" class="fas fa-book"></i> TÀI LIỆU NGHIÊN CỨU KHOA HỌC</h1>
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
              
  <table class="table">
    <thead>
      <tr>
        <th style = "color: green; text-align: center">STT</th>
        <th style = "color: green; text-align: center">TÀI LIỆU</th>
        <th style = "color: green; text-align: center">TÁC GIẢ</th>
        <th style = "color: green; text-align: center">LĨNH VỰC</th>
        <th style = "color: green; text-align: center">THỜI GIAN</th>
         <th style = "color: green; text-align: center">THAM KHẢO</th>
      </tr>
    </thead>
    <tbody id="myTable1">
     <c:forEach var = "i" items="${listTaiLieu}" >
      <tr>
        <td style = "color: black">${i.id}</td>
        <td style = "color: green">${i.tenTaiLieu}</td>
        <td>${i.tacGia}</td>
        <td>${i.linhVuc}</td>
        <td>${i.thoiGian}</td>
        
                 <td><a href="${i.linkTai}" >Xem chi tiết</td>
        
        
      </tr>
      
      </c:forEach>
      
    </tbody>
  </table>
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