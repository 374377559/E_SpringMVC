package cn.web.controller;

import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.web.entity.StuCls;
import cn.web.service.StuClsService;

@Controller
@RequestMapping("/clsAction")
public class StuClsAction {
	
	@Resource
	private StuClsService stuClsService;
	
	@RequestMapping("/addCls")
	public String addCls(StuCls cls,PrintWriter out,HttpServletResponse Response){
		Response.setContentType("text/html;charset=UTF-8");
		if(stuClsService.addCls(cls)){
			out.print("<script>alert('添加成功！！！');location.href='../index.jsp';</script>");
		}else{
			out.print("<script>alert('添加失败！！！');location.href='../index.jsp';</script>");
		}
		return null;
	}
	
}
