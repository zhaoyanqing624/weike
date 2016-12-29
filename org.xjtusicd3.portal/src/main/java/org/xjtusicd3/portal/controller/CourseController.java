package org.xjtusicd3.portal.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.xjtusicd3.portal.service.CourseService;
import org.xjtusicd3.portal.view.CourseView;

@Controller
public class CourseController {
	/*
	 * 课程的列表显示---待审批
	 */
	@RequestMapping(value="waitcourse",method=RequestMethod.GET)
	public ModelAndView getwaitcourse(){
		ModelAndView modelAndView  = new ModelAndView("course");
		List<CourseView> courseViews = CourseService.course();
		modelAndView.addObject("courseViews",courseViews);
		return modelAndView;
	}
	/*
	 * 课程的列表显示--成功
	 */
	@RequestMapping(value="passcourse",method=RequestMethod.GET)
	public ModelAndView getsuccesscourse(){
		ModelAndView modelAndView  = new ModelAndView("course2");
		List<CourseView> courseViews = CourseService.course2();
		modelAndView.addObject("courseViews",courseViews);
		return modelAndView;
	}
	/*
	 * 课程申请成功
	 */
	@RequestMapping(value="successcourse",method=RequestMethod.GET)
	public ModelAndView successcourse(int c){
		CourseService.updateCourse(c);
		ModelAndView modelAndView = new ModelAndView("course");
		List<CourseView> courseViews = CourseService.course();
		modelAndView.addObject("courseViews",courseViews);
		return modelAndView;
	}
	/*
	 * 课程撤销
	 */
	@RequestMapping(value="failcourse",method=RequestMethod.GET)
	public ModelAndView failcourse(int c){
		CourseService.updateCourse2(c);
		ModelAndView modelAndView = new ModelAndView("course2");
		List<CourseView> courseViews = CourseService.course2();
		modelAndView.addObject("courseViews",courseViews);
		return modelAndView;
	}
}
