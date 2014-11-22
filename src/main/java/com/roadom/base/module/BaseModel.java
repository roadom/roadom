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
	
	@Override
	public String toString() {
		return "BaseModel [id=" + id + ", craeteTime=" + craeteTime
				+ ", isDeleted=" + isDeleted + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((craeteTime == null) ? 0 : craeteTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (isDeleted ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseModel other = (BaseModel) obj;
		if (craeteTime == null) {
			if (other.craeteTime != null)
				return false;
		} else if (!craeteTime.equals(other.craeteTime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isDeleted != other.isDeleted)
			return false;
		return true;
	}
	
	
	
	
	
}
