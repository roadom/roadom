package com.roadom.customer.enums;

import com.roadom.base.enums.BaseEnum;

public enum CustomerSource {
	website("主站");
	
	private String chineseName;
	
	CustomerSource(String cn){
		chineseName = cn;
	}
	
	
}
