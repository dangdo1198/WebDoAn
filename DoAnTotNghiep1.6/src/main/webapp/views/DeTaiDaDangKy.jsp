<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



 <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1 class="m-0">ĐỀ TÀI ĐÃ ĐĂNG KÝ</h1>
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

  
  <p></p>            
  <table class="table table-dark table-striped">
    <thead>
      <tr>
        <th>STT</th>
        <th>Tên Đề Tài</th>
        <th>Lĩnh vực</th>
        <th>Dự Kiến Hoàn Thành</th>
        <th>Kinh Phí</th>
       
      </tr>
    </thead>
    <tbody id="myTable1">
      <c:forEach var = "i" items="${listDeTai}" >
      <tr>
        <td>${i.id}</td>
        <td>${i.tenDeTai}</td>
        <td>${i.linhVuc}</td>
        <td>${i.thoiGianDuKien}</td>
        <td>${i.kinhPhi}</td>
 
              
        
        
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




<script>
		alert("Đăng ký đề tài thành công");  // display string message
    </script>

</body>
</html>