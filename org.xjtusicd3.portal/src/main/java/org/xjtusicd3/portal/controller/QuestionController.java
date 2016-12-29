package org.xjtusicd3.portal.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.xjtusicd3.portal.service.QuestionService;
import org.xjtusicd3.portal.view.QuestionView;

@Controller
public class QuestionController {
	/*
	 * 问题列表的显示
	 */
	@RequestMapping(value="listquestion",method=RequestMethod.GET)
	public ModelAndView getlistquestion(){
		ModelAndView modelAndView = new ModelAndView("question");
		List<QuestionView> questionViews = QuestionService.question();
		modelAndView.addObject("questionViews",questionViews);
		return modelAndView;
	}

	/*
	 * 问题的删除
	 */
	@RequestMapping(value="deletequestion",method=RequestMethod.GET)
	public ModelAndView deletequestion(int q){
		QuestionService.updatequestion(q);
		ModelAndView modelAndView = new ModelAndView("question");
		List<QuestionView> questionViews = QuestionService.question();
		modelAndView .addObject("questionViews", questionViews);
		return modelAndView;
	}
}
