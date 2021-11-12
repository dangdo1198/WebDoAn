<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
                    <h4 class="text-center"><label style="color:maroon" class="labels" >ĐĂNG KÝ ĐỀ TÀI NGHIÊN CỨU KHOA HỌC</label></h4>
                </div>
                    <form action="admin-dangkydetaicontroller" method="get">
                <div class="row mt-3" >
              
                
                    <div class="col-md-12"><label style="font-style: italic" class="labels"><i style="color:green" class="fas fa-user-tag"></i> Họ Và Tên:</label><input type="text" class="form-control" name ="ho_va_ten" required ></div>
                    <div class="col-md-12"><label style="font-style: italic" class="labels"><i style="color:gray" class="fas fa-qrcode"></i>Mã SV:</label><input type="text" class="form-control" name ="ma_sinh_vien" required ></div>
                    <div class="col-md-12"><label style="font-style: italic" class="labels"><i style="color:blue" class="fas fa-layer-group"></i>Khoa:</label><input type="text" class="form-control" name ="khoa" required ></div>
                    <div class="col-md-12"><label style="font-style: italic" class="labels"><i style="color:purple" class="fas fa-file-alt"></i>Đề Tài:</label><input type="text" class="form-control" name ="ten_de_tai" required ></div>
                    <div class="col-md-12"><label style="font-style: italic" class="labels"><i style="color:orange" class="fas fa-lightbulb"></i>Lĩnh Vực:</label><input type="text" class="form-control" name ="linh_vuc" required ></div>
                    <div class="col-md-12"><label style="font-style: italic" class="labels"><i style="color:red" class="fas fa-stopwatch"></i>Thời Gian Dự Kiến:</label><input type="text" class="form-control" name ="thoi_gian_du_kien" required></div>
                    <div class="col-md-12"><label style="font-style: italic" class="labels"><i style="color:olive" class="fas fa-money-check-alt"></i>Kinh Phí:</label><input type="text" class="form-control" name ="kinh_phi" required ></div>
                    <div class="col-md-12"><label style="font-style: italic" class="labels"><i style="color:navy" class="fas fa-comment-dots"></i>Ghi Chú:</label><textarea class="form-control"name ="ghi_chu" required></textarea></div>
                  
               
                </div>
               
                <div class="mt-5 text-center"><button class="btn btn-primary profile-button" type="submit">Đăng Ký</button></div>
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