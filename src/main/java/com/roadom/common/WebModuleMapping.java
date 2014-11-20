package com.roadom.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 功能：给Controller指定模块路径
 * @author xianhai
 * @date 2013-9-22 上午10:55:43
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target({ElementType.TYPE})
public @interface WebModuleMapping {
	public String value() default "";
}
