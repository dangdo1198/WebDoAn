package com.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.DAO.UserDao;
import com.Model.User;
@WebServlet("/admin-detailupdateuserbyidcontroller")
public class DetailUpdateUserById extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		UserDao userDao = new UserDao();
		int id= Integer.parseInt(req.getParameter("id"));		
		User user = userDao.getUserById(id);		
		req.setAttribute("detailUser", user);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/DetailUpdateUserById.jsp");
		requestDispatcher.forward(req, resp);
	}

}
