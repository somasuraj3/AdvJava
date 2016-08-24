package com.sh.spring02;

public interface IBox {
	ILog getLogger();
	void setLogger(ILog logger);
	void setLength(int length);
	void setBreadth(int breadth);
	void setHeight(int height);
	int getLength();
	int getBreadth();
	int getHeight();
	int calcVolume();
}
