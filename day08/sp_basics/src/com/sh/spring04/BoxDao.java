package com.sh.spring04;

import java.util.List;

public interface BoxDao {
	void add(Box box);
	List<Box> getBoxList();
	void setBoxList(List<Box> boxList);
}



