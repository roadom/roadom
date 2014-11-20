package com.roadom.common;

import java.lang.annotation.Annotation;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import com.roadom.common.utils.StringUtils;


/**
 * 功能：spring mvc请求映射管理，controller层无WebModuleMapping注解的默认为controller类的前缀
 * contrl类上有WebModuleMapping注解的，默认取该模块下的包名为模块目录，如果com.haixue.order 相应路径为/order/xxxx/method.do
 * 如WebModuleMapping("order-1")则对应的目录为/order-1/xxxx/method.do
 * 
 * @author xianhai
 * @date 2013-9-22 下午12:01:59
 */
public class WildcastUrlHandlerMapping extends SimpleUrlHandlerMapping
		implements BeanFactoryPostProcessor {
	public static final String CONTROLLER_BEAN_NAME_SUFFIX = "Controller";
	
	/**
	 * 用于获取自己的单例对象
	 */
	public static WildcastUrlHandlerMapping that;
	
	public WildcastUrlHandlerMapping(){
		that = this;
	}

	// private final static Log log =
	// LogFactory.getLog(WildcastUrlHandlerMapping.class);
	private void addWildCardHandler(String className,String controllerBeanName) {
		String urlPath = getWildcardPath(className,controllerBeanName);
		super.registerHandler(urlPath, controllerBeanName);
	}

	private String getWildcardPath(String className,String controllerName) {
		StringBuilder uriPart = new StringBuilder();
		
		Class<?> clazz = null;
		try {
			clazz = Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//判断contrl是不是有注解
		Annotation annotations[] = clazz.getAnnotations();
		for(Annotation at:annotations){
			if(at instanceof WebModuleMapping){
				String value = ((WebModuleMapping) at).value();
				//采用包名路径
				if(StringUtils.isTrimEmpty(value)){
					String modules[] = clazz.getName().split("\\.");
					if(modules!=null&&modules.length>3){
						uriPart.append(modules[2]).append("/");
					}
				}else{
					//采用开发人员指定路径
					uriPart.append(value).append("/");
				}
				
			}
		}
		
		uriPart.append(controllerName.substring(0, controllerName.length()
				- CONTROLLER_BEAN_NAME_SUFFIX.length()));
			
		String fullPath = "/" + uriPart + "/*";
		return fullPath;
	}
	
	@Override
	public void postProcessBeanFactory(
			ConfigurableListableBeanFactory beanFactory) throws BeansException {

		// GenericBeanDefinition definition = new GenericBeanDefinition();
		// definition.setBeanClass(SampleController.class);
		// definition.setSingleton(false);
		// definition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_NAME);
		// ((BeanDefinitionRegistry)beanFactory).registerBeanDefinition(ClassUtils.getLowerFirstLetterSimpleClassName(SampleController.class.getSimpleName()),
		// definition);
		//
		
		ConfigurableListableBeanFactory currentFactory = beanFactory;

		while (currentFactory != null) {
			for (String beanName : currentFactory.getBeanDefinitionNames()) {
				BeanDefinition definition1 = currentFactory
						.getBeanDefinition(beanName);
				
				String className = definition1.getBeanClassName();
				if (!StringUtils.isTrimEmpty(className) && className.endsWith(CONTROLLER_BEAN_NAME_SUFFIX)) {
					addWildCardHandler(className,beanName);
				}
			}
			currentFactory = (ConfigurableListableBeanFactory) currentFactory
					.getParentBeanFactory();
		}

	}
	
	public static Class<?> getClass(HttpServletRequest request){
		try {
			HandlerExecutionChain chain = (HandlerExecutionChain) that.getHandlerInternal(request);
			if(chain != null){
				return chain.getHandler().getClass();
			}
			return null;
		} catch (Exception e) {
			return null;
		}
	}
}
