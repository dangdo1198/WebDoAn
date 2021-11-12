package com.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.DeTaiDAO;

@WebServlet("/admin-xoadetaicontroller")
public class XoaDeTaiController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DeTaiDAO detaiDao = new DeTaiDAO();
		int id = Integer.parseInt(req.getParameter("id"));
		boolean check = detaiDao.deleteDeTai(id);

		if (check) {
			resp.sendRedirect("admin-formpheduyetdetaicontroller");

		} else {

			RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/FormPheDuyetDeTai.jsp");
			requestDispatcher.forward(req, resp);
		}

	}

}
