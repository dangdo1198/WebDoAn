package com.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.CTLKDoanhNghiepDAO;

@WebServlet("/admin-xoachuongtrinhlienketcontroller")
public class XoaCTLKController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		CTLKDoanhNghiepDAO ctlkDao = new CTLKDoanhNghiepDAO();
		int id = Integer.parseInt(req.getParameter("id"));
		boolean check = ctlkDao.deleteCTLK(id);

		if (check) {
			resp.sendRedirect("admin-quanlychuongtrinhlienketmenucontroller");

		} else {

			RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/QuanLyCTLK.jsp");
			requestDispatcher.forward(req, resp);
		}
	}

}
