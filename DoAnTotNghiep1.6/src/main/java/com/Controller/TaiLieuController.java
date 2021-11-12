package com.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.TaiLieuDAO;
import com.Model.TaiLieuNghienCuu;
@WebServlet("/admin-tailieunghiencuucontroller")
public class TaiLieuController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TaiLieuDAO tailieuDao = new TaiLieuDAO();
		List<TaiLieuNghienCuu> listTaiLieu = tailieuDao.getAllTaiLieuNghienCuu();
		
		req.setAttribute("listTaiLieu", listTaiLieu);
		RequestDispatcher rd =req.getRequestDispatcher("views/TaiLieuNghienCuu.jsp");
		rd.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TaiLieuDAO tailieuDao = new TaiLieuDAO();
		List<TaiLieuNghienCuu> listTaiLieu = tailieuDao.getAllTaiLieuNghienCuu();
		
		req.setAttribute("listTaiLieu", listTaiLieu);
		RequestDispatcher rd =req.getRequestDispatcher("views/QuanLyTaiLieu.jsp");
		rd.forward(req, resp);
	}

}
