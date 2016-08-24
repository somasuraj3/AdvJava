package com.sh.pizza;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PizzaCustomerDao {
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

	public Customer findCustomer(String email) throws Exception {
		String sql = "SELECT ID, NAME, PASSWORD, MOBILE, ADDRESS, EMAIL FROM PIZZA_Customers WHERE EMAIL=?";
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, email);
			rs = stmt.executeQuery();
			if(rs.next()) {
				Customer cust = new Customer();
				cust.setId(rs.getInt("ID"));
				cust.setName(rs.getString("NAME"));
				cust.setPassword(rs.getString("PASSWORD"));
				cust.setMobile(rs.getString("MOBILE"));
				cust.setAddress(rs.getString("ADDRESS"));
				cust.setEmail(rs.getString("EMAIL"));
				return cust;
			}
		} finally {
			if(rs!=null)
				rs.close();
			if(stmt!=null)
				stmt.close();
		}
		return null;
	}
}
