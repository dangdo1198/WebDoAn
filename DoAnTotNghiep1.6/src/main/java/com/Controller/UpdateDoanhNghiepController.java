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

@WebServlet("/admin-updatedoanhnghiepcontroller")
public class UpdateDoanhNghiepController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		DoanhNghiepHopTac doanhNghiep = new DoanhNghiepHopTac();
		int id= Integer.parseInt(req.getParameter("id"));
		String tendoanhnghiep = req.getParameter("ten_doanh_nghiep");
		String tengiamdoc = req.getParameter("ten_giam_doc");
		String linhvuc = req.getParameter("linh_vuc");
		String namhoptac = req.getParameter("nam_hop_tac");
		String trusochinh = req.getParameter("tru_so_chinh");
		String sodienthoai = req.getParameter("so_dien_thoai");
		String website = req.getParameter("website");
		
		
		
		doanhNghiep.setId(id);
		doanhNghiep.setTenDoanhNghiep(tendoanhnghiep);
		doanhNghiep.setTenGiamDoc(tengiamdoc);
		doanhNghiep.setLinhVuc(linhvuc);
		doanhNghiep.setNamHopTac(namhoptac);
		doanhNghiep.setTruSoChinh(trusochinh);
		doanhNghiep.setSoDienThoai(sodienthoai);
		doanhNghiep.setWebsite(website);
		
		
		
		
		
		boolean check = new DoanhNghiepDAO().updateDoanhNghiep(doanhNghiep);
		
		if(check) {
			
			resp.sendRedirect("admin-danhsachdoanhnghiepcontroller");
		}
		else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/DoanhNghiepHopTac.jsp");
			requestDispatcher.forward(req, resp);
			
		}
	}

}
