package org.xjtusicd3.partner.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.xjtusicd3.partner.service.AnswerService;
import org.xjtusicd3.partner.service.QuestionService;
import org.xjtusicd3.partner.service.UserService;
import org.xjtusicd3.partner.view.AnswerView;
import org.xjtusicd3.partner.view.GoodsView;
import org.xjtusicd3.partner.view.QuestionView;
import org.xjtusicd3.partner.view.UserView;

@Controller
public class AnswerController {
	/*
	 * 添加问题的回复
	 */
	@RequestMapping(value="addAnswer",method=RequestMethod.POST)
	public String addAnswer(HttpSession session,AnswerView answerView){
		Object object = session.getAttribute("session_userId");
		Object object2 = session.getAttribute("questionId");
		if(object==null){
			return "user/login";
			}
			Integer userid = (Integer) object;
			Integer questionId = (Integer) object2;
			//获取时间
			long l = System.currentTimeMillis();
			Date date = new Date(l);
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
			answerView.setUserId(userid);
			answerView.setAnswerDate(dateFormat.format(date));
			answerView.setAnswerName(answerView.getAnswerName());
			AnswerService.addQuestion(questionId,answerView);
			List<AnswerView> answerViews = AnswerService.selectAnswer(questionId);
			QuestionView questionView= QuestionService.selectQuestion2(questionId);
			UserView userView = UserService.check2(questionView.getUserId());
			int number = AnswerService.selectAnswerNumber(questionId);
			ModelAndView modelAndView = new ModelAndView("question2");
			modelAndView.addObject("answerViews", answerViews);
			modelAndView.addObject("questionTitle", questionView.getQuestionTitle());
			modelAndView.addObject("questionText", questionView.getQuestionText());
			modelAndView.addObject("questionuserId", questionView.getUserId());
			modelAndView.addObject("questionuserName", userView.getUserName());
			modelAndView.addObject("number", number);
			return "redirect:selectAnswer.html?q="+questionId;
	}
	/*
	 * 查看问题的回复
	 */
	@RequestMapping(value="selectAnswer",method=RequestMethod.GET)
	public ModelAndView selectAnswer(int q,HttpSession session){
		Object object = session.getAttribute("session_userId");
		if(object==null){
			return new ModelAndView("user/login");
			}
			Integer userid = (Integer) object;
			ModelAndView modelAndView = new ModelAndView("question2");
			QuestionView questionView = QuestionService.selectQuestion2(q);
			UserView userView = UserService.check2(questionView.getUserId());
			int number = AnswerService.selectAnswerNumber(q);
			int answerId = 0;
			int questionBestAnswer = QuestionService.selectQuestionBestAnswer(q);
			List<AnswerView> answerPersistences = null;
			List<AnswerView> answerPersistences2 = null;
			List<AnswerView> answerViews =null;
			if(questionBestAnswer==1){
				answerId = AnswerService.selectAnswerId(q);
				answerPersistences = AnswerService.selectBestAnswer(answerId);
				answerPersistences2 = AnswerService.selectOtherAnswer(q);
			}
			if(questionBestAnswer==0){
				answerViews = AnswerService.selectAnswer(q);
			}
			
			
			modelAndView.addObject("questionBestAnswer", questionBestAnswer);
			modelAndView.addObject("answerViews", answerViews);
			session.setAttribute("questionId", q);
			modelAndView.addObject("questionTitle", questionView.getQuestionTitle());
			modelAndView.addObject("questionText", questionView.getQuestionText());
			modelAndView.addObject("questionuserId", questionView.getUserId());
			modelAndView.addObject("questionuserName", userView.getUserName());
			modelAndView.addObject("answerPersistences", answerPersistences);
			modelAndView.addObject("answerPersistences2", answerPersistences2);
			modelAndView.addObject("number", number);
			return modelAndView;
	}
	
	/*
	 * 增加最好的答案
	 */
	@RequestMapping(value="bestAnswer",method=RequestMethod.GET)
	public ModelAndView bestAnswer(int a,HttpSession session){
		Object object = session.getAttribute("session_userId");
		if(object==null){
			return new ModelAndView("user/login");
			}
			Integer userid = (Integer) object;
			AnswerService.updateAnswer(a);
			int questionId = AnswerService.selectBestAnswer2(a);
			QuestionService.updateQuestion(questionId);
			int questionBestAnswer = QuestionService.selectQuestionBestAnswer(questionId);
			List<AnswerView> answerPersistences = null;
			List<AnswerView> answerPersistences2 = null;
			if(questionBestAnswer==1){
				answerPersistences = AnswerService.selectBestAnswer(a);
				answerPersistences2 = AnswerService.selectOtherAnswer(questionId);
			}
			ModelAndView modelAndView = new ModelAndView("question2");
			List<AnswerView> answerViews = AnswerService.selectAnswer(questionId);
			modelAndView.addObject("answerViews", answerViews);
			modelAndView.addObject("questionBestAnswer", questionBestAnswer);
			modelAndView.addObject("answer", a);
			modelAndView.addObject("answerPersistences", answerPersistences);
			modelAndView.addObject("answerPersistences2", answerPersistences2);
			
			return modelAndView;
	}
	
	/*
	 * 添加点赞功能
	 */
	@RequestMapping(value="addGoods",method=RequestMethod.GET)
	public String addGoods(int a,HttpSession session){
		Object object = session.getAttribute("session_userId");
		if(object==null){
			return "user/login";
			}
			Integer userid = (Integer) object;
			int questionId = AnswerService.selectAnswer2(a);
			Integer goodsId = AnswerService.selectGoods(a,userid);
			
			if(goodsId==null){
				AnswerService.addGoods(a,userid);
			}else {
				AnswerService.deleteGoods(goodsId);
			}
			return "redirect:selectAnswer.html?q="+questionId;
			
	}
	

}
