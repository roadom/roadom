package com.roadom.question.model;

import com.roadom.base.module.BaseModel;

/**
 * 问题基类
 * @author roadom
 */
public class Question extends BaseModel{
	
	private String content;
	private Integer customerId;
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
