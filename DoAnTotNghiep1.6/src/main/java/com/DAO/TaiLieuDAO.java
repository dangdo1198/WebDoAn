package com.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Model.TaiLieuNghienCuu;
import com.Model.User;
import com.Ultis.ConnectDB;

public class TaiLieuDAO {

	public List<TaiLieuNghienCuu> getAllTaiLieuNghienCuu() {

		Connection con;
		CallableStatement callableStatement;
		ResultSet rs;

		List<TaiLieuNghienCuu> listTaiLieu = new ArrayList<TaiLieuNghienCuu>();
		TaiLieuNghienCuu tailieu = null;
		try {

			con = ConnectDB.openConnection();
			callableStatement = con.prepareCall("CALL procedure_name()");
			rs = callableStatement.executeQuery();
			while (rs.next()) {
				tailieu = new TaiLieuNghienCuu();
				tailieu.setId(rs.getInt("id"));
				tailieu.setTenTaiLieu(rs.getString("ten_tai_lieu"));
				tailieu.setTacGia(rs.getString("ten_tac_gia"));
				tailieu.setUserId(rs.getInt("id_user"));
				tailieu.setLinhVuc(rs.getString("linh_vuc"));
				tailieu.setThoiGian(rs.getString("thoi_gian"));
				tailieu.setLinkTai(rs.getString("link_tai"));
				listTaiLieu.add(tailieu);
			}
			// ket ns

		} catch (Exception e) {
			// TODO: handle exception
		}
		return listTaiLieu;

	}
	// Xóa tài liệu
	public boolean deleteTaiLieu(int id) {
		Connection con = null;
		CallableStatement callableStatement= null;
		ResultSet rs= null;
		boolean check = false;
		try {
			con = ConnectDB.openConnection();
			callableStatement= con.prepareCall("{ call delete_tailieu(?)}");
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
	
	// thêm tài liệu
public boolean addTaiLieu(TaiLieuNghienCuu taiLieu) {
		
	Connection con = null;
	CallableStatement callableStatement= null;
	ResultSet rs= null;

		boolean check= false;
		try {
			con = ConnectDB.openConnection();
			callableStatement= con.prepareCall("INSERT INTO tailieunghiencuu (ten_tai_lieu,ten_tac_gia,linh_vuc,id_user,thoi_gian,link_tai) VALUES (?,?,?,?,?,?)");
				
	
			callableStatement.setString(1, taiLieu.getTenTaiLieu());
			callableStatement.setString(2, taiLieu.getTacGia());
			callableStatement.setString(3, taiLieu.getLinhVuc());
			callableStatement.setInt(4, taiLieu.getUserId());
			callableStatement.setString(5, taiLieu.getThoiGian());
			callableStatement.setString(6, taiLieu.getLinkTai());
			
			
			int a=  callableStatement.executeUpdate();
			
			
			if(a >0) {
				check = true;
				System.out.println("insert thanh cong: " + taiLieu.getTenTaiLieu());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			check = false;
		
		}
		
		
		return check;
	}


// Cập nhật tài liệu nghiên cứu

public boolean updateTaiLieu(TaiLieuNghienCuu taiLieu) {
	boolean check= false;
	Connection con = null;
	PreparedStatement preparedStatement = null;
	try {
		con = ConnectDB.openConnection();
		preparedStatement = con.prepareStatement("UPDATE tailieunghiencuu  SET ten_tai_lieu =?, ten_tac_gia = ?,linh_vuc =? ,thoi_gian = ?, link_tai=? WHERE id=?");

		preparedStatement.setString(1, taiLieu.getTenTaiLieu());
		preparedStatement.setString(2, taiLieu.getTacGia());
		preparedStatement.setString(3, taiLieu.getLinhVuc());
//		preparedStatement.setInt(4, taiLieu.getUserId());
		preparedStatement.setString(4, taiLieu.getThoiGian());
		preparedStatement.setString(5, taiLieu.getLinkTai());
		preparedStatement.setInt(6, taiLieu.getId());
		int a = preparedStatement.executeUpdate();
		if( a >0) {
			check = true;
			System.out.println("up date thanh cong "+ taiLieu.getId());
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return check;
	
}

// Hiển thị tài liệu theo ID
public  TaiLieuNghienCuu getTaiLieuById(int id){
	
	Connection con;
	PreparedStatement preparedStatement;
	ResultSet rs;
	
	TaiLieuNghienCuu  taiLieu = new TaiLieuNghienCuu();
	try {
		
		con = ConnectDB.openConnection();
		preparedStatement = con.prepareStatement("select * from tailieunghiencuu where id=?");
		preparedStatement.setInt(1, id);
		rs = preparedStatement.executeQuery();
		
		if (rs.next()) {
			
			taiLieu.setId(rs.getInt("id"));
			taiLieu.setTenTaiLieu(rs.getString("ten_tai_lieu"));
			taiLieu.setTacGia(rs.getString("ten_tac_gia"));
			taiLieu.setLinhVuc(rs.getString("linh_vuc"));
			taiLieu.setUserId(rs.getInt("id_user"));
			taiLieu.setThoiGian(rs.getString("thoi_gian"));
			taiLieu.setLinkTai(rs.getString("link_tai"));
			
			
			
		}
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	return taiLieu;
	

	
}
	
	
	
	public static void main(String[] args) {
		TaiLieuDAO taiLieuDAO = new TaiLieuDAO();
		List<TaiLieuNghienCuu> list = taiLieuDAO.getAllTaiLieuNghienCuu();
		for(TaiLieuNghienCuu lieuNghienCuu: list) {
		System.out.println(lieuNghienCuu.toString());
		
		Boolean check = taiLieuDAO.deleteTaiLieu(4);
		System.out.println(check);
		TaiLieuNghienCuu tailieu = new TaiLieuNghienCuu();
		tailieu.setTenTaiLieu("a");
		tailieu.setUserId(1);
		tailieu.setTacGia("b");
		tailieu.setLinhVuc("c");
		tailieu.setThoiGian(null);
		tailieu.setLinkTai("link");
		
		Boolean check1 = taiLieuDAO.addTaiLieu(tailieu);
		
		}
	}
}
