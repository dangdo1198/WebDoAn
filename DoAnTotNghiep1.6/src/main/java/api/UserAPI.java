package api;

import java.util.List;


import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.DAO.UserDao;
import com.Model.User;

@Path("/userapi")
public class UserAPI {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> list() {
		UserDao userDao = new UserDao();
		List<User> userList = userDao.getAllUser();
	    return userList;
	}
	
	
	

}
