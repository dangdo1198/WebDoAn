package com.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.DAO.TinTuyenDungDAO;
@WebServlet("/admin-xoatintuyendungcontroller")
public class XoaTinTuyenDungController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TinTuyenDungDAO tinTuyenDungDao = new TinTuyenDungDAO();
		int id = Integer.parseInt(req.getParameter("id"));
		boolean check = tinTuyenDungDao.deleteTinTuyenDung(id);

		if (check) {
			resp.sendRedirect("admin-dangtintuyendungmenucontroller");

		} else {

			RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/DangTinTuyenDung.jsp");
			requestDispatcher.forward(req, resp);
		}
	}

}
