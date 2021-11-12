package com.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.TaiLieuDAO;
import com.Model.TaiLieuNghienCuu;
@WebServlet("/admin-detailtailieucontroller")
public class DetailTaiLieuByIdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		TaiLieuDAO taiLieuDao = new TaiLieuDAO();
		
		int id= Integer.parseInt(req.getParameter("id"));
		TaiLieuNghienCuu taiLieu = taiLieuDao.getTaiLieuById(id);
		
		req.setAttribute("detailTaiLieu", taiLieu);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/DetailUpdateTaiLieu.jsp");
		requestDispatcher.forward(req, resp);
		

		
	}

}
