package com.Controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.DAO.TaiLieuDAO;
import com.Model.TaiLieuNghienCuu;
@WebServlet("/admin-addtailieucontroller")
public class AddTaiLieuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		
		TaiLieuDAO taiLieuDao = new TaiLieuDAO();
		TaiLieuNghienCuu taiLieu = new TaiLieuNghienCuu();
			
			String tentailieu = req.getParameter("ten_tai_lieu");
			 String tentacgia  =req.getParameter("ten_tac_gia");
			 String linhvuc =req.getParameter("linh_vuc");
//			 int userid = Integer.parseInt(req.getParameter("id_user"));
		
			 String thoigian =req.getParameter("thoi_gian");
			 String linktai =req.getParameter("link_tai");
			
				 
				 
				
			
		
			taiLieu.setTenTaiLieu(tentailieu);
			 taiLieu.setTacGia(tentacgia);
			 taiLieu.setLinhVuc(linhvuc);
//		 taiLieu.setUserId(userid);
			 taiLieu.setThoiGian(thoigian);
			 taiLieu.setLinkTai(linktai);
		
		 
		 taiLieuDao.addTaiLieu(taiLieu);
		resp.sendRedirect("admin-quanlytailieucontroller");
		
	
	}
	

}
