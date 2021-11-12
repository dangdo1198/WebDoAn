package com.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Model.TaiLieuNghienCuu;
import com.Model.TinTuyenDung;
import com.Model.User;
import com.Ultis.ConnectDB;

public class UserDao {
	
	public List<User> getAllUser(){
		
		Connection con;
		PreparedStatement preparedStatement;
		ResultSet rs ;
		
		List<User>  listUser = new ArrayList<User>();
		
		try {
			
			con = ConnectDB.openConnection();
			preparedStatement = con.prepareStatement("select * from user ");
			rs = preparedStatement.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setTenNguoiDung(rs.getString("ten_nguoi_dung"));
				user.setMatKhau(rs.getString("mat_khau"));
				user.setEmail(rs.getString("email"));
				user.setRole(rs.getString("role"));
				listUser.add(user);
			}
			// ket ns
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listUser;
		
		
	}
	public   User login(String email, String matkhau){
		
		Connection con;
		PreparedStatement preparedStatement;
		ResultSet rs ;
		
		User user =null;
		try {
			
			con = ConnectDB.openConnection();
			preparedStatement = con.prepareStatement("select * from user where email=? and mat_khau=? ");
		
			
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, matkhau);
			// sai cho nay vi khi thuc hien lenh truy van can truyen tham so vao ? moi thuc hien duoc
			// vi khi do khong co gia tri de so sanh 
			// 
			
			rs = preparedStatement.executeQuery();
			if(rs.next()) {
				user= new User();
				user.setId(rs.getInt("id"));
				user.setTenNguoiDung(rs.getString("ten_nguoi_dung"));
			
				user.setMatKhau(rs.getString("mat_khau"));
				user.setEmail(rs.getString("email"));
				
				user.setRole(rs.getString("Role"));
				
			}
			// ket ns
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return user;
		
		
	}
	// them user
public boolean addUser(User user) {
		
		Connection con = null;
		CallableStatement callableStatement= null;
		ResultSet rs= null;

			boolean check= false;
			try {
				con = ConnectDB.openConnection();
				callableStatement= con.prepareCall("INSERT INTO user (ten_nguoi_dung,mat_khau,email,role) VALUES (?,?,?,?)");
					
		
				callableStatement.setString(1, user.getTenNguoiDung());
				callableStatement.setString(2, user.getMatKhau());
				callableStatement.setString(3, user.getEmail());
				callableStatement.setString(4, user.getRole());
				
				
				
				int a= callableStatement.executeUpdate();
				
				
				if(a >0) {
					check = true;
					System.out.println("insert thanh cong: " + user.getEmail());
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				check = false;
			
			}
			
			
			return check;
		}
//xoa nguoi dung
public boolean deleteUser(int id) {
	Connection con = null;
	CallableStatement callableStatement= null;
	ResultSet rs= null;
	boolean check = false;
	try {
		con = ConnectDB.openConnection();
		callableStatement= con.prepareCall("{ call Xoa_user1(?)}");
		callableStatement.setInt(1, id);
		 int a = callableStatement.executeUpdate();
		if(a >0) {
			
			check = true;
			System.out.println( "delete thanh cong " + id);
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return check;
}

// doi mat khau va doi ten dang nhap
public boolean updateMatKhauVaTenDangNhap(User user) {
	boolean check= false;
	Connection con = null;
	PreparedStatement preparedStatement = null;
	try {
		con = ConnectDB.openConnection();
		preparedStatement = con.prepareStatement("UPDATE user  SET ten_nguoi_dung = ?, mat_khau =?  WHERE id=?");

		preparedStatement.setString(1, user.getTenNguoiDung());
		preparedStatement.setString(2, user.getMatKhau());
		preparedStatement.setInt(3, user.getId());
		int a = preparedStatement.executeUpdate();
		if( a >0) {
			check = true;
			System.out.println("up date thanh cong "+ user.getTenNguoiDung());
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return check;
	
}


// doi quyen dang nhap

public boolean updateRole(User user) {
	boolean check= false;
	Connection con = null;
	PreparedStatement preparedStatement = null;
	try {
		con = ConnectDB.openConnection();
		preparedStatement = con.prepareStatement("UPDATE user  SET role=? WHERE id=?");

		preparedStatement.setString(1, user.getRole());
		preparedStatement.setInt(2, user.getId());
		int a = preparedStatement.executeUpdate();
		if( a >0) {
			check = true;
			System.out.println("up date thanh cong "+ user.getTenNguoiDung());
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return check;
	
}
// chon user theo id
public User getUserById(int id){
	
	Connection con;
	PreparedStatement preparedStatement;
	ResultSet rs;
	
	;
	User user = new User();
	try {
		
		con = ConnectDB.openConnection();
		preparedStatement = con.prepareStatement("select * from user where id=?");
		preparedStatement.setInt(1, id);
		rs = preparedStatement.executeQuery();
		
		if (rs.next()) {
			
			user.setId(rs.getInt("id"));
			user.setTenNguoiDung(rs.getString("ten_nguoi_dung"));
			user.setMatKhau(rs.getString("mat_khau"));
			user.setEmail(rs.getString("email"));
			user.setRole(rs.getString("role"));
			
		}
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	return user;
	

	
}

	
	
	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		 
		String a="do";
		String b="123";
		User user =	userDao.login(a, b);
				System.out.println(user.getRole());
	
	}

}
