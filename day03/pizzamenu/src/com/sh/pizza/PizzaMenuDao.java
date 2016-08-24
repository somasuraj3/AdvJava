package com.sh.pizza;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PizzaMenuDao {
	private Connection con;
	private PreparedStatement stmt;
	
	public void open() throws Exception {
		con = new DbUtil().openConnection();
	}
	
	public void close() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
		}
	}
	
	public List<String> getTypes() throws Exception {
		String sql = "SELECT DISTINCT TYPE FROM PIZZA_ITEMS";
		List<String> list = new ArrayList<>();
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next())
				list.add(rs.getString("TYPE"));
		} finally {
			if(rs!=null)
				rs.close();
			if(stmt!=null)
				stmt.close();
		}
		return list;
	}
	
	public List<String> getCategories(String type) throws Exception {
		String sql = "SELECT DISTINCT CATEGORY FROM PIZZA_ITEMS WHERE TYPE=?";
		List<String> list = new ArrayList<>();
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, type);
			rs = stmt.executeQuery();
			while(rs.next())
				list.add(rs.getString("CATEGORY"));
		} finally {
			if(rs!=null)
				rs.close();
			if(stmt!=null)
				stmt.close();
		}
		return list;
	}
	
	public List<Item> getItems(String type, String category) throws Exception {
		String sql = "SELECT ID, TYPE, CATEGORY, NAME, DESCRIPTION FROM PIZZA_ITEMS WHERE TYPE=? AND CATEGORY=?";
		List<Item> list = new ArrayList<>();
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, type);
			stmt.setString(2, category);
			rs = stmt.executeQuery();
			while(rs.next()) {
				Item item = new Item();
				item.setId(rs.getInt("ID"));
				item.setType(rs.getString("TYPE"));
				item.setCategory(rs.getString("CATEGORY"));
				item.setName(rs.getString("NAME"));
				item.setDescription(rs.getString("DESCRIPTION"));
				list.add(item);
			}
		} finally {
			if(rs!=null)
				rs.close();
			if(stmt!=null)
				stmt.close();
		}
		return list;		
	}
	
	public void insertItem(Item item) throws Exception {
		int cnt;
		String sql = "INSERT INTO PIZZA_ITEMS(TYPE, CATEGORY, NAME, DESCRIPTION) VALUES(?,?,?,?)";
		stmt = con.prepareStatement(sql);
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, item.getType());
			stmt.setString(2, item.getCategory());
			stmt.setString(3, item.getName());
			stmt.setString(4, item.getDescription());
			cnt = stmt.executeUpdate();
			if(cnt!=1)
				throw new Exception("Record not inserted.");
		} finally {
			if(stmt!=null)
				stmt.close();
		}
	}
}
