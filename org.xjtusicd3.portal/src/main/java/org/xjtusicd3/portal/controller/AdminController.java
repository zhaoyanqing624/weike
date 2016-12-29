package org.xjtusicd3.portal.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.xjtusicd3.portal.service.AdminService;
import org.xjtusicd3.portal.view.AdminView;

@Controller
public class AdminController {
	/*
	 * 界面
	 */
	@RequestMapping(value="user/login",method=RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("user/login");
		return mv;
	}
	@RequestMapping(value="index",method=RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	@RequestMapping(value="info",method=RequestMethod.GET)
	public ModelAndView info() {
		ModelAndView mv = new ModelAndView("info");
		return mv;
	}
	@RequestMapping(value="pass",method=RequestMethod.GET)
	public ModelAndView pass() {
		ModelAndView mv = new ModelAndView("pass");
		return mv;
	}
	@RequestMapping(value="teacher",method=RequestMethod.GET)
	public ModelAndView teacher() {
		ModelAndView mv = new ModelAndView("teacher");
		return mv;
	}
	@RequestMapping(value="teacher2",method=RequestMethod.GET)
	public ModelAndView teacher2() {
		ModelAndView mv = new ModelAndView("teacher2");
		return mv;
	}
	@RequestMapping(value="adv",method=RequestMethod.GET)
	public ModelAndView adv() {
		ModelAndView mv = new ModelAndView("adv");
		return mv;
	}
	@RequestMapping(value="question",method=RequestMethod.GET)
	public ModelAndView question() {
		ModelAndView mv = new ModelAndView("question");
		return mv;
	}
	@RequestMapping(value="question2",method=RequestMethod.GET)
	public ModelAndView question2() {
		ModelAndView mv = new ModelAndView("question2");
		return mv;
	}
	@RequestMapping(value="answer",method=RequestMethod.GET)
	public ModelAndView answer() {
		ModelAndView mv = new ModelAndView("answer");
		return mv;
	}
	@RequestMapping(value="comment",method=RequestMethod.GET)
	public ModelAndView comment() {
		ModelAndView mv = new ModelAndView("comment");
		return mv;
	}
	@RequestMapping(value="course",method=RequestMethod.GET)
	public ModelAndView course() {
		ModelAndView mv = new ModelAndView("course");
		return mv;
	}
	@RequestMapping(value="course2",method=RequestMethod.GET)
	public ModelAndView course2() {
		ModelAndView mv = new ModelAndView("course2");
		return mv;
	}
	@RequestMapping(value="list",method=RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView("list");
		return mv;
	}
	@RequestMapping(value="add",method=RequestMethod.GET)
	public ModelAndView add() {
		ModelAndView mv = new ModelAndView("add");
		return mv;
	}
	@RequestMapping(value="cate",method=RequestMethod.GET)
	public ModelAndView cate() {
		ModelAndView mv = new ModelAndView("cate");
		return mv;
	}
	@RequestMapping(value="test",method=RequestMethod.GET)
	public ModelAndView test() {
		ModelAndView mv = new ModelAndView("test");
		return mv;
	}
	
	
	
	/*
	 * 用户登录
	 */
	@RequestMapping(value="user/logincheck1",method=RequestMethod.POST)
	public ModelAndView logincheck(AdminView adminView,HttpSession session){
		ModelAndView modelAndView = null;
		try{
		AdminView adminView2 = AdminService.check(adminView);
		if(adminView2==null){
			modelAndView = new ModelAndView("error");
		}else{
			modelAndView = new ModelAndView("redirect:/index.html");
			modelAndView.addObject(adminView2);
			session.setAttribute("session_adminId", adminView2.getAdminId());
			session.setAttribute("session_adminNumber", adminView2.getAdminNumber());
			session.setAttribute("session_adminPassword", adminView2.getAdminPassword());
			session.setAttribute("session_adminYanzhengma", adminView2.getAdminYanzhengma());
		}
	}catch(Exception e){
		e.printStackTrace();
		modelAndView = new ModelAndView("user/login");
	}
	return modelAndView;
	}
	/*
	 * 用户退出
	 */
	@RequestMapping(value="loginout1",method=RequestMethod.GET)
	public String loginout(AdminView AdminView,HttpSession session){
		ModelAndView modelAndView = null;
		session.invalidate();
		return "redirect:/user/login.html";
	}
	/*
	 * 修改密码
	 */
	@RequestMapping(value="updateadmin",method=RequestMethod.POST)
	public ModelAndView myinfo2(HttpSession session,String adminPassword1,String adminPassword2,String adminPassword3){
		ModelAndView mv = null;
		Object object = session.getAttribute("session_adminId");
		if(object==null){
			return new ModelAndView("user/login");
			}
			Integer adminId = (Integer) object; 
			AdminView adminView = AdminService.check(adminId);
			String adminNumber = adminView.getAdminNumber();
			String adminPassword = adminView.getAdminPassword();
			System.out.println(adminPassword);//原密码
			System.out.println(adminPassword1);//第一个密码
			if(adminPassword1.equals(adminPassword)){
				if(adminPassword2.equals(adminPassword3) && !adminPassword2.equals(adminPassword1)){
					System.out.println(adminPassword2);
					adminPassword = adminPassword2;
					adminView.setAdminPassword(adminPassword);
					AdminService.update(adminView);
					ModelAndView modelAndView = null;
					AdminView adminView2 = AdminService.check(adminId);
					modelAndView = new ModelAndView("redirect:/info.html");
					return modelAndView;
				}else {
					return null;
				}
			}else {
				return null;
			}
	}
	
	
}
