package com.roadom.question.model;

import com.roadom.base.module.BaseModel;

/**
 * 选项基类
 * @author roadom
 */
public class Option extends BaseModel{
	private String content;		//文本内容
	private Integer score;			//获得支持数
	private Integer questionId;		//关联问题id
	private Integer customerId;		//选项创建人
	
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	
}
