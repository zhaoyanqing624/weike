package org.xjtusicd3.partner.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.jws.WebParam.Mode;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.xjtusicd3.partner.service.CourseListService;
import org.xjtusicd3.partner.service.QuestionService;
import org.xjtusicd3.partner.service.SearchService;
import org.xjtusicd3.partner.view.CourseAddView;
import org.xjtusicd3.partner.view.CourseListView;
import org.xjtusicd3.partner.view.QuestionView;
import org.xjtusicd3.partner.view.SearchView;

@Controller
public class SearchController {
	/*
	 * 增加搜索记录
	 */
	@RequestMapping(value="searchresult",method=RequestMethod.POST)
	public ModelAndView addsearch(SearchView searchView,CourseAddView courseAddView,HttpSession session){
//		ModelAndView modelAndView = null;
		Object object = session.getAttribute("session_userId");
		if(object==null){
			return new ModelAndView("redirect:/user/login.html");
		}
		Integer userid = (Integer) object;
		String searchName = searchView.getSearchName();
		searchView.setUserId(userid);
		long l = System.currentTimeMillis();
		Date date = new Date(l);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(dateFormat.format(date));
		searchView.setSearchData(dateFormat.format(date));
		searchView.setSearchName(searchName);
		SearchService.addSearch(searchView);
		ModelAndView modelAndView = new ModelAndView("search");
		List<CourseListView> courseList = CourseListService.courseList2(searchName);
		int courseListNumber = CourseListService.courseList3(searchName);
		List<QuestionView> questionViews = QuestionService.questionList(searchName);
		int questionListNumber = QuestionService.questionList2(searchName);
		List<SearchView> searchViews = SearchService.selectHotSearch();
		int number = courseListNumber+questionListNumber;
		modelAndView.addObject("courseList", courseList);
		modelAndView.addObject("searchViews", searchViews);
		modelAndView.addObject("questionViews", questionViews);
		modelAndView.addObject("number", number);
		session.setAttribute("session_searchName", searchView.getSearchName());
		return modelAndView;
		
	}
	
	/*
	 * 搜索--课程
	 */
	@RequestMapping(value="searchCourse",method=RequestMethod.GET)
	public ModelAndView searchResult(HttpSession session){
		Object object = session.getAttribute("session_userId");
		Object object2 = session.getAttribute("session_searchName");
		if(object==null){
			return new ModelAndView("user/login");
		}
		Integer userid = (Integer) object;
		String searchName = (String) object2;
		List<CourseListView> courseList = CourseListService.courseList2(searchName);
		int courseListNumber = CourseListService.courseList3(searchName);
		List<SearchView> searchViews = SearchService.selectHotSearch();
		ModelAndView modelAndView = new ModelAndView("search2");
		modelAndView.addObject("courseList", courseList);
		modelAndView.addObject("courseListNumber", courseListNumber);
		modelAndView.addObject("searchViews", searchViews);
		session.setAttribute("session_searchName", searchName);
		return modelAndView;
	}
	
	/*
	 * 搜索--问题
	 */
	@RequestMapping(value="searchQuestion",method=RequestMethod.GET)
	public ModelAndView searchQuestion(HttpSession session){
		Object object = session.getAttribute("session_userId");
		Object object2 = session.getAttribute("session_searchName");
		if(object==null){
			return new ModelAndView("user/login");
		}
		ModelAndView modelAndView = new ModelAndView("search3");
		Integer userid = (Integer) object;
		String searchName = (String) object2;
		List<QuestionView> questionViews = QuestionService.questionList(searchName);
		int questionListNumber = QuestionService.questionList2(searchName);
		List<SearchView> searchViews = SearchService.selectHotSearch();
		modelAndView.addObject("searchViews", searchViews);
		modelAndView.addObject("questionViews", questionViews);
		modelAndView.addObject("questionListNumber", questionListNumber);
		session.setAttribute("session_searchName", searchName);
		return modelAndView;
		
	}
	/*
	 * 搜索---全部
	 */
	@RequestMapping(value="searchAll",method=RequestMethod.GET)
	public ModelAndView searchAll(HttpSession session){
		Object object = session.getAttribute("session_userId");
		Object object2 = session.getAttribute("session_searchName");
		if(object==null){
			return new ModelAndView("user/login");
		}
		Integer userid = (Integer) object;
		String searchName = (String) object2;
		ModelAndView modelAndView = new ModelAndView("search");
		List<CourseListView> courseList = CourseListService.courseList2(searchName);
		int courseListNumber = CourseListService.courseList3(searchName);
		List<QuestionView> questionViews = QuestionService.questionList(searchName);
		int questionListNumber = QuestionService.questionList2(searchName);
		List<SearchView> searchViews = SearchService.selectHotSearch();
		int number = courseListNumber+questionListNumber;
		modelAndView.addObject("courseList", courseList);
		modelAndView.addObject("searchViews", searchViews);
		modelAndView.addObject("questionViews", questionViews);
		modelAndView.addObject("number", number);
		session.setAttribute("session_searchName",searchName);
		return modelAndView;
	}


}
