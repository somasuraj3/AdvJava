package com.sh.jsp2;

public class CapBean {
	private String uname;
	private String capName;
	public CapBean() {
		this.uname = "";
		this.capName = "";
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getCapName() {
		return capName;
	}
	public void setCapName(String capName) {
		this.capName = capName;
	}
	public String toString() {
		return "CapBean [uname=" + uname + ", capName=" + capName + "]";
	}
	public void convert() {
		this.capName = this.uname.toUpperCase();
	}
}



