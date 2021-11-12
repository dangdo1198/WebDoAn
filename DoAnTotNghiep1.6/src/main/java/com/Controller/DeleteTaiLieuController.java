package com.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.TaiLieuDAO;
@WebServlet("/admin-deletetailieucontroller")
public class DeleteTaiLieuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		TaiLieuDAO tailieu = new TaiLieuDAO();
		int id = Integer.parseInt(req.getParameter("id"));
		boolean check = tailieu.deleteTaiLieu(id);
	
		if(check) {
			resp.sendRedirect("admin-quanlytailieucontroller");
			
		}
		else {
			
			
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/QuanLyTaiLieu.jsp");
			requestDispatcher.forward(req, resp);
		}
		
	}

}
