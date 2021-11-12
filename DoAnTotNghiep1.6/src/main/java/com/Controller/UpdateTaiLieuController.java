package com.Controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.TaiLieuDAO;
import com.Model.TaiLieuNghienCuu;
@WebServlet("/admin-updatetailieucontroller")
public class UpdateTaiLieuController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		TaiLieuNghienCuu taiLieu = new TaiLieuNghienCuu();
		int id= Integer.parseInt(req.getParameter("id"));
		String tentailieu = req.getParameter("ten_tai_lieu");
		String tacgia= req.getParameter("ten_tac_gia");
		String linhvuc =req.getParameter("linh_vuc");
//		int userid= Integer.parseInt(req.getParameter("user_id"));
		String thoigian =req.getParameter("thoi_gian");
		String linktai =req.getParameter("link_tai");
		
		
		
		
		
		taiLieu.setId(id);
		taiLieu.setTenTaiLieu(tentailieu);
		taiLieu.setTacGia(tacgia);
		taiLieu.setLinhVuc(linhvuc);
//		taiLieu.setUserId(userid);
		taiLieu.setThoiGian(thoigian);	
		taiLieu.setLinkTai(linktai);
		
		
		boolean check = new TaiLieuDAO().updateTaiLieu(taiLieu);
		
		if(check) {
			
			resp.sendRedirect("admin-quanlytailieucontroller");
		}
		else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/QuanLyTaiLieu.jsp");
			requestDispatcher.forward(req, resp);
			
		}
	
	}

}
