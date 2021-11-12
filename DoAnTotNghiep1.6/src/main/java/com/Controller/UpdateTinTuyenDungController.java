package com.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.TinTuyenDungDAO;
import com.Model.TinTuyenDung;
@WebServlet("/admin-updatetintuyendungcontroller")
public class UpdateTinTuyenDungController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TinTuyenDung tinTuyenDung = new TinTuyenDung();
		int id= Integer.parseInt(req.getParameter("id"));
		String tendoanhnghiep = req.getParameter("ten_doanh_nghiep");
		String tieude = req.getParameter("tieu_de");
		String noidung =req.getParameter("noi_dung");
		String sodienthoai = req.getParameter("so_dien_thoai");
		String email = req.getParameter("email");
		String website = req.getParameter("website");
		
		tinTuyenDung.setId(id);
		tinTuyenDung.setTenDoanhNghiep(tendoanhnghiep);
		tinTuyenDung.setTieuDe(tieude);
		tinTuyenDung.setNoiDung(noidung);
		tinTuyenDung.setSoDienThoai(sodienthoai);
		tinTuyenDung.setEmail(email);
		tinTuyenDung.setWebsite(website);
		
		
		
		
		
		
	
		boolean check = new TinTuyenDungDAO().updateTinTuyenDung(tinTuyenDung);
		
		if(check) {
			
			resp.sendRedirect("admin-dangtintuyendungmenucontroller");
		}
		else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/DangTinTuyenDung.jsp");
			requestDispatcher.forward(req, resp);
			
		}
	}

}
