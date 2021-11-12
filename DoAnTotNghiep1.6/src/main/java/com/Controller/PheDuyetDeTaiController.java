package com.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.DeTaiDAO;
import com.Model.DeTaiNghienCuu;

@WebServlet("/admin-pheduyetdetaicontroller")
public class PheDuyetDeTaiController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DeTaiNghienCuu deTai = new DeTaiNghienCuu();
		int id = Integer.parseInt(req.getParameter("id"));
		String hovaten = req.getParameter("ho_va_ten");
		String tendetai = req.getParameter("ten_de_tai");
		String trangthaiduyet = req.getParameter("trang_thai_duyet");
		String masinhvien = req.getParameter("ma_sinh_vien");
		String khoa = req.getParameter("khoa");
		String linhvuc = req.getParameter("linh_vuc");
		String thoigiandukien = req.getParameter("thoi_gian_du_kien");
		String kinhphi = req.getParameter("kinh_phi");
		String ghichu = req.getParameter("ghi_chu");
		String lydo = req.getParameter("ly_do");
		String tinhtrang = req.getParameter("tinh_trang");
		String diemso = req.getParameter("diem_so");
		String danhgia = req.getParameter("danh_gia");

		deTai.setId(id);
		deTai.setHoVaTen(hovaten);
		deTai.setTenDeTai(tendetai);
		deTai.setTrangThaiDuyet(trangthaiduyet);
		deTai.setMaSV(masinhvien);
		deTai.setKhoa(khoa);
		deTai.setLinhVuc(linhvuc);
		deTai.setThoiGianDuKien(thoigiandukien);
		deTai.setKinhPhi(kinhphi);
		deTai.setGhiChu(ghichu);
		deTai.setTinhTrang(tinhtrang);
		deTai.setDiemSo(diemso);
		deTai.setDanhGia(danhgia);
		deTai.setLyDo(lydo);

		boolean check = new DeTaiDAO().pheDuyetDeTai(deTai);

		if (check) {

			try {
				resp.sendRedirect("admin-formpheduyetdetaicontroller");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/FormPheDuyetDeTai.jsp");
			try {
				requestDispatcher.forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
