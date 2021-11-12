<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

                
                <div class="container rounded bg-white mt-5 mb-5">
    <div class="row" >
        <div class="col-md-1 border-right">
            
        </div>
        <div class="col-md-10 border-right">
            <div >
                <div class="d-flex justify-content-between align-items-center mb-3">
                    <h4 class="text-center"><label class="labels">PHẢN HỒI ĐỀ XUẤT CHƯƠNG TRÌNH LIÊN KẾT CỦA DOANH NGHIỆP</label></h4>
                </div>
                    <form action="admin-phanhoichuongtrinhlienketcontroller" method="get">
                <div class="row mt-4" >
              
                
                    <div class="col-md-2"><label class="labels">ID:</label><input type="text" class="form-control" name ="id" value="${detailCTLK.id}"readonly="readonly"></div>
                    <div class="col-md-10"><label class="labels">TÊN DOANH NGHIỆP:</label><input type="text" class="form-control" name ="ten_doanh_nghiep" value="${detailCTLK.tenDoanhNghiep}"readonly="readonly"></div>
                    <div class="col-md-12"><label class="labels">TÊN CHƯƠNG TRÌNH:</label><input type="text" class="form-control" name ="ten_chuong_trinh" value="${detailCTLK.tenChuongTrinh}"readonly="readonly"></div>
                    <div class="col-md-12"><label class="labels">XÁC NHẬN:</label><input type="text" class="form-control"placeholder="ĐỒNG Ý / TỪ CHỐI" name ="trang_thai_xac_nhan"  value="${detailCTLK.trangThaiXacNhan}"></div>
                    <div class="col-md-12"><label class="labels">LỜI NHẮN:</label><input type="text" class="form-control" name ="ly_do"  value="${detailCTLK.lyDo}"></div>
                  
               
                </div>
               
                <div class="mt-5 text-center"><button class="btn btn-primary profile-button" type="submit">SAVE</button></div>
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