<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quản lý tài liệu</title>


</head>
<body>


 <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1 style="color: green"><i class="fas fa-cog"></i> QUẢN LÝ TÀI LIỆU NGHIÊN CỨU</h1>
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
   <div class="row mt-2">
    
                       
                        <a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"> <i class="far fa-calendar-plus"></i><span>  Thêm tài liệu</span></a>
                            
                        </div>
                 
        <div class="table-responsive">
             <table id="mytable" class="table table-bordred table-striped"> 
                   <thead>
                         
                   <th style ="color: blue">STT</th>
                    <th style ="color: blue">TÀI LIỆU</th>
                     <th style ="color: blue">TÁC GIẢ</th>
                     <th style ="color: blue">LĨNH VỰC</th>
                     <th style ="color: blue">THỜI GIAN</th>
                     <th style ="color: blue">THAM KHẢO</th>
                      <th style ="color: blue">SỬA</th>
                  
                       <th style ="color: blue">XÓA</th>
                   </thead>
    <tbody id="myTable1">
    <c:forEach var = "i" items="${listTaiLieu}" >
    <tr>
    <td>${i.id}</td>
        <td>${i.tenTaiLieu}</td>
        <td>${i.tacGia}</td>
        <td>${i.linhVuc}</td>
        <td>${i.thoiGian}</td>
        <td><a href="${i.linkTai}" >Xem chi tiết</td>
    
    <td><a href="admin-detailtailieucontroller?id=${i.id}"><p data-placement="top" data-toggle="tooltip" title="Edit"><button class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><i class="fas fa-edit"></i></button></p></a></td>
    <td><a href="admin-deletetailieucontroller?id=${i.id}"><p data-placement="top" data-toggle="tooltip" title="Delete"><button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><i class="fas fa-trash-alt"></i></button></p></a></td>
    
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
 <div id="addEmployeeModal" class="modal fade">
  <div class="modal-dialog">
   <div class="modal-content">
    <form action="admin-addtailieucontroller">
     <div class="modal-header">      
      <h4 class="modal-title" style ="color: green;font-style:oblique;"><i class="fas fa-plus-circle"></i>  Thêm tài liệu nghiên cứu</h4>
      <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
     </div>
     <div class="modal-body">     
      <div class="form-group">
       <label style ="font-style: italic;"><i style="color:blue" class="fas fa-file-alt"></i> Tên tài liệu:</label>
       <input type="text" class="form-control" name ="ten_tai_lieu" required>
      </div>
      <div class="form-group">
       <label style ="font-style: italic;"><i style="color:gray" class="fas fa-user-tie"></i>Tác giả:</label>
       <input type="text" class="form-control" name ="ten_tac_gia" required>
      </div>
      <div class="form-group">
       <label style ="font-style: italic;"><i style="color:green" class="fas fa-star-of-david"></i>Lĩnh vực:</label>
       <input type="text" class="form-control"name ="linh_vuc" required>
      </div> 
      
      <div class="form-group">
       <label style ="font-style: italic;"><i style="color:red" class="fas fa-history"></i>Thời gian:</label>
       <input type="text" class="form-control" name ="thoi_gian">
      </div> 
      <div class="form-group">
       <label style ="font-style: italic;"><i style="color:red" class="fas fa-history"></i>Nguồn tham khảo:</label>
       <input type="text" class="form-control" name ="link_tai">
      </div> 
           
     </div>
     <div class="modal-footer">
      <input type="button" class="btn btn-default" data-dismiss="modal" value="Hủy">
      <input type="submit" class="btn btn-success" value="Thêm">
     </div>
    </form>
   </div>
  </div>
 </div>

                
                
                </div>
             </section>   
</div>








    
    
    
    
    <!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script> -->
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