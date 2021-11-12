package com.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.TaiLieuDAO;
import com.DAO.TinTuyenDungDAO;
import com.Model.TaiLieuNghienCuu;
import com.Model.TinTuyenDung;
@WebServlet("/admin-detailupdatetintuyendungcontroller")
public class DetailUpdateTinTuyenDungController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
		TinTuyenDungDAO tinTuyenDungDao = new TinTuyenDungDAO();
		
		int id= Integer.parseInt(req.getParameter("id"));
		TinTuyenDung tinTuyenDung = tinTuyenDungDao.getTinTuyenDungById(id);
		
		req.setAttribute("detailTinTuyenDung", tinTuyenDung);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/DetailUpdateTinTuyenDung.jsp");
		requestDispatcher.forward(req, resp);
		
		
		
		
	}

}
