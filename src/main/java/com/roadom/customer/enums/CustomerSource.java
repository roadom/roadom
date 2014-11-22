package com.roadom.customer.enums;

import com.roadom.base.enums.BaseEnum;

public enum CustomerSource implements BaseEnum {
	website("主站"),
	qq("QQ"),
	douban("豆瓣"),
	weibo("微博"),
	baidu("百度"),
	renren("人人"),
	kaixin("开心")
	;
	
	private String chineseName;
	
	CustomerSource(String cn){
		chineseName = cn;
	}

	@Override
	public String getChineseName() {
		return this.chineseName;
	}
	
	
	
	
}
