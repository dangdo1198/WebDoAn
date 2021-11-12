package com.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.DAO.DoanhNghiepDAO;
import com.Model.DoanhNghiepHopTac;

@WebServlet("/admin-danhsachdoanhnghiepcontroller")
public class DanhSachDoanhNghiepController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DoanhNghiepDAO doanhNghiepDao = new DoanhNghiepDAO();
		List<DoanhNghiepHopTac> listDoanhNghiep = doanhNghiepDao.getAllDoanhNghiepHopTac();
		
		req.setAttribute("listDoanhNghiep", listDoanhNghiep);
		RequestDispatcher rd =req.getRequestDispatcher("views/DoanhNghiepHopTac.jsp");
		rd.forward(req, resp);
	}

}
