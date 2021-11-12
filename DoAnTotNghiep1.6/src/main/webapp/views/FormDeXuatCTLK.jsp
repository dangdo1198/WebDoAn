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
                    <h4 class="text-center"><label style="color:maroon" class="labels" >ĐỀ XUẤT CHƯƠNG TRÌNH LIÊN KẾT HỢP TÁC</label></h4>
	
                </div>
                    <form action="admin-dexuatchuongtrinhlienketcontroller" method="get">
                <div class="row mt-3" >
              
                
                    <div class="col-md-12"><label style="font-style: italic" class="labels"><i style="color:green" class="fas fa-user-tag"></i>Tên Chương Trình Liên Kết:</label><input type="text" class="form-control" name ="ten_chuong_trinh" required ></div>
                    <div class="col-md-12"><label style="font-style: italic" class="labels"><i style="color:gray" class="fas fa-qrcode"></i>Tên Doanh Nghiệp:</label><input type="text" class="form-control" name ="ten_doanh_nghiep" required ></div>
                    <div class="col-md-12"><label style="font-style: italic" class="labels"><i style="color:blue" class="fas fa-layer-group"></i>Người Đại Diện:</label><input type="text" class="form-control" name ="nguoi_dai_dien" required ></div>
                    <div class="col-md-12"><label style="font-style: italic" class="labels"><i style="color:purple" class="fas fa-file-alt"></i>Chức Vụ</label><input type="text" class="form-control" name ="chuc_vu" required ></div>
                    <div class="col-md-12"><label style="font-style: italic" class="labels"><i style="color:orange" class="fas fa-lightbulb"></i>Nội Dung Chính</label><input type="text" class="form-control" name ="noi_dung_chinh" required ></div>
                    <div class="col-md-12"><label style="font-style: italic" class="labels"><i style="color:red" class="fas fa-stopwatch"></i>Thời Gian Dự Kiến:</label><input type="text" class="form-control" name ="thoi_gian_du_kien" required></div>
                    <div class="col-md-12"><label style="font-style: italic" class="labels"><i style="color:navy" class="fas fa-comment-dots"></i>Ghi Chú:</label><textarea class="form-control"name ="ghi_chu" required></textarea></div>
                  
               
                </div>
               
                <div class="mt-5 text-center"><button onclick="testAlertDialog()" style="width: 100%;padding:10px" class="btn btn-primary profile-button" type="submit">Gửi Yêu Cầu</button></div>
                <div ><label style="font-style: italic;text-align: center;" >  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  -- --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --</label></div>
                </form>
               
            </div>
           <div ><a href="admin-thongkedexuatchuongtrinhlienketcontroller"><button  style=" width: 100%;border: 2px solid green;padding:10px;border-radius: 4px;box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);"> Danh Sách Đề Xuất Đã Gửi </button></a></div>
        </div>
        
    </div>
    
</div>
                
                
                </div>
             </section>   
</div>



<script type="text/javascript">
 
         function testAlertDialog()  {
 
              alert("Đã gửi yêu cầu đề xuất!");
         }
 
      </script>









</body>
</html>