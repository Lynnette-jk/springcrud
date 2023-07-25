package com.july.springcrud.model;

public class Subcategories {
	private Integer subcategoryid;
	private String subcategoryname;
	private Integer categoryid;
	public Integer getSubcategoryid() {
		return subcategoryid;
	}
	public void setSubcategoryid(Integer subcategoryid) {
		this.subcategoryid = subcategoryid;
	}
	public String getSubcategoryname() {
		return subcategoryname;
	}
	public void setSubcategoryname(String subcategoryname) {
		this.subcategoryname = subcategoryname;
	}
	public Integer getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

}
