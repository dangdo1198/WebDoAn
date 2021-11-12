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
        <h3 style="color: green; padding-top: 10px; padding-left:10px">${detailTinTuyenDung.tieuDe} </h3> 
        
       
        
     <div class="rating"> 
      <div  style="color: orange; padding-left:10px"> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star"></span> <span class="fa fa-star"></span> 
      </div> <span style="color: blue; padding-left:10px;font-style: italic">${detailTinTuyenDung.tenDoanhNghiep}</span>
       

     </div> 
     <hr></hr>
     <p style="padding-left:10px">${detailTinTuyenDung.noiDung} </p> 
    
     
     <p style="padding-left:10px;color:grey;font-style:italic" ><i style="color:blue;padding-right:10px" class="fas fa-phone-square-alt"></i> Call trực tiếp qua số điện thoại: <strong style="padding-left:5px;padding-right:5px">${detailTinTuyenDung.soDienThoai} </strong> để được tư vấn cụ thể và gửi hồ sơ qua email:<strong style="padding-left:5px;padding-right:5px">${detailTinTuyenDung.email}</strong></p>
     <p><i style="color: green; padding-left:10px" class="fas fa-globe-americas"></i><span style="color: blue; padding-left:10px;font-style: italic;font-size:medium; "><a href="${detailTinTuyenDung.website}">${detailTinTuyenDung.website}</a></span> <p>
     <p style="padding-left:600px" id="current-time"></p>
      <p style="padding-left:500px; font-style:italic; text-align: center" ><label>${detailTinTuyenDung.chucVu}</label></p> 
       <p style="padding-left:500px; text-align: center" ><label>${detailTinTuyenDung.nguoiDang}</label></p> 
	  
      </div>


   
	
	
	
	
   </div> 
  </div> 
 </div>
  <p><a href="admin-dangtintuyendungmenucontroller" style="padding-left: 10px; color: blue"><i style="padding-right: 10px" class="fas fa-angle-double-left"></i>Quay lại</a>
  <a href="admin-detailupdatetintuyendungcontroller?id=${detailTinTuyenDung.id }" style="padding-left: 750px; color: blue">Cập nhật<i style="padding-left:10px" class="fas fa-angle-double-right"></i></a></p>
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