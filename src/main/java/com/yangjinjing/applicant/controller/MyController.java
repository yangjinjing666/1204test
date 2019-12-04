package com.yangjinjing.applicant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
* @author 作者:杨今敬
* @version 创建时间：2019年12月4日 上午8:26:39
* 类功能说明 
*/
@Controller
public class MyController {
	
	//找到list方法
	@RequestMapping("list.do")
	public String list(){
		//跳转到list.jsp 显示页面
		return "list";
	}
}
