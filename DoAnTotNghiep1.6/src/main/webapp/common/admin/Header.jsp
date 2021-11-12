<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<div class="preloader flex-column justify-content-center align-items-center">
    <img class="animation__shake" src="<c:url value='/template/image/logomatma2.png'  />" alt="KMA" height="200" width="200">
  </div>
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="admin-home" role="button"><i class="fas fa-bars"></i></a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="admin-home1" class="nav-link">Home</a>
      </li>
      
    </ul>

    <!-- Right navbar links -->
    <ul class="navbar-nav ml-auto">
      <!-- Navbar Search -->
      

      <!-- Messages Dropdown Menu -->
      
      <!-- Notifications Dropdown Menu -->
      
      <li class="nav-item">
        <a class="nav-link" data-widget="fullscreen" href="#" role="button">
          <i class="fas fa-expand-arrows-alt"></i>
        </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" data-widget="control-sidebar" data-slide="true" href="#" role="button">
          <i class="fas fa-th-large"></i>
        </a>
      </li>
    </ul>
    
    
  </nav>
  
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
  <ul class="navbar-nav">
  
  <div id="slideshow">
   <div class="slide-wrapper">
   
     
       <div class="slide"><img src="<c:url value='/template/image/NCKH4.png'/>" /></div>
       <div class="slide"><img src="<c:url value='/template/image/hvmm5.png'/>" /></div>
       <div class="slide"><img src="<c:url value='/template/image/htdn.png'/>" /></div>
     
   </div>
 </div>
  
  </ul>
  </nav>
  
  
  

  <!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" ><i style="color: green" class="fas fa-database"></i></a>
        
        
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a style="font-style: italic" class="nav-link" data-widget="navbar-search" href="#" role="button">Tìm kiếm ...</a>
      </li>
      
    </ul>
    

    <!-- Right navbar links -->
    <ul class="navbar-nav ml-auto">
      <!-- Navbar Search -->
      <li class="nav-item">
        <a class="nav-link" data-widget="navbar-search" href="#" role="button">
          <i class="fas fa-search"></i>
        </a>
        <div class="navbar-search-block">
          <form class="form-inline">
            <div class="input-group input-group-sm">
              <input id="myInput" class="form-control form-control-navbar" type="search" placeholder="Search" aria-label="Search">
              <!-- phan dat id cho input de ho tro tim kiem voi doan ma jqrery -->
              <div class="input-group-append">
                <button class="btn btn-navbar" type="submit">
                  <i class="fas fa-search"></i>
                </button>
                <button class="btn btn-navbar" type="button" data-widget="navbar-search">
                  <i class="fas fa-times"></i>
                </button>
              </div>
            </div>
          </form>
        </div>
      </li>

      <!-- Messages Dropdown Menu -->
      
      <!-- Notifications Dropdown Menu -->
      
      
    </ul>
  </nav>