package com.roadom.customer.model;

import com.roadom.base.module.BaseModel;

public class Vote extends BaseModel{
	private Integer customerId;
	private Integer optionId;
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getOptionId() {
		return optionId;
	}
	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}
	
	
}
