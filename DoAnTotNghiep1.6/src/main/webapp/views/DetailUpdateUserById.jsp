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
                    <h4 class="text-center"><label class="labels">CHỈNH SỬA QUYỀN ĐĂNG NHẬP HỆ THỐNG</label></h4>
                </div>
                    <form action="admin-updateroleusercontroller" method="get">
                <div class="row mt-3" >
              
                
                    <div class="col-md-3"><label class="labels">ID:</label><input type="text" class="form-control" name ="id" value="${detailUser.id}"readonly="readonly"></div>
                    <div class="col-md-12"><label class="labels">Tên Người Dùng:</label><input type="text" class="form-control" name ="ten_nguoi_dung" value="${detailUser.tenNguoiDung}"readonly="readonly"></div>
                    <div class="col-md-12"><label class="labels">Email:</label><input type="text" class="form-control" name ="email"  value="${detailUser.email}"readonly="readonly"></div>
                    <div class="col-md-12"><label class="labels">Vai Trò:</label><input type="text" class="form-control" name ="role" value="${detailUser.role}"></div>
                    
                    
                  
               
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