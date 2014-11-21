package com.roadom.customer.model;

import com.roadom.base.module.BaseModel;

/**
 * 用户关注用户
 * @author roadom
 */
public class CustomerFollow extends BaseModel{
	private Integer subjectId;	//主语
	private Integer objectId;	//宾语
	
	
	public Integer getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
	public Integer getObjectId() {
		return objectId;
	}
	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
	}
	
	
}
