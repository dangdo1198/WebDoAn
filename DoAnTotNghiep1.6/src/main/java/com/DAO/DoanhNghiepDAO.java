package com.DAO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.Model.DoanhNghiepHopTac;
import com.Ultis.ConnectDB;

public class DoanhNghiepDAO {
	public List<DoanhNghiepHopTac> getAllDoanhNghiepHopTac(){
		Connection con;
		CallableStatement callableStatement;
		ResultSet rs;
		List<DoanhNghiepHopTac> listDoanhNghiep = new ArrayList<DoanhNghiepHopTac>();
		DoanhNghiepHopTac doanhNghiep = null;
		try {
			con = ConnectDB.openConnection();
			callableStatement = con.prepareCall("CALL doanh_nghiep()");
			rs = callableStatement.executeQuery();
			while (rs.next()) {
				doanhNghiep = new DoanhNghiepHopTac();
				doanhNghiep.setId(rs.getInt("id"));
				doanhNghiep.setTenDoanhNghiep(rs.getString("ten_doanh_nghiep"));
				doanhNghiep.setTenGiamDoc(rs.getString("ten_giam_doc"));
				doanhNghiep.setLinhVuc(rs.getString("linh_vuc"));
				doanhNghiep.setNamHopTac(rs.getString("nam_hop_tac"));
				doanhNghiep.setTruSoChinh(rs.getString("tru_so_chinh"));
				doanhNghiep.setSoDienThoai(rs.getString("so_dien_thoai"));
				doanhNghiep.setEmail(rs.getString("email"));
				doanhNghiep.setWebsite(rs.getString("website"));
				listDoanhNghiep.add(doanhNghiep);
				
		}
		
	}catch (Exception e) {
		// TODO: handle exception
	}
	return listDoanhNghiep;

	}
	






	public boolean deleteDoanhNghiep(int id) {
		Connection con = null;
		CallableStatement callableStatement= null;
		ResultSet rs= null;
		boolean check = false;
		try {
			con = ConnectDB.openConnection();
			callableStatement= con.prepareCall("{ call Delete_doanh_nghiep1(?)}");
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
	
	
public boolean addDoanhNghiep(DoanhNghiepHopTac doanhNghiep) {
		
	Connection con = null;
	CallableStatement callableStatement= null;
	ResultSet rs= null;

		boolean check= false;
		try {
			con = ConnectDB.openConnection();
			callableStatement= con.prepareCall("INSERT INTO doanhnghiephoptac (ten_doanh_nghiep,ten_giam_doc,linh_vuc,nam_hop_tac,tru_so_chinh,so_dien_thoai,email,website) VALUES (?,?,?,?,?,?,?,?)");
				
	
			
			callableStatement.setString(1, doanhNghiep.getTenDoanhNghiep());
			callableStatement.setString(2, doanhNghiep.getTenGiamDoc());
			callableStatement.setString(3, doanhNghiep.getLinhVuc());
			callableStatement.setString(4, doanhNghiep.getNamHopTac());
			callableStatement.setString(5, doanhNghiep.getTruSoChinh());
			callableStatement.setString(6, doanhNghiep.getSoDienThoai());
			callableStatement.setString(7, doanhNghiep.getEmail());
			callableStatement.setString(8, doanhNghiep.getWebsite());
			
			
			int a =  callableStatement.executeUpdate();
			
			
			if(a >0) {
				check = true;
				System.out.println("insert thanh cong: " + doanhNghiep.getTenDoanhNghiep());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			check = false;
		
		}
		
		
		return check;
	}




public boolean updateDoanhNghiep(DoanhNghiepHopTac doanhNghiep) {
	boolean check= false;
	Connection con = null;
	PreparedStatement preparedStatement = null;
	try {
		con = ConnectDB.openConnection();
		preparedStatement = con.prepareStatement("UPDATE doanhnghiephoptac  SET ten_doanh_nghiep=?,ten_giam_doc=?,linh_vuc=?,nam_hop_tac=?,tru_so_chinh=?,so_dien_thoai=?,website=? WHERE id=?");

		preparedStatement.setString(1,doanhNghiep.getTenDoanhNghiep());
		preparedStatement.setString(2, doanhNghiep.getTenGiamDoc());
		preparedStatement.setString(3, doanhNghiep.getLinhVuc());
//	
		preparedStatement.setString(4, doanhNghiep.getNamHopTac());
		preparedStatement.setString(5, doanhNghiep.getTruSoChinh());
		preparedStatement.setString(6, doanhNghiep.getSoDienThoai());
//		preparedStatement.setString(7, doanhNghiep.getEmail());
		preparedStatement.setString(7, doanhNghiep.getWebsite());
		preparedStatement.setInt(8, doanhNghiep.getId());
		
		
		int a = preparedStatement.executeUpdate();
		if( a >0) {
			check = true;
			System.out.println("up date thanh cong "+ doanhNghiep.getId());
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return check;
	
}


public  DoanhNghiepHopTac getDoanhNghiepById(int id){
	
	Connection con;
	PreparedStatement preparedStatement;
	ResultSet rs;
	
	
	DoanhNghiepHopTac doanhNghiep = new DoanhNghiepHopTac();
	try {
		
		con = ConnectDB.openConnection();
		preparedStatement = con.prepareStatement("select * from doanhnghiephoptac where id=?");
		preparedStatement.setInt(1, id);
		rs = preparedStatement.executeQuery();
		
		if (rs.next()) {
			doanhNghiep.setId(rs.getInt("id"));
			doanhNghiep.setTenDoanhNghiep(rs.getString("ten_doanh_nghiep"));
			doanhNghiep.setTenGiamDoc(rs.getString("ten_giam_doc"));
			doanhNghiep.setLinhVuc(rs.getString("linh_vuc"));
			doanhNghiep.setNamHopTac(rs.getString("nam_hop_tac"));
			doanhNghiep.setTruSoChinh(rs.getString("tru_so_chinh"));
			doanhNghiep.setSoDienThoai(rs.getString("so_dien_thoai"));
			doanhNghiep.setEmail(rs.getString("email"));
			doanhNghiep.setWebsite(rs.getString("website"));
			
			
			
			
			
		}
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	return doanhNghiep;
	

	
}

}
