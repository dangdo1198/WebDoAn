package com.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.DAO.CTLKDoanhNghiepDAO;
import com.Model.CTLKDoanhNghiep;
@WebServlet("/admin-dexuatchuongtrinhlienketcontroller")
public class DeXuatChuongTrinhLienKetController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		CTLKDoanhNghiepDAO ctlkDao = new CTLKDoanhNghiepDAO();
		CTLKDoanhNghiep ctlk = new CTLKDoanhNghiep();
		
		String tenchuongtrinh = req.getParameter("ten_chuong_trinh");
		String tendoanhnghiep = req.getParameter("ten_doanh_nghiep");
		String nguoidaidien = req.getParameter("nguoi_dai_dien");
		String chucvu = req.getParameter("chuc_vu");
		String noidungchinh = req.getParameter("noi_dung_chinh");
		String thoigiandukien = req.getParameter("thoi_gian_du_kien");
		String ghichu = req.getParameter("ghi_chu");
		
		ctlk.setTenChuongTrinh(tenchuongtrinh);
		ctlk.setTenDoanhNghiep(tendoanhnghiep);
		ctlk.setNguoiDaiDien(nguoidaidien);
		ctlk.setChucVu(chucvu);
		ctlk.setNoiDungChinh(noidungchinh);
		ctlk.setThoiGianDuKien(thoigiandukien);
		ctlk.setGhiChu(ghichu);

		ctlkDao.addCTLK(ctlk);
		resp.sendRedirect("admin-formdexuatchuongtrinhlienketmenucontroller");
	}

}
