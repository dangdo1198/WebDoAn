package com.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.Model.TinTuyenDung;
import com.Ultis.ConnectDB;

public class TinTuyenDungDAO {
	// hien thi tat ca ten tuyen dung
	public List<TinTuyenDung> getAllTinTuyenDung() {

		Connection con;
		CallableStatement callableStatement;
		ResultSet rs;

		List<TinTuyenDung> listTinTuyenDung = new ArrayList<TinTuyenDung>();
		TinTuyenDung tinTuyenDung = null;
		try {

			con = ConnectDB.openConnection();
			callableStatement = con.prepareCall("CALL all_tin_tuyen_dung()");
			rs = callableStatement.executeQuery();
			while (rs.next()) {
				tinTuyenDung = new TinTuyenDung();
				tinTuyenDung.setId(rs.getInt("id"));
				tinTuyenDung.setTieuDe(rs.getString("tieu_de"));
				tinTuyenDung.setTenDoanhNghiep(rs.getString("ten_doanh_nghiep"));
				tinTuyenDung.setNguoiDang(rs.getString("nguoi_dang"));
				tinTuyenDung.setChucVu(rs.getString("chuc_vu"));
				tinTuyenDung.setNoiDung(rs.getString("noi_dung"));
				tinTuyenDung.setThongBao(rs.getString("thong_bao"));
				tinTuyenDung.setSoDienThoai(rs.getString("so_dien_thoai"));
				tinTuyenDung.setWebsite(rs.getString("website"));
				tinTuyenDung.setEmail(rs.getString("email"));
				listTinTuyenDung.add(tinTuyenDung);
				
			}
			// ket ns

		} catch (Exception e) {
			// TODO: handle exception
		}
		return listTinTuyenDung;

	}
	
	
	
	// xoa tin tuyen dung
	public boolean deleteTinTuyenDung(int id) {
		Connection con = null;
		CallableStatement callableStatement= null;
		ResultSet rs= null;
		boolean check = false;
		try {
			con = ConnectDB.openConnection();
			callableStatement= con.prepareCall("{ call Xoa_tin_tuyen_dung(?)}");
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
	
	
	
	// them tin tuyen dung
	public boolean addTinTuyenDung(TinTuyenDung tinTuyenDung) {
		
		Connection con = null;
		CallableStatement callableStatement= null;
		ResultSet rs= null;

			boolean check= false;
			try {
				con = ConnectDB.openConnection();
				callableStatement= con.prepareCall("INSERT INTO tintuyendung (tieu_de,ten_doanh_nghiep,nguoi_dang,chuc_vu,noi_dung,so_dien_thoai,email,website,thong_bao) VALUES (?,?,?,?,?,?,?,?,?)");
					
		
				callableStatement.setString(1, tinTuyenDung.getTieuDe());
				callableStatement.setString(2, tinTuyenDung.getTenDoanhNghiep());
				callableStatement.setString(3, tinTuyenDung.getNguoiDang());
				callableStatement.setString(4, tinTuyenDung.getChucVu());
				callableStatement.setString(5, tinTuyenDung.getNoiDung());
				callableStatement.setString(6, tinTuyenDung.getSoDienThoai());
				callableStatement.setString(7, tinTuyenDung.getEmail());
				callableStatement.setString(8, tinTuyenDung.getWebsite());
				callableStatement.setString(9, tinTuyenDung.getThongBao());
				
				
				int a=  callableStatement.executeUpdate();
				
				
				if(a >0) {
					check = true;
					System.out.println("insert thanh cong: " + tinTuyenDung.getTieuDe());
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				check = false;
			
			}
			
			
			return check;
		}
	
	// cap nhat tin tuyen dung
	public boolean updateTinTuyenDung(TinTuyenDung tinTuyenDung) {
		boolean check= false;
		Connection con = null;
		PreparedStatement preparedStatement = null;
		try {
			con = ConnectDB.openConnection();
			preparedStatement = con.prepareStatement("UPDATE tintuyendung SET tieu_de=?,ten_doanh_nghiep=?,noi_dung=?,so_dien_thoai=?,email=?,website=?,thong_bao=? WHERE id=?");
			
			preparedStatement.setString(1, tinTuyenDung.getTieuDe());
			preparedStatement.setString(2, tinTuyenDung.getTenDoanhNghiep());
//			preparedStatement.setString(3, tinTuyenDung.getNguoiDang());
//			preparedStatement.setString(4, tinTuyenDung.getChucVu());		
			preparedStatement.setString(3, tinTuyenDung.getNoiDung());				
			preparedStatement.setString(4, tinTuyenDung.getSoDienThoai());
			preparedStatement.setString(5, tinTuyenDung.getEmail());
			preparedStatement.setString(6, tinTuyenDung.getWebsite());	
			preparedStatement.setString(7, tinTuyenDung.getThongBao());
			preparedStatement.setInt(8, tinTuyenDung.getId());
			int a = preparedStatement.executeUpdate();
			if( a >0) {
				check = true;
				System.out.println("up date thanh cong "+ tinTuyenDung.getId());
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
		
	}
	
	// ten tuyen dung theo id
	public TinTuyenDung getTinTuyenDungById(int id){
		
		Connection con;
		PreparedStatement preparedStatement;
		ResultSet rs;
		
		TinTuyenDung  tinTuyenDung = new TinTuyenDung();
		try {
			
			con = ConnectDB.openConnection();
			preparedStatement = con.prepareStatement("select * from tintuyendung where id=?");
			preparedStatement.setInt(1, id);
			rs = preparedStatement.executeQuery();
			
			if (rs.next()) {
				
				tinTuyenDung.setId(rs.getInt("id"));
				tinTuyenDung.setTieuDe(rs.getString("tieu_de"));
				tinTuyenDung.setTenDoanhNghiep(rs.getString("ten_doanh_nghiep"));
				tinTuyenDung.setNguoiDang(rs.getString("nguoi_dang"));
				tinTuyenDung.setChucVu(rs.getString("chuc_vu"));
				tinTuyenDung.setNoiDung(rs.getString("noi_dung"));
				tinTuyenDung.setSoDienThoai(rs.getString("so_dien_thoai"));
				tinTuyenDung.setEmail(rs.getString("email"));
				tinTuyenDung.setWebsite(rs.getString("website"));
				tinTuyenDung.setThongBao(rs.getString("thong_bao"));
				
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return tinTuyenDung;
		

		
	}

	
	
	
	

}
