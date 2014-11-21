package com.roadom.customerServices.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.roadom.base.controller.BaseController;
import com.roadom.customerServices.biz.CustomerServicesBiz;


@Controller
@RequestMapping("/customerServices")
public class CustomerServicesController extends BaseController {
	
	private CustomerServicesBiz customerServicesBiz;
	
	
//	
//	@RequestMapping(value="/{someMethod}", method=RequestMethod.GET)
//	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response, @PathVariable String someMethod){
//		ModelAndView result = new ModelAndView();
//
//		if("index".equals(someMethod)){
//			this.index(request, response, "");
//		}
//		
//		System.out.println("##############################");
//		return result;
//	}
	
	
	
	/**
	 * 跳至机器人页面
	 * 
	 * @param request
	 * @param response
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/index/{id}", method=RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response, @PathVariable String id){
		ModelAndView result = new ModelAndView("customerServices/index");
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		return result;
	}
	
	
	/**
	 * 发问
	 * @param question
	 * @return
	 */
	@RequestMapping(value="/result/{question}", method=RequestMethod.GET)
	public ModelAndView result(@PathVariable String question){
		ModelAndView modelAndView = new ModelAndView();
		
		String result = customerServicesBiz.getRobotAnswer(question);
		modelAndView.addObject(result);
		
		return modelAndView;
	}
	
}