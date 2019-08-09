//package com.joeknowles.Db4FreeTest;
//
//import java.sql.*;
//
//public class Connect2Db {
//	public static Connection connector() {
//		java.sql.Connection cnx = null;
//		String driver = "com.mysql.cj.jdbc.Driver";
//		String url = "jdbc:mysql://db4free.net:3306/jbk_merit_db";
//		String user = "jkhippie";
//		String password = "5da8ea58";
//		try {
//			Class.forName(driver);
//			cnx = DriverManager.getConnection(url, user, password);
//			System.out.println("xxxxx");
//			return cnx;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
//	}
//
//	public static void viewTable(Connection con) throws SQLException {
//		Statement stmt = null;
//		String query = "select name FROM jbk_merit_db.USER_DETAILS";
//		try {
//			stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery(query);
//			while (rs.next()) {
//				String firstName = rs.getString("name");
//				System.out.println(firstName);
//			}
//		} catch (SQLException e) {
//			System.out.println("SQL Error");
//		} finally {
//			if (stmt != null) {
//				stmt.close();
//			}
//		}
//	}
//	
//
//	
//
//}
