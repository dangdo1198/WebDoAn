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
import com.DAO.DeTaiDAO;
import com.Model.DeTaiNghienCuu;




@Path("/detaiapi")
public class DeTaiAPI {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<DeTaiNghienCuu> listDeTai() {
		DeTaiDAO deTaiDao = new DeTaiDAO ();
		List<DeTaiNghienCuu> deTaiList = deTaiDao.getAllDeTaiNghienCuu();
		return deTaiList;

	}
	
	
	@GET
	@Path("/detaiduyet")
	@Produces(MediaType.APPLICATION_JSON)
	public List<DeTaiNghienCuu> deTaiDuyet() {
		DeTaiDAO deTaiDao = new DeTaiDAO ();
		List<DeTaiNghienCuu> deTaiDuyet = deTaiDao.getAllDeTaiDuocDuyet();
		return deTaiDuyet;

	}
	
	@GET
	@Path("/detaihuy")
	@Produces(MediaType.APPLICATION_JSON)
	public List<DeTaiNghienCuu> deTaiHuy() {
		DeTaiDAO deTaiDao = new DeTaiDAO ();
		List<DeTaiNghienCuu> deTaiDuyet = deTaiDao.getAllDeTaiBiHuy();
		return deTaiDuyet;

	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void themDeTai(DeTaiNghienCuu deTai) 
	{
		DeTaiDAO  deTaiDao = new DeTaiDAO ();
		deTaiDao.addDeTai(deTai);
		
	}
	

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public DeTaiNghienCuu getDeTaiById(@PathParam("id") int id) 
	{
		
		DeTaiDAO  deTaiDao = new DeTaiDAO ();
	
		DeTaiNghienCuu deTai = deTaiDao.getDeTaiById(id);
		return deTai;
		
	}
	
	@PUT
	 @Produces(MediaType.APPLICATION_JSON)
	public void  pheDuyetDeTai(DeTaiNghienCuu deTai)
	{
    
		 DeTaiDAO deTaiDao = new DeTaiDAO ();
		 deTaiDao.pheDuyetDeTai(deTai);
    
	}
	
	@DELETE
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteDeTai(@PathParam("id") int  id) 
	{
		DeTaiDAO deTaiDao =  new DeTaiDAO();
		deTaiDao.deleteDeTai(id);
		
	}
	
}
