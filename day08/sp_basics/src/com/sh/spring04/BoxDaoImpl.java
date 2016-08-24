package com.sh.spring04;

import java.util.List;

public class BoxDaoImpl implements BoxDao {
	private List<Box> boxList;
	
	public BoxDaoImpl() {
		
	}
	
	@Override
	public void add(Box box) {
		boxList.add(box);
	}

	@Override
	public List<Box> getBoxList() {
		return this.boxList;
	}

	@Override
	public void setBoxList(List<Box> boxList) {
		this.boxList = boxList;
	}
	
}
