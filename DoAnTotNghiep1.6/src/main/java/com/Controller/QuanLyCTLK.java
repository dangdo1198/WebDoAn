package com.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.CTLKDoanhNghiepDAO;
import com.Model.CTLKDoanhNghiep;
@WebServlet("/admin-quanlychuongtrinhlienketmenucontroller")
public class QuanLyCTLK extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CTLKDoanhNghiepDAO ctlkDao = new CTLKDoanhNghiepDAO();
		List<CTLKDoanhNghiep> listCtlk = ctlkDao.getAllCTLKDoanhNghiep();
		req.setAttribute("listCtlk",listCtlk);
		RequestDispatcher dispatcher = req.getRequestDispatcher("views/QuanLyCTLK.jsp");
		dispatcher.forward(req, resp);
	}

}

//@WebServlet("/admin-formpheduyetdetaicontroller")
//public class FormPheDuyetDeTaiConntroller extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		DeTaiDAO detaiDao = new DeTaiDAO();
//		List<DeTaiNghienCuu> listDeTai = detaiDao.getAllDeTaiNghienCuu();
//		req.setAttribute("listDeTai", listDeTai);
//		RequestDispatcher dispatcher = req.getRequestDispatcher("views/FormPheDuyetDeTai.jsp");
//		try {
//			dispatcher.forward(req, resp);
//		} catch (ServletException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//}
