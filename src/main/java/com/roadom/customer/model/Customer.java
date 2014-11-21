package com.roadom.customer.model;

import com.roadom.base.module.BaseModel;
import com.roadom.customer.enums.CustomerSource;

/**
 * 用户基类
 * @author roadom
 */
public class Customer extends BaseModel{
	private String nickName;
	private String password;
	private String email;
	private CustomerSource source;
	
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public CustomerSource getSource() {
		return source;
	}
	public void setSource(CustomerSource source) {
		this.source = source;
	}
}
