package com.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.DoanhNghiepDAO;

@WebServlet("/admin-deletedoanhnghiepcontroller")
public class DeleteDoanhNghiepController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		DoanhNghiepDAO doanhNghiep = new DoanhNghiepDAO();
		int id = Integer.parseInt(req.getParameter("id"));
		boolean check = doanhNghiep.deleteDoanhNghiep(id);
	
		if(check) {
			resp.sendRedirect("admin-danhsachdoanhnghiepcontroller");
			
		}
		else {
			
			
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/DoanhNghiepHopTac.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
	

}
