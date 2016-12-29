package org.xjtusicd3.portal.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.xjtusicd3.portal.service.UserService;
import org.xjtusicd3.portal.view.UserView;

@Controller
public class UserController {
	/*
	 * 教师的申请列表显示----待审批
	 */
	@RequestMapping(value="waitteacher",method=RequestMethod.GET)
	public ModelAndView getwaitTeacher(){
		ModelAndView modelAndView = new ModelAndView("teacher");
		List<UserView> userViews = UserService.teacher();
		modelAndView.addObject("userViews", userViews);
		return modelAndView;
	}
	/*
	 * 教师列表显示---已通过
	 */
	@RequestMapping(value="passteacher",method=RequestMethod.GET)
	public ModelAndView getpassTeacher(){
		ModelAndView modelAndView = new ModelAndView("teacher2");
		List<UserView> userViews = UserService.teacher2();
		modelAndView.addObject("userViews", userViews);
		return modelAndView;
	}
	/*
	 * 用户申请成为教师
	 */
	@RequestMapping(value="successteacher",method=RequestMethod.GET)
	public ModelAndView successTeacher(int u){
		UserService.updateTeacher(u);
		ModelAndView modelAndView = new ModelAndView("teacher");
		List<UserView> userViews = UserService.teacher();
		modelAndView.addObject("userViews", userViews);
		return modelAndView;
	}
	/*
	 * 撤销用户老师
	 */
	@RequestMapping(value="failteacher",method=RequestMethod.GET)
	public ModelAndView failteacher(int u){
		UserService.updateTeacher2(u);
		ModelAndView modelAndView = new ModelAndView("teacher2");
		List<UserView> userViews = UserService.teacher2();
		modelAndView.addObject("userViews", userViews);
		return modelAndView;
	}
}
