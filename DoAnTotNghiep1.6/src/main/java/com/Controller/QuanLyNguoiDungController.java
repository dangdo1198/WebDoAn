package com.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.UserDao;
import com.Model.User;
@WebServlet("/admin-quanlynguoidungmenucontroller")
public class QuanLyNguoiDungController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDao userDao = new UserDao();
		List<User> listUser = userDao.getAllUser();
		req.setAttribute("listUser", listUser);
		RequestDispatcher dispatcher = req.getRequestDispatcher("views/QuanLyNguoiDung.jsp");
		dispatcher.forward(req, resp);
		
	}

}
