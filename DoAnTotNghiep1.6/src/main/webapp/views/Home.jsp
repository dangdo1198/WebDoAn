<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chủ</title>
</head>
<body>


	<div class="content-wrapper">
		<!-- Content Header (Page header) -->

		<!-- /.content-header -->
		<section class="content">


			<div class="container">
				<div class="card">
					<div class="container-fliud">
						<div class="wrapper row">

							<div class="details col-md-7">

								<h3
									style="padding-top: 12px; text-align: center; font-style: bold; color: blue;">
									NGHIÊN CỨU & PHÁT TRIỂN KHOA HỌC</h3>

								<img src="<c:url value='/template/image/randd.png'  />"
									alt="AdminLTE Logo" class="img-responsive" alt="Cinque Terre"
									width="550" height="300" style="opacity: .8" />
								<h5 style="padding-top: 12px; font-style: bold; color: blue;">
									<u>Kế hoạch hoạt động</u>
								</h5>
								<p>1. Triển khai đăng ký đề tài nghiên cứu khoa học.</p>
								<p style="color: gray; font-style: italic">Thời gian:
									01/09/2021 -> 30/09/2021 (Sinh viên thực hiện)</p>
								<p>2. Tổng hợp và phê duyệt đề tài.</p>
								<p style="color: gray; font-style: italic">Thời gian:
									01/10/2021 -> 05/10/2021 (Cán bộ giảng viên phụ trách)</p>
								<p>3. Thực hiện và triển khai đề tài.</p>
								<p style="color: gray; font-style: italic">Thời gian:
									06/10/2021 -> 31/12/2021(Sinh viên thực hiện đề tài)</p>
								<p>4. Hoàn tất và nộp báo cáo đề tài nghiên cứu tới cán bộ
									phụ trách.</p>
								<p style="color: gray; font-style: italic">Thời gian:
									01/01/2022 -> 05/01/2022 (Sinh viên)</p>
								<p>5. Phân công cán bộ phản biện đề tài của sinh viên.</p>
								<p style="color: gray; font-style: italic">Thời gian:
									06/01/2022 (Cán bộ quản lý)</p>
								<p>6. Hoàn thiện và chỉnh sửa báo cáo đề tài nghiên cứu.</p>
								<p style="color: gray; font-style: italic">Thời gian:
									07/01/2022 -> 10/01/2022 (Sinh viên)</p>
								<p>7. Phân công hội đồng chấm thi đề tài nghiên cứu phát
									triển khoa học.</p>
								<p style="color: gray; font-style: italic">Thời gian:
									11/01/2022 (Cán bộ quản lý)</p>
								<p>8. Tổ chức thi và chấm điểm đề tài.</p>
								<p style="color: gray; font-style: italic">Thời gian:
									12/01/2022 & 13/01/2022 (Sinh viên và hội đồng khảo thí)</p>


							</div>




							<div class="details col-md-5">
							<h3
										style="padding-top: 12px; text-align: center; font-size: x-large; font-style: italic; color: orange;">
										Cơ hội việc làm sinh viên</h3>
							
								<div id="scrollhome">
									
									<div class="col-md-12">


										<div class="table-responsive">
											<table id="mytable" class="table table-bordred table-striped">
												<thead>



												</thead>
												<tbody id="myTable1">
													<c:forEach var="i" items="${listTinTuyenDung}">
														<tr>
															<td style="font-style: bold; color: black"><b>${i.tenDoanhNghiep}</b><br>
															<i style="color: yellow; font-size: small;"
																class="fas fa-star"></i><i
																style="color: yellow; font-size: small;"
																class="fas fa-star"></i><i
																style="color: yellow; font-size: small;"
																class="fas fa-star"></i></br></td>
															<td style="font-size: italic; color: gray">${i.tieuDe}</td>
															<td style="text-align: center;"><a
																href="admin-xemchitiettintuyendungdoanhnghiepcontroller?id=${i.id }"><i
																	class="fas fa-info-circle"></i></a></td>




															<td><a
																href="admin-detailupdatetintuyendungcontroller?id=${i.id}"><p
																		data-placement="top" data-toggle="tooltip"
																		title="Edit">
																		<button class="btn btn-primary btn-xs"
																			data-title="Edit" data-toggle="modal"
																			data-target="#edit">
																			<i class="fas fa-edit"></i>
																		</button>
																	</p></a></td>



														</tr>

													</c:forEach>





												</tbody>

											</table>

											<div class="clearfix"></div>


										</div>

									</div>
								</div>
								<h3 style="padding-top: 20px; color: green; text-align: center">LIÊN
									KẾT DOANH NGHIỆP</h3>
								<img src="<c:url value='/template/image/hoptacdn.png'  />"
									alt="AdminLTE Logo" class="img-responsive" alt="Cinque Terre"
									width="380" height="200" style="opacity: .8" />
								<h5 style="color: #FF0000; padding-top: 10px">
									<u>Sự kiện sắp tới</u>
								</h5>
								<div id="scrollhome1">
								<div class="table-responsive">
									<table id="mytable" class="table table-bordred table-striped">
										<thead>



										</thead>
										<tbody id="myTable1">
											<c:forEach var="i" items="${listCtlkDongY}">
												<tr>

													<td style="font-size: italic; color: gray">${i.tenChuongTrinh}</td>
													<td style="text-align: center"><a
														href="admin-detailxemchitietchuongtrinhlienketcontroller?id=${i.id }"><i
															class="fas fa-eye"></i></a></td>








												</tr>

											</c:forEach>





										</tbody>

									</table>

									<div class="clearfix"></div>


								</div>
								</div>
								<h5 style="color:blue; padding-top:15px"><u>Một số doanh nghiệp hợp tác nổi bật</u></h5>
								<img src="<c:url value='/template/image/logodep.png'  />"
									alt="AdminLTE Logo" class="img-responsive" alt="Cinque Terre"
									width="380" height="200" style="opacity: .8" />

							</div>






		

						</div>



					</div>
				</div>
			</div>
	</div>





	</section>
	</div>


	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script>
		$(document)
				.ready(
						function() {
							$("#myInput")
									.on(
											"keyup",
											function() {
												var value = $(this).val()
														.toLowerCase();
												$("#myTable1 tr")
														.filter(
																function() {
																	$(this)
																			.toggle(
																					$(
																							this)
																							.text()
																							.toLowerCase()
																							.indexOf(
																									value) > -1)
																});
											});
						});
	</script>










</body>
</html>