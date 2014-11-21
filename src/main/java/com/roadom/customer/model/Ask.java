package com.roadom.customer.model;

import com.roadom.base.module.BaseModel;

/**
 * 用户提出的问题
 * @author roadom
 */
public class Ask extends BaseModel{
	private Integer customerId;
	private Integer questionId;
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
	
	
	
}
