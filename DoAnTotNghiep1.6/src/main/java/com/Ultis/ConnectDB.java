package com.Ultis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectDB {

	private static String DB_URL = "jdbc:mysql://localhost:3306/newdoan";
	private static String USER_NAME = "root";
	private static String PASSWORD = "phatbopp1198@@@@";

	public static Connection openConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);

		} catch (ClassNotFoundException ex) {

			ex.printStackTrace();
		} catch (SQLException ex) {

			ex.printStackTrace();
		}
		return con;
	}

	public static void closeAll(Connection con, PreparedStatement pstmt, ResultSet rs) {
		if (con != null)
			try {
				con.close();
			} catch (SQLException ex) {
			

				ex.printStackTrace();
			}
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (SQLException ex) {

				ex.printStackTrace();
			}
		if (rs != null)
			try {
				rs.close();
			} catch (SQLException ex) {

				ex.printStackTrace();
			}
	}
}
