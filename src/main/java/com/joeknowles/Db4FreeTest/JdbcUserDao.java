package com.joeknowles.Db4FreeTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class JdbcUserDao implements UserDao {
	private DataSource dataSource;
	
	public JdbcUserDao(DataSource ds) { dataSource = ds; }
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public List<User> getAllUsers() {
		List<User> retVal = new ArrayList<>();
		String sql = "SELECT * FROM jbk_merit_db.USER_DETAILS";
		
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			User u = null;
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				u = new User(
					rs.getString("name"), 
					rs.getString("password"),
					rs.getString("email"),
					rs.getString("gender"), 
					rs.getString("org"),
					rs.getString("language"),
					rs.getString("comments")
				);
				retVal.add(u);
			}
			rs.close();
			ps.close();
			return retVal;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}
	}
	
	@Override
	public void insert(User u){
		
		String sql = "INSERT INTO jbk_merit_db.USER_DETAILS " +
				"(name, password, email, gender, org, language, comments) VALUES (?, ?, ?, ?, ?, ?, ?)";
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getGender());
			ps.setString(5, u.getOrganization());
			ps.setString(6, u.getLanguage());
			ps.setString(7, u.getComments());
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}

	@Override
	public User findUserById(int userId){
		
		String sql = "SELECT * FROM jbk_merit_db.USER_DETAILS WHERE user_id = ?";
		
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, userId);
			User u = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				u = new User(
					rs.getString("username"), 
					rs.getString("password"),
					rs.getString("email"),
					rs.getString("gender"), 
					rs.getString("organization"),
					rs.getString("language"),
					rs.getString("comments")
				);
			}
			rs.close();
			ps.close();
			return u;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}
	}
}
