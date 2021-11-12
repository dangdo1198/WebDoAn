package com.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Model.DeTaiNghienCuu;
import com.Model.TaiLieuNghienCuu;
import com.Ultis.ConnectDB;

public class DeTaiDAO {
	public List<DeTaiNghienCuu> getAllDeTaiNghienCuu() {

		Connection con;
		CallableStatement callableStatement;
		ResultSet rs;

		List<DeTaiNghienCuu> listDeTai = new ArrayList<DeTaiNghienCuu>();
		DeTaiNghienCuu deTai = null;
		try {

			con = ConnectDB.openConnection();
			callableStatement = con.prepareCall("CALL detai_name ()");
			rs = callableStatement.executeQuery();
			while (rs.next()) {
				deTai = new DeTaiNghienCuu();
				deTai.setId(rs.getInt("id"));
				deTai.setHoVaTen(rs.getString("ho_va_ten"));
				deTai.setMaSV(rs.getString("ma_sinh_vien"));
				deTai.setKhoa(rs.getString("khoa"));
				deTai.setTenDeTai(rs.getString("ten_de_tai"));
				deTai.setLinhVuc(rs.getString("linh_vuc"));
				deTai.setThoiGianDuKien(rs.getString("thoi_gian_du_kien"));
				deTai.setKinhPhi(rs.getString("kinh_phi"));
				deTai.setGhiChu(rs.getString("ghi_chu"));
				deTai.setTrangThaiDuyet(rs.getString("trang_thai_duyet"));
				deTai.setLyDo(rs.getString("ly_do"));
				deTai.setTinhTrang(rs.getString("tinh_trang"));
				deTai.setDiemSo(rs.getString("diem_so"));
				deTai.setDanhGia(rs.getString("danh_gia"));
				listDeTai.add(deTai);
			}
			// ket ns

		} catch (Exception e) {
			// TODO: handle exception
		}
		return listDeTai;

	}
	// XÃ³a tÃ i liá»‡u
	public boolean deleteDeTai(int id) {
		Connection con = null;
		CallableStatement callableStatement= null;
		ResultSet rs= null;
		boolean check = false;
		try {
			con = ConnectDB.openConnection();
			callableStatement= con.prepareCall("{ call delete_detai(?)}");
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
	
	// thÃªm tÃ i liá»‡u
public boolean addDeTai(DeTaiNghienCuu deTai) {
		
	Connection con = null;
	CallableStatement callableStatement= null;
	ResultSet rs= null;

		boolean check= false;
		try {
			con = ConnectDB.openConnection();
			callableStatement= con.prepareCall("INSERT INTO detainghiencuu (ho_va_ten,ma_sinh_vien,khoa,ten_de_tai,linh_vuc,thoi_gian_du_kien,kinh_phi,ghi_chu,trang_thai_duyet,ly_do,tinh_trang,diem_so,danh_gia) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
			callableStatement.setString(1, deTai.getHoVaTen());
			callableStatement.setString(2, deTai.getMaSV());
			callableStatement.setString(3, deTai.getKhoa());
			callableStatement.setString(4, deTai.getTenDeTai());
			callableStatement.setString(5, deTai.getLinhVuc());
			callableStatement.setString(6, deTai.getThoiGianDuKien());
			callableStatement.setString(7, deTai.getKinhPhi());
			callableStatement.setString(8, deTai.getGhiChu());
			callableStatement.setString(9, deTai.getTrangThaiDuyet());
			callableStatement.setString(10, deTai.getTrangThaiDuyet());
			callableStatement.setString(11, deTai.getTinhTrang());
			callableStatement.setString(12, deTai.getDiemSo());
			callableStatement.setString(13, deTai.getDanhGia());
			
			
			
			
			
			int a=  callableStatement.executeUpdate();
			
			
			if(a >0) {
				check = true;
				System.out.println("insert thanh cong: " + deTai.getTenDeTai());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			check = false;
		
		}
		
		
		return check;
	}

// pheduyet de tai theo id nhÆ°ng chá»‰ cáº­p nháº­t trÆ°á»�ng tráº¡ng thÃ¡i duyá»‡t
public boolean pheDuyetDeTai(DeTaiNghienCuu deTai) {
	boolean check= false;
	Connection con = null;
	PreparedStatement preparedStatement = null;
	try {
		con = ConnectDB.openConnection();
		//preparedStatement = con.prepareStatement("UPDATE detainghiencuu  SET ho_va_ten=?,ma_sinh_vien=?,khoa=?, ten_de_tai=?,linh_vuc=?,thoi_gian_du_kien=?,kinh_phi=?,ghi_chu=?, trang_thai_duyet=?,tinh_trang=?,diem_so=?,danh_gia=? WHERE id=?");
		preparedStatement = con.prepareStatement("UPDATE detainghiencuu  SET  trang_thai_duyet=?,ly_do=? WHERE id=?");
//		preparedStatement.setString(1, deTai.getHoVaTen());
//		preparedStatement.setString(2,deTai.getMaSV());
//		preparedStatement.setString(3,deTai.getKhoa());
//		preparedStatement.setString(4,deTai.getTenDeTai());
//		preparedStatement.setString(5,deTai.getLinhVuc());
//		preparedStatement.setString(6,deTai.getThoiGianDuKien());
//		preparedStatement.setString(7,deTai.getKinhPhi());
//		preparedStatement.setString(8,deTai.getGhiChu());
		preparedStatement.setString(1, deTai.getTrangThaiDuyet());
		preparedStatement.setString(2, deTai.getLyDo());
//		preparedStatement.setString(10,deTai.getTinhTrang());
//		preparedStatement.setString(11,deTai.getDiemSo());
//		preparedStatement.setString(12,deTai.getDanhGia());
		preparedStatement.setInt(3, deTai.getId());
		int a = preparedStatement.executeUpdate();
		if( a >0) {
			check = true;
			System.out.println("up date thanh cong "+ deTai.getId());
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return check;
	
}

public  DeTaiNghienCuu getDeTaiById(int id){
	
	Connection con;
	PreparedStatement preparedStatement;
	ResultSet rs;
	
	DeTaiNghienCuu  deTai = new DeTaiNghienCuu();
	try {
		
		con = ConnectDB.openConnection();
		preparedStatement = con.prepareStatement("select * from detainghiencuu where id=?");
		preparedStatement.setInt(1, id);
		rs = preparedStatement.executeQuery();
		
		if (rs.next()) {
			
			deTai.setId(rs.getInt("id"));
			deTai.setHoVaTen(rs.getString("ho_va_ten"));
			deTai.setMaSV(rs.getString("ma_sinh_vien"));
			deTai.setKhoa(rs.getString("khoa"));
			deTai.setTenDeTai(rs.getString("ten_de_tai"));
			deTai.setLinhVuc(rs.getString("linh_vuc"));
			deTai.setThoiGianDuKien(rs.getString("thoi_gian_du_kien"));
			deTai.setKinhPhi(rs.getString("kinh_phi"));
			deTai.setGhiChu(rs.getString("ghi_chu"));
			deTai.setTrangThaiDuyet(rs.getString("trang_thai_duyet"));
			deTai.setLyDo(rs.getString("ly_do"));
			deTai.setTinhTrang(rs.getString("tinh_trang"));
			deTai.setDiemSo(rs.getString("diem_so"));
			deTai.setDanhGia(rs.getString("danh_gia"));
			
			
			
		}
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	return deTai;
}

// láº¥y ra táº¥t cáº£ cÃ¡c Ä‘á»� tÃ i Ä‘Æ°á»£c duyá»‡t.
	public List<DeTaiNghienCuu> getAllDeTaiDuocDuyet() {

		Connection con;
		Statement statement;
		ResultSet rs;

		List<DeTaiNghienCuu> listDeTai = new ArrayList<DeTaiNghienCuu>();
		DeTaiNghienCuu deTai = null;
		try {

			con = ConnectDB.openConnection();
			statement = con.createStatement() ;
			rs = statement.executeQuery("select * from detainghiencuu Where trang_thai_duyet='DUYỆT'") ; 
			while (rs.next()) {
				deTai = new DeTaiNghienCuu();
				deTai.setId(rs.getInt("id"));
				deTai.setHoVaTen(rs.getString("ho_va_ten"));
				deTai.setMaSV(rs.getString("ma_sinh_vien"));
				deTai.setKhoa(rs.getString("khoa"));
				deTai.setTenDeTai(rs.getString("ten_de_tai"));
				deTai.setLinhVuc(rs.getString("linh_vuc"));
				deTai.setThoiGianDuKien(rs.getString("thoi_gian_du_kien"));
				deTai.setKinhPhi(rs.getString("kinh_phi"));
				deTai.setGhiChu(rs.getString("ghi_chu"));
				deTai.setTrangThaiDuyet(rs.getString("trang_thai_duyet"));
				deTai.setLyDo(rs.getString("ly_do"));
				deTai.setTinhTrang(rs.getString("tinh_trang"));
				deTai.setDiemSo(rs.getString("diem_so"));
				deTai.setDanhGia(rs.getString("danh_gia"));
				listDeTai.add(deTai);
			}
			// ket ns

		} catch (Exception e) {
			// TODO: handle exception
		}
		return listDeTai;

	}
// láº¥y ra cÃ¡c Ä‘á»� tÃ i bá»‹ há»§y
	public List<DeTaiNghienCuu> getAllDeTaiBiHuy() {

		Connection con;
		Statement statement;
		ResultSet rs;

		List<DeTaiNghienCuu> listDeTai = new ArrayList<DeTaiNghienCuu>();
		DeTaiNghienCuu deTai = null;
		try {

			con = ConnectDB.openConnection();
			statement = con.createStatement() ;
			rs = statement.executeQuery("select * from detainghiencuu Where trang_thai_duyet='HỦY'") ; 
			while (rs.next()) {
				deTai = new DeTaiNghienCuu();
				deTai.setId(rs.getInt("id"));
				deTai.setHoVaTen(rs.getString("ho_va_ten"));
				deTai.setMaSV(rs.getString("ma_sinh_vien"));
				deTai.setKhoa(rs.getString("khoa"));
				deTai.setTenDeTai(rs.getString("ten_de_tai"));
				deTai.setLinhVuc(rs.getString("linh_vuc"));
				deTai.setThoiGianDuKien(rs.getString("thoi_gian_du_kien"));
				deTai.setKinhPhi(rs.getString("kinh_phi"));
				deTai.setGhiChu(rs.getString("ghi_chu"));
				deTai.setTrangThaiDuyet(rs.getString("trang_thai_duyet"));
				deTai.setLyDo(rs.getString("ly_do"));
				deTai.setTinhTrang(rs.getString("tinh_trang"));
				deTai.setDiemSo(rs.getString("diem_so"));
				deTai.setDanhGia(rs.getString("danh_gia"));
				listDeTai.add(deTai);
			}
			// ket ns

		} catch (Exception e) {
			// TODO: handle exception
		}
		return listDeTai;

	}
	
	

}
