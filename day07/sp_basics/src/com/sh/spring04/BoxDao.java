package com.sh.spring04;

import java.util.List;

public interface BoxDao {
	void add(IBox box);
	List<IBox> getBoxList();
	void setBoxList(List<IBox> boxList);
}



