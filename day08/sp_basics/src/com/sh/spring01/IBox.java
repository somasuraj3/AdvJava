package com.sh.spring01;

public interface IBox {
	void setLength(int length);
	void setBreadth(int breadth);
	void setHeight(int height);
	int getLength();
	int getBreadth();
	int getHeight();
	int calcVolume();
}
