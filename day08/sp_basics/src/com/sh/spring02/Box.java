package com.sh.spring02;

public class Box implements IBox {
	private int length;
	private int breadth;
	private int height;
	private ILog logger;
	public Box() {
		this.length = 0;
		this.breadth = 0;
		this.height = 0;
		if(logger!=null)
			logger.log("Box() called.");
	}
	public Box(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		if(logger!=null)
			logger.log("Box(i,i,i) called.");
	}
	public ILog getLogger() {
		return logger;
	}
	public void setLogger(ILog logger) {
		this.logger = logger;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
		if(logger!=null)
			logger.log("Box.setLength() called");
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
		if(logger!=null)
			logger.log("Box.setBreadth() called");
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
		if(logger!=null)
			logger.log("Box.setHeight() called");
	}
	@Override
	public int calcVolume() {
		if(logger!=null)
			logger.log("Box.calcVolume() called");
		return this.length * this.breadth * this.height;
	}
	@Override
	public String toString() {
		return String.format("Box [length=%s, breadth=%s, height=%s]", length, breadth, height);
	}
}
