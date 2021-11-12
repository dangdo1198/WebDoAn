 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a href="index3.html" class="brand-link">
      
      <img src="<c:url value='/template/image/logomatma1.png'  />"alt="AdminLTE Logo" class="img-responsive" alt="Cinque Terre" width="60" height="60" style="opacity: .8" />
      <span class="brand-text font-weight-light">KMA ACADEMY</span>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
      <!-- Sidebar user panel (optional) -->
      

      
     

      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
               <li class="nav-item">
            <a href="admin-home1" class="nav-link">
              <i class="nav-icon fas fa-home"></i>
              <p>
                Trang chủ
                
              </p>
            </a>
            
          </li> 
               
               <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-cog"></i>
              <p>
                Quản lý hệ thống
                <i class="fas fa-angle-left right"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="admin-quanlynguoidungmenucontroller" class="nav-link">
                  
                  <p>Quản lý người dùng</p>
                </a>
              </li>
              
              
              
              
            </ul>
          </li> 
          
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-user"></i>
              <p>
                Cập nhật tài khoản
                <i class="fas fa-angle-left right"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              
              <li class="nav-item">
                <a href="pages/examples/profile.html" class="nav-link">
                  
                  <p>Chỉnh sửa thông tin</p>
                </a>
              </li>
              
              
              
            </ul>
          </li> 
               
         <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-microscope"></i>
              <p>
                Nghiên cứu khoa học
                <i class="fas fa-angle-left right"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              
              <li class="nav-item">
                <a href="admin-quanlytailieucontroller" class="nav-link">
                  
                  <p>Quản lý tài liệu</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="admin-detainghiencuucontroller" class="nav-link">
                  <i class="far fa-document"></i>
                  <p>Danh sách đề tài</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="admin-formpheduyetdetaicontroller" class="nav-link">
                  <i class="far fa-document"></i>
                  <p>Phê duyệt đề tài</p>
                </a>
              </li>
              <li class="nav-header">----------------------------------------------</li>
              <li class="nav-item">
                <a href="admin-tailieunghiencuucontroller" class="nav-link">
                
                  <p>Tài liệu nghiên cứu </p>
                </a>
              </li>
              <li class="nav-item">
                <a href="admin-formdangkydetaicontroller" class="nav-link">
                  <p>Đăng ký đề tài</p>
                </a>
              </li>
              
              <li class="nav-item">
                <a href="admin-detaidadangkymenucontroller" class="nav-link">      
                  <p>Đề tài đã đăng ký</p>
                </a>
              </li>
              
              <li class="nav-item">
                <a href="admin-detaidaduocduyetcontroller" class="nav-link">
                  
                  <p>Đề tài được duyệt</p>
                </a>
              </li>
              
              <li class="nav-item">
                <a href="admin-detaibihuycontroller" class="nav-link">
                  
                  <p>Đề tài bị hủy</p>
                </a>
              </li>
              
              
            </ul>
          </li> 
         
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-handshake"></i>
              <p>
                Hợp tác doanh nghiệp
                <i class="fas fa-angle-left right"></i>
               
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="admin-danhsachdoanhnghiepcontroller" class="nav-link">
                  
                  <p>Danh sách doanh nghiệp</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="admin-quanlychuongtrinhlienketmenucontroller" class="nav-link">       
                  <p>Quản lý CTLKDN</p>
                </a>
              </li>
              
              <li class="nav-item">
                <a href="admin-formdexuatchuongtrinhlienketmenucontroller" class="nav-link">
                  
                  <p>Đề xuất CTLK</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="admin-dangtintuyendungmenucontroller" class="nav-link">
                  
                  <p>Đăng tin tuyển dụng</p>
                </a>
              </li>
              
            </ul>
          </li>
          
          <li class="nav-item">
            <a href="admin-dangxuatcontroller" class="nav-link">
               <i class="nav-icon fas fa-sign-out-alt"></i>
              <p>
                Đăng xuất
                <i class="fas fa-angle-left right"></i>
              </p>
            </a>
            
          </li>
          
          
        
          
          
          
          
          
         
          
          
          
        </ul>
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
  </aside>