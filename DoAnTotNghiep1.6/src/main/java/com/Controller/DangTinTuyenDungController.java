package com.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.DAO.TinTuyenDungDAO;
import com.Model.TinTuyenDung;
@WebServlet("/admin-dangtintuyendungcontroller")
public class DangTinTuyenDungController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TinTuyenDungDAO tinTuyenDungDao = new TinTuyenDungDAO();
		TinTuyenDung tinTuyenDung = new TinTuyenDung();
		
		String tendoanhnghiep = req.getParameter("ten_doanh_nghiep");
		String nguoidang = req.getParameter("nguoi_dang");		
		String chucvu = req.getParameter("chuc_vu");
		String sodienthoai = req.getParameter("so_dien_thoai");
		String email = req.getParameter("email");
		String website = req.getParameter("website");
		String tieude = req.getParameter("tieu_de");
		String noidung = req.getParameter("noi_dung");
		
		tinTuyenDung.setTenDoanhNghiep(tendoanhnghiep);
		tinTuyenDung.setNguoiDang(nguoidang);
		tinTuyenDung.setChucVu(chucvu);
		tinTuyenDung.setSoDienThoai(sodienthoai);
		tinTuyenDung.setEmail(email);
		tinTuyenDung.setWebsite(website);
		tinTuyenDung.setTieuDe(tieude);
		tinTuyenDung.setNoiDung(noidung);

		tinTuyenDungDao.addTinTuyenDung(tinTuyenDung);
		
		
		TinTuyenDungDAO tinTuyenDungDao1 = new TinTuyenDungDAO();
		List<TinTuyenDung> listTinTuyenDung = tinTuyenDungDao1.getAllTinTuyenDung();
		req.setAttribute("listTinTuyenDung", listTinTuyenDung);
		RequestDispatcher dispatcher = req.getRequestDispatcher("views/DangTinTuyenDung.jsp");
			dispatcher.forward(req, resp);

	
		
	}
}


