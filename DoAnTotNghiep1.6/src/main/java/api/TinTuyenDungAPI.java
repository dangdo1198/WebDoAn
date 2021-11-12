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
import com.DAO.TinTuyenDungDAO;
import com.Model.TinTuyenDung;
@Path("/tintuyendungapi")
public class TinTuyenDungAPI {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<TinTuyenDung> listTinTuyenDung(){
		TinTuyenDungDAO tinTuyenDungDao = new TinTuyenDungDAO();
		List<TinTuyenDung> listTinTuyenDung = tinTuyenDungDao.getAllTinTuyenDung();
		return listTinTuyenDung;
	}
	
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void themTinTuyenDung(TinTuyenDung tinTuyenDung) 
	{
		TinTuyenDungDAO tinTuyenDungDao = new TinTuyenDungDAO();
		tinTuyenDungDao.addTinTuyenDung(tinTuyenDung);
		
		
	}
	

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public TinTuyenDung geTinTuyenDungById(@PathParam("id") int id) {
		TinTuyenDungDAO tinTuyenDungDao = new TinTuyenDungDAO();
		TinTuyenDung tinTuyenDung = tinTuyenDungDao.getTinTuyenDungById(id);
		return tinTuyenDung;
	}
	
	
	@PUT
	 @Produces(MediaType.APPLICATION_JSON)
  public void  updateTinTuyenDung(TinTuyenDung tinTuyenDung)
  {
		TinTuyenDungDAO tinTuyenDungDao = new TinTuyenDungDAO();
		tinTuyenDungDao.updateTinTuyenDung(tinTuyenDung);
		
		
  }
	
	@DELETE
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteTinTuyenDung(@PathParam("id") int  id) 
	{
		TinTuyenDungDAO tinTuyenDungDao = new TinTuyenDungDAO();
		tinTuyenDungDao.deleteTinTuyenDung(id);
		
	}
}
