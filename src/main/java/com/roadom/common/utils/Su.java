package com.roadom.common.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;

public class Su {
	
	private static JsonGenerator jsonGenerator;
	private static ObjectMapper objectMapper = new ObjectMapper();
	public Su(){
		
		try {
			jsonGenerator = objectMapper.getJsonFactory().createJsonGenerator(System.out, JsonEncoding.UTF8);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public static boolean isTrimEmpty(String str){
		str = org.apache.commons.lang.StringUtils.trimToEmpty(str);
		return org.apache.commons.lang.StringUtils.isEmpty(str);
	}
	
	public static Map<Object, Object> json2Map(String json){
		Map<Object, Object> result = new HashMap<Object, Object>();
			try {
				jsonGenerator.writeString(json);
				objectMapper.writeValue(System.out, result);
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		return result;
	}
}
