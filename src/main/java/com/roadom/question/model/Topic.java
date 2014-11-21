package com.roadom.question.model;

import com.roadom.base.module.BaseModel;

/**
 * 话题基类
 * @author roadom
 */
public class Topic extends BaseModel{
	private String name;
	private Integer heat;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHeat() {
		return heat;
	}
	public void setHeat(Integer heat) {
		this.heat = heat;
	}
	
	
}
