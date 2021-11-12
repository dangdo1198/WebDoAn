package com.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.DAO.DoanhNghiepDAO;
import com.Model.DoanhNghiepHopTac;


@WebServlet("/admin-detaildoanhnghiepcontroller")
public class DetailDoanhNghiepByIdController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		DoanhNghiepDAO doanhNghiepDao = new DoanhNghiepDAO();
		int id= Integer.parseInt(req.getParameter("id"));
		DoanhNghiepHopTac doanhNghiep = doanhNghiepDao.getDoanhNghiepById(id);
		req.setAttribute("detailDoanhNghiep", doanhNghiep);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/DetailUpdateDoanhNghiep.jsp");
		requestDispatcher.forward(req, resp);
	}

}
