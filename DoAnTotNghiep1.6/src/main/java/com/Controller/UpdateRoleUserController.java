package com.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.TinTuyenDungDAO;
import com.DAO.UserDao;
import com.Model.TinTuyenDung;
import com.Model.User;
@WebServlet("/admin-updateroleusercontroller")
public class UpdateRoleUserController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		User user = new User();
		int id= Integer.parseInt(req.getParameter("id"));
		String role = req.getParameter("role");
		
		
		user.setId(id);
		user.setRole(role);
		
		
		
		
		
		
	
		
		boolean check = new UserDao().updateRole(user);
		
		if(check) {
			
			resp.sendRedirect("admin-quanlynguoidungmenucontroller");
		}
		else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/QuanLyNguoiDung.jsp");
			requestDispatcher.forward(req, resp);
			
		}
	}
}
