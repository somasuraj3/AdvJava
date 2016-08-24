package com.sh.pizza;

public class LoginBean {
	private String user;
	private String password;
	public LoginBean() {
		this.user = "";
		this.password = "";
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return String.format("LoginBean [user=%s, password=%s]", user, password);
	}
	public boolean getStatus() {
		PizzaCustomerDao dao = new PizzaCustomerDao();
		try {
			dao.open();
			Customer cust = dao.findCustomer(user);
			if(cust!=null && password.equals(cust.getPassword()))
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dao.close();
		}
		return false;
	}
}
