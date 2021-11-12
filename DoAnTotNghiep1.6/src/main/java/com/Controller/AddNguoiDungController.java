package com.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.DAO.UserDao;
import com.Model.User;
@WebServlet("/admin-addusercontroller")
public class AddNguoiDungController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDao userDao = new UserDao();
		User user = new User();
		String tennguoidung = req.getParameter("ten_nguoi_dung");
		String matkhau = req.getParameter("mat_khau");
		String email = req.getParameter("email");
		String role = req.getParameter("role");
		
		user.setTenNguoiDung(tennguoidung);
		user.setMatKhau(matkhau);
		user.setEmail(email);
		user.setRole(role);
				 
		userDao.addUser(user);		
			
		
	
		resp.sendRedirect("admin-quanlynguoidungmenucontroller");
		
	}

}
