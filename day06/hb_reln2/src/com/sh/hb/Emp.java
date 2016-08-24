package com.sh.hb;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;

@Entity
@Table(name="EMPLOYEE")
public class Emp {
	@Id
	@Column
	private int empno;
	@Column
	private String ename;
	@Column
	private double sal;
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="DEPTNO", insertable=true, updatable=false)
	private Dept dept;
	public Emp() {
		this(0, "", 0.0, null);
	}
	public Emp(int empno, String ename, double sal, Dept dept) {
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.dept = dept;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return String.format("Emp [empno=%s, ename=%s, sal=%s]", empno, ename, sal);
	}
}
