package com.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.CTLKDoanhNghiepDAO;
import com.DAO.TinTuyenDungDAO;
import com.Model.CTLKDoanhNghiep;
import com.Model.TinTuyenDung;
@WebServlet("/admin-home")
public class Home extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		
		TinTuyenDungDAO tinTuyenDungDao1 = new TinTuyenDungDAO();
		List<TinTuyenDung> listTinTuyenDung = tinTuyenDungDao1.getAllTinTuyenDung();
		req.setAttribute("listTinTuyenDung", listTinTuyenDung);
		
		CTLKDoanhNghiepDAO ctlkDao = new CTLKDoanhNghiepDAO();
		List<CTLKDoanhNghiep> listCtlkDongY = ctlkDao.getAllCTLKDongY();
		req.setAttribute("listCtlkDongY", listCtlkDongY);
		
		RequestDispatcher rd =req.getRequestDispatcher("views/Home.jsp");
		rd.forward(req, resp);
	}
	

}
