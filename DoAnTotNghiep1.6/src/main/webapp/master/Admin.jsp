<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/Taglib.jsp" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">


<!-- phan style cho bang o hai muc de tai duoc phe duyet va de tai bi huy  -->
<style>
.styled-tablevip th,
.styled-tablevip td {
    padding: 12px 30px;
}

.styled-tablevip {
    border-collapse: collapse;
    margin: 30px 0;
    font-size: 0.9em;
    font-family: sans-serif;
    min-width: 400px;
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
}

.styled-tablevip tbody tr {
    border-bottom: 3px solid #dddddd;
}

.styled-tablevip tbody tr:nth-of-type(even) {
    background-color: #f3f3f3;
}

.styled-tablevip tbody tr:last-of-type {
    border-bottom: 4px solid #009879;
}

.styled-tablevip thead tr.active-row {
    font-weight: bold;
    color: #009879;
}
</style>


<!-- style dưới là phần của slide ở admin home -->
<!-- body {
   padding: 1%;
   text-align: center;
 } điều chỉnh độ rộng của body -->
 
<style>

 

#slideshow {
   overflow: hidden;
   height: 100px;
   width: 950px;
   margin: 0 auto;
 }
.slide-wrapper {
   width: 2850px;
   -webkit-animation: slide 14s ease infinite;
 }
.slide {
   float: left;
   height: 100px;
   width: 950px;
 }
@-webkit-keyframes slide {
   10% {margin-left: 0px;}
   20% {margin-left: -950px;}
   40% {margin-left: -950px;}
   60% {margin-left: -1900px;}
   80% {margin-left: -950px;}
 }

</style>

<!-- css cho phan tin tuyen dung -->
<style>


.dautintuyendung {
    color: #36A0FF;
    font-size: 27px;
    padding: 10px;
}

.bigicon {
    font-size: 35px;
    color: #36A0FF;
}
</style>

<!-- css phan tin tuyen dung -->


<style>

input[type="text"] {
  width: 100%;
  border: 2px solid #aaa;
  border-radius: 4px;
  margin: 8px 0;
  outline: none;
  padding: 8px;
  box-sizing: border-box;
  transition: 0.3s;
}

input[type="text"]:focus {
  border-color: dodgerBlue;
  box-shadow: 0 0 8px 0 dodgerBlue;
 
}

.inputWithIcon input[type="text"] {
  padding-left: 40px;
}

.inputWithIcon {
  position: relative;
}

.inputWithIcon i {
  position: absolute;
  left: 0;
  top: 2px;
  padding: 9px 8px;
  color: #aaa;
  transition: 0.3s;
}

.inputWithIcon input[type="text"]:focus + i {
  color: dodgerBlue;
}

.inputWithIcon.inputIconBg i {
  background-color: #aaa;
  color: #fff;
  padding: 9px 4px;
  border-radius: 4px 0 0 4px;
}

.inputWithIcon.inputIconBg input[type="text"]:focus + i {
  color: #fff;
  background-color: dodgerBlue;
}


</style>

<style type="text/css">

 #scrollhome{
            border:0.1px solid #808080;
            width:370px;
            height:350px;
            overflow-x:hidden;
            overflow-y:auto;
        }
        
        #scrollhome1{
            border:0.1px solid #808080;
            width:370px;
            height:200px;
            overflow-x:hidden;
            overflow-y:auto;
        }
        
   #scrollhome2{
   			margin-left:10px;
   			background: blue;
            border:0.1px solid #808080;
            width:950px;
            height:200px;
            overflow-x:hidden;
            overflow-y:auto;
        }
</style>






    <title>
        <dec:title default="Trang chủ" />
    </title>
    
  
  
  
  

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
    <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="<c:url value='/template/plugins/fontawesome-free/css/all.min.css' />" />
  <!-- Tempusdominus Bootstrap 4 -->
  <link rel="stylesheet" href="<c:url value='/template/plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css' />" />
  <!-- iCheck -->
  <link rel="stylesheet" href="<c:url value='/template/plugins/icheck-bootstrap/icheck-bootstrap.min.css' />" />
  <!-- JQVMap -->
  <link rel="stylesheet" href="<c:url value='/template/plugins/jqvmap/jqvmap.min.css' />" />
  <!-- Theme style -->
  <link rel="stylesheet" href="<c:url value='/template/dist/css/adminlte.min.css' />" />
  <!-- overlayScrollbars -->
  <link rel="stylesheet" href="<c:url value='/template/plugins/overlayScrollbars/css/OverlayScrollbars.min.css' />" />
  <!-- Daterange picker -->
  <link rel="stylesheet" href="<c:url value='/template/plugins/daterangepicker/daterangepicker.css' />" />
  <!-- summernote -->
  <link rel="stylesheet" href="<c:url value='/template/plugins/summernote/summernote-bs4.min.css' />" />
  
  
  
  
  
  
  

</head>

<body class="hold-transition sidebar-mini layout-fixed">
<div class="wrapper">

<div class="preloader flex-column justify-content-center align-items-center">
    <img class="animation__shake" src="<c:url value='/template/image/logomatma2.png' />" alt="KMA" height="200" width="200">
  </div>
    
				<!-- header -->
                <%@ include file="/common/admin/Header.jsp" %>
                <!-- header -->


       			 <!-- menu -->
        		<%@ include file="/common/admin/Menu.jsp" %>
        		<!-- menu -->

      

                
                <dec:body />
                
               
            

            <!-- footer -->
            <%@ include file="/common/admin/Footer.jsp" %>
            <!-- footer -->

       
		<aside class="control-sidebar control-sidebar-dark">
    	<!-- Control sidebar content goes here -->
  		</aside>
   





    


    

</div>


<!-- jQuery -->
<script src="<c:url value='/template/plugins/jquery/jquery.min.js' />"></script>
<!-- jQuery UI 1.11.4 -->
<script src="<c:url value='/template/plugins/jquery-ui/jquery-ui.min.js' />"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
  $.widget.bridge('uibutton', $.ui.button)
</script>
<!-- Bootstrap 4 -->
<script src="<c:url value='/template/plugins/bootstrap/js/bootstrap.bundle.min.js' />"></script>
<!-- ChartJS -->
<script src="<c:url value='/template/plugins/chart.js/Chart.min.js' />"></script>
<!-- Sparkline -->
<script src="<c:url value='/template/plugins/sparklines/sparkline.js' />"></script>
<!-- JQVMap -->
<script src="<c:url value='/template/plugins/jqvmap/jquery.vmap.min.js' />"></script>
<script src="<c:url value='/template/plugins/jqvmap/maps/jquery.vmap.usa.js' />"></script>
<!-- jQuery Knob Chart -->
<script src="<c:url value='/template/plugins/jquery-knob/jquery.knob.min.js' />"></script>
<!-- daterangepicker -->
<script src="<c:url value='/template/plugins/moment/moment.min.js' />"></script>
<script src="<c:url value='/template/plugins/daterangepicker/daterangepicker.js' />"></script>
<!-- Tempusdominus Bootstrap 4 -->
<script src="<c:url value='/template/plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js' />"></script>
<!-- Summernote -->
<script src="<c:url value='/template/plugins/summernote/summernote-bs4.min.js' />"></script>
<!-- overlayScrollbars -->
<script src="<c:url value='/template/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js' />"></script>
<!-- AdminLTE App -->
<script src="<c:url value='/template/dist/js/adminlte.js' />"></script>
<!-- AdminLTE for demo purposes -->
<script src="<c:url value='/template/dist/js/demo.js' />"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="<c:url value='/template/dist/js/pages/dashboard.js' />"></script>

</body>

</html>