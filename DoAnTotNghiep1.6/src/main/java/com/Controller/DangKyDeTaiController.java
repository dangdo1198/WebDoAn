package com.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.DeTaiDAO;
import com.Model.DeTaiNghienCuu;

@WebServlet("/admin-dangkydetaicontroller")
public class DangKyDeTaiController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DeTaiDAO detaiDao = new DeTaiDAO();
		DeTaiNghienCuu deTai = new DeTaiNghienCuu();

		String hovaten = req.getParameter("ho_va_ten");
		String masinhvien = req.getParameter("ma_sinh_vien");
		String khoa = req.getParameter("khoa");
		String tendetai = req.getParameter("ten_de_tai");
		String linhvuc = req.getParameter("linh_vuc");
		String thoigiandukien = req.getParameter("thoi_gian_du_kien");
		String kinhphi = req.getParameter("kinh_phi");
		String ghichu = req.getParameter("ghi_chu");

		deTai.setHoVaTen(hovaten);
		deTai.setMaSV(masinhvien);
		deTai.setKhoa(khoa);
		deTai.setTenDeTai(tendetai);
		deTai.setLinhVuc(linhvuc);
		deTai.setThoiGianDuKien(thoigiandukien);
		deTai.setGhiChu(ghichu);
		deTai.setKinhPhi(kinhphi);

		detaiDao.addDeTai(deTai);
		resp.sendRedirect("admin-detaidadangkycontroller");
	}

}
