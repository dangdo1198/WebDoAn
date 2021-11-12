<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
            <h1 style="color:green"><i class="fas fa-check"></i>ĐỀ TÀI NGHIÊN CỨU ĐƯỢC DUYỆT</h1>
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
	
                       
		<table class="styled-tablevip">
			<thead>
				<tr class="active-row">
					<th style="text-align: center">STT</th>
					<th style="text-align: center">TÊN ĐỀ TÀI</th>
					<th style="text-align: center">LĨNH VỰC</th>
					<th style="text-align: center">DỰ KIẾN</th>
					<th style="text-align: center">KINH PHÍ</th>
					<th style="text-align: center">PHẢN HỒI</th>
					

				</tr>
			</thead>
			<tbody id="myTable1" >
				<c:forEach var="i" items="${listDeTai}">
					<tr >
						<td style="text-align: center">${i.id}</td>
						<td style="text-align: center">${i.tenDeTai}</td>
						<td style="text-align: center">${i.linhVuc}</td>
						<td style="text-align: center">${i.thoiGianDuKien}</td>
						<td style="text-align: center">${i.kinhPhi}</td>
						<td style="text-align: center">${i.lyDo}</td>
						

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