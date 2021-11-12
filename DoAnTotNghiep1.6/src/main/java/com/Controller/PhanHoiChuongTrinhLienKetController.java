package com.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.CTLKDoanhNghiepDAO;
import com.DAO.DeTaiDAO;
import com.Model.CTLKDoanhNghiep;
import com.Model.DeTaiNghienCuu;
@WebServlet("/admin-phanhoichuongtrinhlienketcontroller")
public class PhanHoiChuongTrinhLienKetController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CTLKDoanhNghiep ctlk = new CTLKDoanhNghiep();
		int id = Integer.parseInt(req.getParameter("id"));
		String tenchuongtrinh = req.getParameter("ten_chuong_trinh");
		String tendoanhnghiep = req.getParameter("ten_doanh_nghiep");
		String nguoidaidien = req.getParameter("nguoi_dai_dien");
		String chucvu = req.getParameter("chuc_vu");
		String thoigiandukien = req.getParameter("thoi_gian_du_kien");
		String noidungchinh = req.getParameter("noi_dung_chinh");
		String trangthaixacnhan = req.getParameter("trang_thai_xac_nhan");
		String ghichu = req.getParameter("ghi_chu");
		String lydo = req.getParameter("ly_do");
		
		ctlk.setId(id);
		ctlk.setTenChuongTrinh(tenchuongtrinh);
		ctlk.setTenDoanhNghiep(tendoanhnghiep);
		ctlk.setNguoiDaiDien(nguoidaidien);
		ctlk.setChucVu(chucvu);
		ctlk.setThoiGianDuKien(thoigiandukien);
		ctlk.setNoiDungChinh(noidungchinh);
		ctlk.setTrangThaiXacNhan(trangthaixacnhan);
		ctlk.setGhiChu(ghichu);
		ctlk.setLyDo(lydo);

		

		boolean check = new CTLKDoanhNghiepDAO().phanHoiCTLK(ctlk);

		if (check) {

			try {
				resp.sendRedirect("admin-quanlychuongtrinhlienketmenucontroller");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/QuanLyCTLK.jsp");
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

