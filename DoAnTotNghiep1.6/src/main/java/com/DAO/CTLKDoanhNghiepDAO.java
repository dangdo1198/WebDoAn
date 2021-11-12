package com.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Model.CTLKDoanhNghiep;
import com.Model.DeTaiNghienCuu;
import com.Model.TaiLieuNghienCuu;
import com.Ultis.ConnectDB;

public class CTLKDoanhNghiepDAO {
	// tu nghi
	// them sua xoa ct
	// them 
	
	public List<CTLKDoanhNghiep> getAllCTLKDoanhNghiep() {
		Connection con;
		CallableStatement st;
		ResultSet rs;
		
		List<CTLKDoanhNghiep> listCTLK = new ArrayList<CTLKDoanhNghiep>();
		CTLKDoanhNghiep ctlk = null;
		try {
			con = ConnectDB.openConnection();
			st = con.prepareCall("CALL danh_sach_chuong_trinh_lien_ket()");
			rs = st.executeQuery();
			while (rs.next()) {
				
				ctlk = new CTLKDoanhNghiep();
				ctlk.setId(rs.getInt("id")); 
				ctlk.setTenChuongTrinh(rs.getString("ten_chuong_trinh"));
				ctlk.setTenDoanhNghiep(rs.getString("ten_doanh_nghiep"));
				ctlk.setNguoiDaiDien(rs.getString("nguoi_dai_dien"));
				ctlk.setChucVu(rs.getString("chuc_vu"));
				ctlk.setNoiDungChinh(rs.getString("noi_dung_chinh"));
				ctlk.setThoiGianDuKien(rs.getString("thoi_gian_du_kien"));
				ctlk.setTrangThaiXacNhan(rs.getString("trang_thai_xac_nhan"));
				ctlk.setLyDo(rs.getString("ly_do"));
				ctlk.setGhiChu(rs.getString("ghi_chu"));
				
				listCTLK.add(ctlk);
			}
		}catch  (Exception e){
			
		}
		return listCTLK;
		
		
	}
	
	public boolean deleteCTLK(int id) {
		Connection con = null;
		CallableStatement callableStatement= null;
		ResultSet rs= null;
		boolean check = false;
		try {
			con = ConnectDB.openConnection();
			callableStatement= con.prepareCall("{ call delete_ctlk(?)}");
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

	
	
	
	
	
	
	
	
	
	
	public boolean addCTLK(CTLKDoanhNghiep ctlk) {
		
		Connection con = null;
		CallableStatement callableStatement= null;
		ResultSet rs= null;
		boolean check= false;
		try {
			con = ConnectDB.openConnection();
			callableStatement= con.prepareCall("INSERT INTO chuongtrinhlienket (ten_chuong_trinh,ten_doanh_nghiep,nguoi_dai_dien,chuc_vu,noi_dung_chinh,thoi_gian_du_kien,trang_thai_xac_nhan,ghi_chu,ly_do) VALUES (?,?,?,?,?,?,?,?,?)");
			
			callableStatement.setString(1,ctlk.getTenChuongTrinh());
			callableStatement.setString(2, ctlk.getTenDoanhNghiep());
			callableStatement.setString(3, ctlk.getNguoiDaiDien());
			callableStatement.setString(4, ctlk.getChucVu());
			callableStatement.setString(5, ctlk.getNoiDungChinh());
			callableStatement.setString(6,ctlk.getThoiGianDuKien());
			callableStatement.setString(7, ctlk.getTrangThaiXacNhan());
			callableStatement.setString(8, ctlk.getGhiChu());
			callableStatement.setString(9, ctlk.getLyDo());
			
			
			
			
			
			
			int a=  callableStatement.executeUpdate();
			
			
			if(a >0) {
				check = true;
				System.out.println("insert thanh cong: " + ctlk.getTenChuongTrinh());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			check = false;
		
		}
		
		
		return check;
			
	
			}
	
	
	
	public CTLKDoanhNghiep getCTLKDoanhNghiepById(int id){
		
		Connection con;
		PreparedStatement preparedStatement;
		ResultSet rs;
		
		
		CTLKDoanhNghiep ctlk = new CTLKDoanhNghiep();
		try {
			
			con = ConnectDB.openConnection();
			preparedStatement = con.prepareStatement("select * from chuongtrinhlienket where id=?");
			preparedStatement.setInt(1, id);
			rs = preparedStatement.executeQuery();
			
			if (rs.next()) {
				
				ctlk.setId(rs.getInt("id"));
				ctlk.setTenChuongTrinh(rs.getString("ten_chuong_trinh"));
				ctlk.setTenDoanhNghiep(rs.getString("ten_doanh_nghiep"));
				ctlk.setNguoiDaiDien(rs.getString("nguoi_dai_dien"));
				ctlk.setChucVu(rs.getString("chuc_vu"));
				ctlk.setNoiDungChinh(rs.getString("noi_dung_chinh"));
				ctlk.setThoiGianDuKien(rs.getString("thoi_gian_du_kien"));
				ctlk.setTrangThaiXacNhan(rs.getString("trang_thai_xac_nhan"));
				ctlk.setGhiChu(rs.getString("ghi_chu"));
				ctlk.setLyDo(rs.getString("ly_do"));
				
			
				
				
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ctlk;
		

		
	}
	
	public boolean phanHoiCTLK(CTLKDoanhNghiep ctlk) {
		boolean check= false;
		Connection con = null;
		PreparedStatement preparedStatement = null;
		try {
			con = ConnectDB.openConnection();
			//preparedStatement = con.prepareStatement("UPDATE detainghiencuu  SET ho_va_ten=?,ma_sinh_vien=?,khoa=?, ten_de_tai=?,linh_vuc=?,thoi_gian_du_kien=?,kinh_phi=?,ghi_chu=?, trang_thai_duyet=?,tinh_trang=?,diem_so=?,danh_gia=? WHERE id=?");
			preparedStatement = con.prepareStatement("UPDATE chuongtrinhlienket  SET  trang_thai_xac_nhan=?,ly_do=? WHERE id=?");

			preparedStatement.setString(1, ctlk.getTrangThaiXacNhan());
			preparedStatement.setString(2, ctlk.getLyDo());
			preparedStatement.setInt(3, ctlk.getId());
			int a = preparedStatement.executeUpdate();
			if( a >0) {
				check = true;
				System.out.println("up date thanh cong "+ ctlk.getId());
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
		
	}
	
	public List<CTLKDoanhNghiep> getAllCTLKDongY() {

		Connection con;
		Statement statement;
		ResultSet rs;

		
		List<CTLKDoanhNghiep> listCtlk = new ArrayList<CTLKDoanhNghiep>();
		CTLKDoanhNghiep ctlk = null;
		
		try {

			con = ConnectDB.openConnection();
			statement = con.createStatement() ;
			rs = statement.executeQuery("select * from chuongtrinhlienket Where trang_thai_xac_nhan='ĐỒNG Ý'") ; 
			while (rs.next()) {
				ctlk = new CTLKDoanhNghiep();
				ctlk.setId(rs.getInt("id"));
				ctlk.setTenChuongTrinh(rs.getString("ten_chuong_trinh"));
				ctlk.setTenDoanhNghiep(rs.getString("ten_doanh_nghiep"));
				ctlk.setNguoiDaiDien(rs.getString("nguoi_dai_dien"));
				ctlk.setChucVu(rs.getString("chuc_vu"));
				ctlk.setThoiGianDuKien(rs.getString("thoi_gian_du_kien"));
				ctlk.setNoiDungChinh(rs.getString("noi_dung_chinh"));
				ctlk.setTrangThaiXacNhan(rs.getString("trang_thai_xac_nhan"));
				ctlk.setGhiChu(rs.getString("ghi_chu"));
				ctlk.setLyDo(rs.getString("ly_do"));
				listCtlk.add(ctlk);				
				
			}
			// ket ns

		} catch (Exception e) {
			// TODO: handle exception
		}
		return listCtlk;

	}
	
	public List<CTLKDoanhNghiep> getAllCTLKTuChoi() {

		Connection con;
		Statement statement;
		ResultSet rs;

		
		List<CTLKDoanhNghiep> listCtlk = new ArrayList<CTLKDoanhNghiep>();
		CTLKDoanhNghiep ctlk = null;
		
		try {

			con = ConnectDB.openConnection();
			statement = con.createStatement() ;
			rs = statement.executeQuery("select * from chuongtrinhlienket Where trang_thai_xac_nhan='TỪ CHỐI'") ; 
			while (rs.next()) {
				ctlk = new CTLKDoanhNghiep();
				ctlk.setId(rs.getInt("id"));
				ctlk.setTenChuongTrinh(rs.getString("ten_chuong_trinh"));
				ctlk.setTenDoanhNghiep(rs.getString("ten_doanh_nghiep"));
				ctlk.setNguoiDaiDien(rs.getString("nguoi_dai_dien"));
				ctlk.setChucVu(rs.getString("chuc_vu"));
				ctlk.setThoiGianDuKien(rs.getString("thoi_gian_du_kien"));
				ctlk.setNoiDungChinh(rs.getString("noi_dung_chinh"));
				ctlk.setTrangThaiXacNhan(rs.getString("trang_thai_xac_nhan"));
				ctlk.setGhiChu(rs.getString("ghi_chu"));
				ctlk.setLyDo(rs.getString("ly_do"));
				listCtlk.add(ctlk);				
				
			}
			// ket ns

		} catch (Exception e) {
			// TODO: handle exception
		}
		return listCtlk;

	}
	
	public List<CTLKDoanhNghiep> getAllCTLKNull() {

		Connection con;
		Statement statement;
		ResultSet rs;

		
		List<CTLKDoanhNghiep> listCtlk = new ArrayList<CTLKDoanhNghiep>();
		CTLKDoanhNghiep ctlk = null;
		
		try {

			con = ConnectDB.openConnection();
			statement = con.createStatement() ;
			rs = statement.executeQuery("select * from chuongtrinhlienket Where trang_thai_xac_nhan is null") ; 
			while (rs.next()) {
				ctlk = new CTLKDoanhNghiep();
				ctlk.setId(rs.getInt("id"));
				ctlk.setTenChuongTrinh(rs.getString("ten_chuong_trinh"));
				ctlk.setTenDoanhNghiep(rs.getString("ten_doanh_nghiep"));
				ctlk.setNguoiDaiDien(rs.getString("nguoi_dai_dien"));
				ctlk.setChucVu(rs.getString("chuc_vu"));
				ctlk.setThoiGianDuKien(rs.getString("thoi_gian_du_kien"));
				ctlk.setNoiDungChinh(rs.getString("noi_dung_chinh"));
				ctlk.setTrangThaiXacNhan(rs.getString("trang_thai_xac_nhan"));
				ctlk.setGhiChu(rs.getString("ghi_chu"));
				ctlk.setLyDo(rs.getString("ly_do"));
				listCtlk.add(ctlk);				
				
			}
			// ket ns

		} catch (Exception e) {
			// TODO: handle exception
		}
		return listCtlk;

	}
	
	
	
	
	}


		
	
	
	

			
