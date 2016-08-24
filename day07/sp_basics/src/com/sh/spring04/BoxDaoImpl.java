package com.sh.spring04;

import java.util.List;

public class BoxDaoImpl implements BoxDao {
	private List<IBox> boxList;
	
	public BoxDaoImpl() {
		
	}
	
	@Override
	public void add(IBox box) {
		boxList.add(box);
	}

	@Override
	public List<IBox> getBoxList() {
		return this.boxList;
	}

	@Override
	public void setBoxList(List<IBox> boxList) {
		this.boxList = boxList;
	}
	
}
