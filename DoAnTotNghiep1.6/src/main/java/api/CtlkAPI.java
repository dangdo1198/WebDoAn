package api;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.DAO.CTLKDoanhNghiepDAO;
import com.Model.CTLKDoanhNghiep;

@Path("/chuongtrinhlienketapi")
public class CtlkAPI {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<CTLKDoanhNghiep> listChuongTrinh() {
		CTLKDoanhNghiepDAO ctlkDao = new CTLKDoanhNghiepDAO();
		List<CTLKDoanhNghiep> listCtlk = ctlkDao.getAllCTLKDoanhNghiep();
		return listCtlk;

	}
	
	
	@GET
	@Path("/chuongtrinhdongy")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CTLKDoanhNghiep> chuongTrinhDongY(){
		CTLKDoanhNghiepDAO ctlkDao = new CTLKDoanhNghiepDAO();
		List<CTLKDoanhNghiep> listCtlkDongY = ctlkDao.getAllCTLKDongY();
		return listCtlkDongY;
	}
	
	
	@GET
	@Path("/chuongtrinhtuchoi")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CTLKDoanhNghiep> chuongTrinhTuChoi(){
		CTLKDoanhNghiepDAO ctlkDao = new CTLKDoanhNghiepDAO();
		List<CTLKDoanhNghiep> listCtlkTuChoi = ctlkDao.getAllCTLKTuChoi();
		return listCtlkTuChoi;
	}
	
	@GET
	@Path("/chuongtrinhchophanhoi")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CTLKDoanhNghiep> chuongTrinhChuaPhanHoi(){
		CTLKDoanhNghiepDAO ctlkDao = new CTLKDoanhNghiepDAO();
		List<CTLKDoanhNghiep> listCtlkChuaPhanHoi = ctlkDao.getAllCTLKNull();
		return listCtlkChuaPhanHoi;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void deXuatChuongTrinh(CTLKDoanhNghiep ctlk) 
	{
		CTLKDoanhNghiepDAO ctlkDao = new CTLKDoanhNghiepDAO();
		ctlkDao.addCTLK(ctlk);
		
	}
	

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public CTLKDoanhNghiep  getChuongTrinhLienKetById(@PathParam("id") int id) 
	{
		
		CTLKDoanhNghiepDAO ctlkDao = new CTLKDoanhNghiepDAO();
	
		CTLKDoanhNghiep  ctlk =  ctlkDao.getCTLKDoanhNghiepById(id);
		return ctlk;
		
	}
	
	 @PUT
	 @Produces(MediaType.APPLICATION_JSON)
	public void  phanHoiChuongTrinhLienket(CTLKDoanhNghiep ctlk)
	{
		CTLKDoanhNghiepDAO ctlkDao = new CTLKDoanhNghiepDAO();
		ctlkDao.phanHoiCTLK(ctlk);
   
	}
	 
	 @DELETE
		@Path("{id}")
		@Produces(MediaType.APPLICATION_JSON)
		public void deleteCtlk(@PathParam("id") int  id) 
		{
		 	CTLKDoanhNghiepDAO ctlkDao = new CTLKDoanhNghiepDAO();
		 	ctlkDao.deleteCTLK(id);
			
		}
	

}
