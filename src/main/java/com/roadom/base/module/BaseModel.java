package com.roadom.base.module;

import java.util.Date;

public class BaseModel {
	private Integer id;
	private Date craeteTime;
	private boolean isDeleted;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getCraeteTime() {
		return craeteTime;
	}
	public void setCraeteTime(Date craeteTime) {
		this.craeteTime = craeteTime;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
	
	
	
}
