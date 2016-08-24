package com.bkshop.models;

import java.util.ArrayList;
import java.util.List;

public class Subjects {
	private String subject;
	private List<String> subList;

	public Subjects() {
		this.setSubList(new ArrayList<String>());
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<String> getSubList() {
		return subList;
	}

	public void setSubList(List<String> subList) {
		this.subList = subList;
		// by default selection is first subject
		if(subList!=null && subList.size()>0)
			this.setSubject(subList.get(0));
	}

	
}
