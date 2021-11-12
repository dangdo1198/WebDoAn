<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cập nhật tài liệu</title>
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

                
                <div class="container rounded bg-white mt-5 mb-5">
    <div class="row" >
        <div class="col-md-1 border-right">
            
        </div>
        <div class="col-md-10 border-right">
            <div >
                <div class="d-flex justify-content-between align-items-center mb-3">
                    <h4 class="text-center"><label class="labels">CẬP NHẬT TÀI LIỆU</label></h4>
                </div>
                    <form action="admin-updatetintuyendungcontroller" method="get">
                <div class="row mt-3" >
              
                
                    <div class="col-md-3"><label class="labels">ID:</label><input type="text" class="form-control" name ="id" value="${detailTinTuyenDung.id}"readonly="readonly"></div>
                    <div class="col-md-12"><label class="labels">Tên Doanh Nghiệp:</label><input type="text" class="form-control" name ="ten_doanh_nghiep" value="${detailTinTuyenDung.tenDoanhNghiep}"></div>                
                    <div class="col-md-12"><label class="labels">Tiêu Đề:</label><input type="text" class="form-control" name ="tieu_de" value="${detailTinTuyenDung.tieuDe}"></div>
                    <div class="col-md-12"><label class="labels">Nội Dung:</label><input type="text" class="form-control" name ="noi_dung" value="${detailTinTuyenDung.noiDung}"></div>
                    <div class="col-md-12"><label class="labels">Số Điện Thoại:</label><input type="text" class="form-control" name ="so_dien_thoai" value="${detailTinTuyenDung.soDienThoai}"></div>
                    <div class="col-md-12"><label class="labels">Email:</label><input type="text" class="form-control" name ="email" value="${detailTinTuyenDung.email}"></div>
                    <div class="col-md-12"><label class="labels">Website:</label><input type="text" class="form-control" name ="website" value="${detailTinTuyenDung.website}"></div>
                    
                  
               
                </div>
               
                <div class="mt-5 text-center"><button class="btn btn-primary profile-button" type="submit">Lưu</button></div>
                </form>
            </div>
        </div>
        
    </div>
</div>

                
                
                </div>
             </section>   
</div>




















</body>
</html>