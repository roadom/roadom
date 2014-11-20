package com.roadom.customerServices.biz;


import java.io.IOException;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.springframework.stereotype.Service;

import com.roadom.base.biz.BaseBiz;
import com.roadom.common.utils.HttpUtils;
import com.roadom.common.utils.StringUtils;

@Service
public class CustomerServicesBiz extends BaseBiz{
	
	public static final String ROBOT_URL = "http://www.tuling123.com/openapi/api?key=71b23459ed098811b6f4840d65e7c5ce";
	
	public String getRobotAnswer(String question){
		String result = "";
		
		try {
			String resultJSON = HttpUtils.get(ROBOT_URL+"&info="+question);
			Map<Object, Object> map = StringUtils.json2Map(resultJSON);
			map.get("code");
			result = (String) map.get("text");
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
