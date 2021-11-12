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
import com.DAO.DoanhNghiepDAO;
import com.Model.DoanhNghiepHopTac;
@Path("/doanhnghiepapi")
public class DoanhNghiepAPI {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<DoanhNghiepHopTac> listDoanhNghiep(){
		DoanhNghiepDAO doanhNghiepDao = new DoanhNghiepDAO();
		List<DoanhNghiepHopTac> listDoanhNghiep = doanhNghiepDao.getAllDoanhNghiepHopTac();
		return listDoanhNghiep;
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void themDoanhNghiep(DoanhNghiepHopTac doanhNghiep) 
	{
		DoanhNghiepDAO doanhNghiepDao = new DoanhNghiepDAO();
		doanhNghiepDao.addDoanhNghiep(doanhNghiep);
		
	}
	

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public DoanhNghiepHopTac getDoanhNghiepHopTacById(@PathParam("id") int id) {
		DoanhNghiepDAO doanhNghiepDao = new DoanhNghiepDAO();
		DoanhNghiepHopTac doanhNghiep = doanhNghiepDao.getDoanhNghiepById(id);
		return doanhNghiep;
	}
	
	
	@PUT
	 @Produces(MediaType.APPLICATION_JSON)
  public void  updateDoanhNghiep(DoanhNghiepHopTac doanhNghiep)
  {
		DoanhNghiepDAO doanhNghiepDao = new DoanhNghiepDAO();
		doanhNghiepDao.updateDoanhNghiep(doanhNghiep);
		
  }
	
	@DELETE
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteDoanhNghiep(@PathParam("id") int  id) 
	{
		DoanhNghiepDAO doanhNghiepDao = new DoanhNghiepDAO();
		doanhNghiepDao.deleteDoanhNghiep(id);    
		
	}

}
