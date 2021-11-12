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

@WebServlet("/admin-thongkedexuatchuongtrinhlienketcontroller")
public class ThongKeDeXuatCTLKController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		CTLKDoanhNghiepDAO ctlkDao = new CTLKDoanhNghiepDAO();		
		List<CTLKDoanhNghiep> listCtlkDongY = ctlkDao.getAllCTLKDongY();
		req.setAttribute("listCtlkDongY", listCtlkDongY);
		
		List<CTLKDoanhNghiep> listCtlkTuChoi = ctlkDao.getAllCTLKTuChoi();
		req.setAttribute("listCtlkTuChoi", listCtlkTuChoi);
		
		List<CTLKDoanhNghiep> listCtlkNull = ctlkDao.getAllCTLKNull();
		req.setAttribute("listCtlkNull", listCtlkNull);
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("views/ThongKeDeXuatChuongTrinhLienKet.jsp");
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
