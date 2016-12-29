package org.xjtusicd3.partner.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.xjtusicd3.partner.service.QuestionService;
import org.xjtusicd3.partner.view.CourseAddView;
import org.xjtusicd3.partner.view.QuestionView;


@Controller
public class QuestionController {
	/*
	 * 界面
	 */
	@RequestMapping(value="addquestion",method=RequestMethod.GET)
	public ModelAndView addquestion() {
		ModelAndView mv = new ModelAndView("addquestion");
		return mv;
	}
	/*
	 * 添加问题
	 */
	@RequestMapping(value="addQuestion",method=RequestMethod.POST)
	public ModelAndView addQuestion(QuestionView questionView,CourseAddView courseAddView,HttpSession session){
		Object object = session.getAttribute("session_userId");
		if(object==null){
			return new ModelAndView("user/login");
			}
			Integer userid = (Integer) object;
			//获取时间
			long l = System.currentTimeMillis();
			Date date = new Date(l);
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			//获取分类
			String classifyName = courseAddView.getClassifyName();
			int classifyId=0;
			try {
			    classifyId = Integer.parseInt(classifyName);
			} catch (NumberFormatException e) {
			    e.printStackTrace();
			}
			questionView.setUserId(userid);
			questionView.setQuestionDate(dateFormat.format(date));
			questionView.setClassifyId(classifyId);
			questionView.setQuestionTitle(questionView.getQuestionTitle());
			questionView.setQuestionText(questionView.getQuestionText());
			QuestionService.addQuestion(questionView);
			List<QuestionView> questionViews = QuestionService.selectQuestion(1);
			ModelAndView modelAndView = new ModelAndView("question");
			modelAndView.addObject("questionViews",questionViews);
		return modelAndView;
	}
	/*
	 * 查看问题
	 */
	@RequestMapping(value="selectQuestion",method=RequestMethod.GET)
	public ModelAndView selectQuestion(HttpSession session){
		Object object = session.getAttribute("session_userId");
		if(object==null){
			return new ModelAndView("redirect:/user/login.html");
			}
			Integer userid = (Integer) object;
			List<QuestionView> questionViews = QuestionService.selectQuestion(1);
			ModelAndView modelAndView = new ModelAndView("question");
			modelAndView.addObject("questionViews",questionViews);
			return modelAndView;
	}
	
}
