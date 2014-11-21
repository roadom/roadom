package com.roadom.customer.model;

import com.roadom.base.module.BaseModel;

/**
 * 关注话题
 * @author roadom
 */
public class CustomerTopic extends BaseModel{
	private Integer customerId;
	private Integer topicId;
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getTopicId() {
		return topicId;
	}
	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}
}
