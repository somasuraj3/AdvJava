package com.sh.spring04;

public class BoxImpl implements Box {
	private int length;
	private int breadth;
	private int height;
	public BoxImpl() {
		this.length = 0;
		this.breadth = 0;
		this.height = 0;
		System.out.println("Box() called.");
	}
	public BoxImpl(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		System.out.println("Box(i,i,i) called.");
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
		System.out.println("Box.setLength() called");
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
		System.out.println("Box.setBreadth() called");
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
		System.out.println("Box.setHeight() called");
	}
	@Override
	public int calcVolume() {
		return this.length * this.breadth * this.height;
	}
	@Override
	public String toString() {
		return String.format("Box [length=%s, breadth=%s, height=%s]", length, breadth, height);
	}
}
