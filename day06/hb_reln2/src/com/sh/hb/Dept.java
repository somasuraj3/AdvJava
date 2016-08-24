package com.sh.hb;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTMENT")
public class Dept {
	@Id
	@Column
	private int deptno;
	@Column
	private String dname;
	@Column
	private String loc;
	@OneToMany(mappedBy="dept", fetch=FetchType.EAGER, cascade={CascadeType.ALL})
	private List<Emp> empList;
	
	public Dept() {
		this(0, "", "");
	}
	public Dept(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
		this.empList = new ArrayList<>();
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public List<Emp> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Emp> empList) {
		this.empList = empList;
	}
	@Override
	public String toString() {
		return String.format("Dept [deptno=%s, dname=%s, loc=%s]", deptno, dname, loc);
	}
}
