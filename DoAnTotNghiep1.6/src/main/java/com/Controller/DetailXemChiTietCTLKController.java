package com.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.CTLKDoanhNghiepDAO;
import com.Model.CTLKDoanhNghiep;

@WebServlet("/admin-detailxemchitietchuongtrinhlienketcontroller")
public class DetailXemChiTietCTLKController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		CTLKDoanhNghiepDAO ctlkDao = new CTLKDoanhNghiepDAO();
		int id = Integer.parseInt(req.getParameter("id"));
		CTLKDoanhNghiep ctlk = ctlkDao.getCTLKDoanhNghiepById(id);		
		req.setAttribute("detailCTLK", ctlk);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/DetailXemChiTietCTLK.jsp");
			requestDispatcher.forward(req, resp);
		
	}

}
