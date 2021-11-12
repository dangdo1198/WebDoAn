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

import com.DAO.TaiLieuDAO;
import com.Model.TaiLieuNghienCuu;


@Path("/tailieuapi")
public class TaiLieuAPI {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<TaiLieuNghienCuu> list() {
		TaiLieuDAO taiLieuDao = new TaiLieuDAO ();
		List<TaiLieuNghienCuu> taiLieuList = taiLieuDao.getAllTaiLieuNghienCuu();
		return taiLieuList;

	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void themTaiLieu(TaiLieuNghienCuu taiLieu) 
	{
		TaiLieuDAO  taiLieuDao = new TaiLieuDAO ();
		taiLieuDao.addTaiLieu(taiLieu);
		
		
	
	}
	
	@DELETE
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteTaiLieu(@PathParam("id") int  id) 
	{
		TaiLieuDAO taiLieuDao = new TaiLieuDAO();
		taiLieuDao.deleteTaiLieu(id);
	    
		
	}
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public TaiLieuNghienCuu getTaiLieuById(@PathParam("id") int id) 
	{
		
		TaiLieuDAO taiLieuDao = new TaiLieuDAO ();
		TaiLieuNghienCuu taiLieu = taiLieuDao.getTaiLieuById(id);
		return taiLieu;
		
	}
	 @PUT
	 @Produces(MediaType.APPLICATION_JSON)
   public void  upDateTaiLieu(TaiLieuNghienCuu taiLieu)
   {
     
		 TaiLieuDAO taiLieuDao = new TaiLieuDAO ();
		 taiLieuDao.updateTaiLieu(taiLieu);
     
   }
	
	
	
	
}
