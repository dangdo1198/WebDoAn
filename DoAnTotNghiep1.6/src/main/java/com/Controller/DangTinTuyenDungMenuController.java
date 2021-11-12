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
@WebServlet("/admin-dangtintuyendungmenucontroller")
public class DangTinTuyenDungMenuController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TinTuyenDungDAO tinTuyenDungDao1 = new TinTuyenDungDAO();
		List<TinTuyenDung> listTinTuyenDung = tinTuyenDungDao1.getAllTinTuyenDung();
		req.setAttribute("listTinTuyenDung", listTinTuyenDung);
		RequestDispatcher dispatcher = req.getRequestDispatcher("views/DangTinTuyenDung.jsp");
			dispatcher.forward(req, resp);
		 
		
	}

}
