package cn.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;

import cn.web.entity.StuCls;

@RequestMapping("clsAction")
public class StuClsAction {
	
	public String addCls(StuCls cls,HttpServletRequest Request,HttpServletResponse Response){
		System.out.println(cls.getCname());
		
		
		return null;
	}
	
}
