package cn.web.controller;

import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import cn.web.entity.Student;

@Controller
@RequestMapping("/stuAction")
public class StudentAction {
	  
	@RequestMapping(value="/add",method={RequestMethod.GET,RequestMethod.POST})
	public String add(Student stu,HttpServletRequest request,HttpServletResponse response,PrintWriter out){
		response.setContentType("text/html;charset=utf-8");
		if(stu!=null&&stu.getSname()!=null&&stu.getClass()!=null){
			if(stu.getSname().equals("Lucy")){
				System.out.println("姓名："+stu.getSname()+"，日期："+stu.getSdate());
				//获取session对象
				HttpSession session=request.getSession();
				session.setAttribute("stuname", stu.getSname());
				//获取上下文对象
				
				ServletContext cts=request.getServletContext();
				cts.setAttribute("ctx", stu.getSname());
				
				return "redirect:/index.jsp";
				
			}else{
				
				out.print("<script>alert('登录失败！用户名获密码不匹配！')</script>");
			}
			
		}else{
			out.print("<script>alert('用户名或密码不能为空！！！');location.href='login.jsp';</script>");
			
		}
		
		
		return null;
	}
	
	
	
}
