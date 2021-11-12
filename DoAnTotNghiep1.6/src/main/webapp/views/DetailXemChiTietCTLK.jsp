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
            <h1 class="m-0"></h1>
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
 <div class="card"> 
  <div class="container-fliud"> 
   <div class="wrapper row"> 
    
   
  
    
    
     <div  class="details col-md-12" >
        <h3 style="color: green; padding-top: 10px; padding-left:10px">${detailCTLK.tenChuongTrinh}</h3> 
       
        
     <div class="rating"> 
      <div  style="color: orange; padding-left:10px"> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star"></span> <span class="fa fa-star"></span> 
      </div> <span style="color: blue; padding-left:10px;font-style: italic">${detailCTLK.tenDoanhNghiep}</span> 
     </div> 
     <hr></hr>
     <p style="padding-left:10px">${detailCTLK.noiDungChinh} </p> 
     <p style="padding-left:10px"><a  style="padding-right:10px">Thời gian dự kiến :</a><label style="font-style: italic;padding-right: 10px">${detailCTLK.thoiGianDuKien}</label></p> 
     
     <p style="padding-left:10px;color:grey;font-style:italic" ><i style="color:green;padding-right:10px" class="far fa-comments"></i><strong>${detailCTLK.ghiChu} </strong></p> 
 
     <p style="padding-left:600px" id="current-time"></p>
      <p style="padding-left:500px; font-style:italic; text-align: center" ><label>${detailCTLK.chucVu}</label></p> 
       <p style="padding-left:500px; text-align: center" ><label>${detailCTLK.nguoiDaiDien}</label></p> 
	  
      </div>


   
	
	
	
	
   </div> 
  </div> 
 </div>
  <p><a href="admin-quanlychuongtrinhlienketmenucontroller" style="padding-left: 10px; color: blue"><i style="padding-right: 10px" class="fas fa-angle-double-left"></i>Quay lại</a>
  <a href="admin-detailtrangthaixacnhanchuongtrinhlienketcontroller?id=${detailCTLK.id }" style="padding-left: 750px; color: blue">Phản hồi<i style="padding-left:10px" class="fas fa-angle-double-right"></i></a></p>
</div> 
                
                
                </div>
             </section>   
</div>


<script>
    var curDate = new Date();
      
    // Ngày hiện tại
    var curDay = curDate.getDate();
 
    // Tháng hiện tại
    var curMonth = curDate.getMonth() + 1;
      
    // Năm hiện tại
    var curYear = curDate.getFullYear();
 
    // Gán vào thẻ HTML
    document.getElementById('current-time').innerHTML ="Hà Nội, ngày "+ curDay + " tháng " + curMonth + " năm " + curYear;
</script>










</body>
</html>