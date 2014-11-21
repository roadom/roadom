package com.roadom.question.model;

import com.roadom.base.module.BaseModel;

/**
 * 问题所关联话题
 * @author roadom
 */
public class QuestionTopic extends BaseModel {
	private Integer questionId;
	private Integer topicId;
	
	public Integer getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
	public Integer getTopicId() {
		return topicId;
	}
	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}
	
	
}
