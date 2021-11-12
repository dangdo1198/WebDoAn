package com.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.DeTaiDAO;
import com.Model.DeTaiNghienCuu;

@WebServlet("/admin-detailtrangthaiduyetcontroller")
public class DetailTrangThaiDuyetController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DeTaiDAO deTaiDao = new DeTaiDAO();

		int id = Integer.parseInt(req.getParameter("id"));
		DeTaiNghienCuu deTai = deTaiDao.getDeTaiById(id);

		req.setAttribute("detailDeTai", deTai);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/DetailTrangThaiDuyet.jsp");
		try {
			requestDispatcher.forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
