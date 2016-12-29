package org.xjtusicd3.portal.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.xjtusicd3.portal.service.AnswerService;
import org.xjtusicd3.portal.view.AnswerView;

@Controller
public class AnswerController {
	/*
	 * 问题回复列表显示
	 */
	@RequestMapping(value="listanswer",method=RequestMethod.GET)
	public ModelAndView getlistanswer(int q,HttpSession session){
		ModelAndView modelAndView = new ModelAndView("question2");
		List<AnswerView> answerViews = AnswerService.answer(q);
		modelAndView.addObject("answerViews", answerViews);
		session.setAttribute("listquestionId", q);
		
		return modelAndView;
	}
	
	/*
	 * 不合格回复删除
	 */
	@RequestMapping(value="deleteanswer",method=RequestMethod.GET)
	public ModelAndView deleteanswer(int a,HttpSession session){
		Object object = session.getAttribute("listquestionId");
		Integer listquestionId = (Integer) object;
		AnswerService.updateanswer2(a);
		ModelAndView modelAndView = new ModelAndView("question2");
		
		List<AnswerView> answerViews = AnswerService.answer(listquestionId);
		modelAndView.addObject("answerViews", answerViews);
		return modelAndView;
	}
}
