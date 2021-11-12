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
                    <h4 class="text-center"><label class="labels">PHÊ DUYỆT ĐỀ TÀI</label></h4>
                </div>
                    <form action="admin-pheduyetdetaicontroller" method="get">
                <div class="row mt-4" >
              
                
                    <div class="col-md-2"><label class="labels">ID:</label><input type="text" class="form-control" name ="id" value="${detailDeTai.id}"readonly="readonly"></div>
                    <div class="col-md-10"><label class="labels">SINH VIÊN:</label><input type="text" class="form-control" name ="ho_va_ten" value="${detailDeTai.hoVaTen}"readonly="readonly"></div>
                    <div class="col-md-12"><label class="labels">ĐỀ TÀI:</label><input type="text" class="form-control" name ="ten_de_tai" value="${detailDeTai.tenDeTai}"readonly="readonly"></div>
                    <div class="col-md-12"><label class="labels">QUYẾT ĐỊNH:</label><input type="text" class="form-control"placeholder="DUYỆT/HỦY" name ="trang_thai_duyet"  value="${detailDeTai.trangThaiDuyet}"></div>
                    <div class="col-md-12"><label class="labels">PHẢN HỒI:</label><input type="text" class="form-control" name ="ly_do"  value="${detailDeTai.lyDo}"></div>
                  
               
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