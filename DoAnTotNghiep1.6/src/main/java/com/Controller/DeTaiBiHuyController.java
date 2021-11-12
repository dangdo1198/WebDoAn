package com.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.DeTaiDAO;
import com.Model.DeTaiNghienCuu;

@WebServlet("/admin-detaibihuycontroller")
public class DeTaiBiHuyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DeTaiDAO detaiDao = new DeTaiDAO();
		List<DeTaiNghienCuu> listDeTai = detaiDao.getAllDeTaiBiHuy();
		req.setAttribute("listDeTai", listDeTai);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("views/DeTaiBiHuy.jsp");
		try {
			dispatcher.forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
