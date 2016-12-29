package org.xjtusicd3.partner.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.xjtusicd3.partner.service.CommentService;
import org.xjtusicd3.partner.service.CourseListService;
import org.xjtusicd3.partner.service.RecordService;
import org.xjtusicd3.partner.service.VideoService;
import org.xjtusicd3.partner.view.CommentView;
import org.xjtusicd3.partner.view.CourseAddView;
import org.xjtusicd3.partner.view.CourseListView;
import org.xjtusicd3.partner.view.LastCourseView;
import org.xjtusicd3.partner.view.RecordView;
import org.xjtusicd3.partner.view.UserView;
import org.xjtusicd3.partner.view.VideoContentView;

@Controller

public class CourseListController {
	/*
	 * 课程列表显示
	 */
	@RequestMapping(value="course/course",method=RequestMethod.GET)
	public ModelAndView getCourseList(String c){
		ModelAndView modelAndView = new ModelAndView("course/course");
		List<CourseListView> courseList = CourseListService.courseList(c);
		
		modelAndView.addObject("c", c);
		modelAndView.addObject("courseList", courseList);
		return modelAndView;
	}
	/*
	 * 我的课程显示
	 */
	@RequestMapping(value="course/mycourse",method=RequestMethod.GET)
	public ModelAndView getMycourse(HttpSession session){
		ModelAndView modelAndView = new ModelAndView("course/course_personal2");
		Object object = session.getAttribute("session_userId");
		if(object==null){
			return new ModelAndView("user/login");
			}
			Integer userid = (Integer) object;
			List<CourseListView> courseListViews = CourseListService.myCourse(userid);
			
			modelAndView.addObject("courseListViews", courseListViews);
			return modelAndView;
			
	}
	@RequestMapping(value="course/mycourse1",method=RequestMethod.GET)
	public ModelAndView getMycourse1(HttpSession session){
		ModelAndView modelAndView = new ModelAndView("course/course_personal2");
		Object object = session.getAttribute("session_userId");
		if(object==null){
			return new ModelAndView("user/login");
			}
			Integer userid = (Integer) object;
			List<CourseListView> courseListViews = CourseListService.myCourse1(userid);
			
			modelAndView.addObject("courseListViews", courseListViews);
			return modelAndView;
			
	}
	@RequestMapping(value="course/mycourse2",method=RequestMethod.GET)
	public ModelAndView getMycourse2(HttpSession session){
		ModelAndView modelAndView = new ModelAndView("course/course_personal2");
		Object object = session.getAttribute("session_userId");
		if(object==null){
			return new ModelAndView("user/login");
			}
			Integer userid = (Integer) object;
			List<CourseListView> courseListViews = CourseListService.myCourse2(userid);
			
			modelAndView.addObject("courseListViews", courseListViews);
			return modelAndView;
			
	}
	
//	/*
//	 * search-课程搜索-热门搜索
//	 */
//	@RequestMapping(value="hotsearch",method=RequestMethod.GET)
//	public ModelAndView getCourseList2(String words){
//		ModelAndView modelAndView = new ModelAndView("search");
//		List<CourseListView> hotcourse = CourseListService.courseList2(words);
//		modelAndView.addObject("hotcourse", hotcourse);
//		modelAndView.addObject("words", words);
//		return modelAndView;
//	}
	
	/*
	 * 课程页面展开
	 */
	@RequestMapping(value="course/course2",method=RequestMethod.GET)
	public ModelAndView getCourse(int b,CourseAddView courseAddView,HttpSession session){
		Object object = session.getAttribute("session_userId");
		if(object==null){
			return new ModelAndView("user/login");
			}
			Integer userid = (Integer) object;
		ModelAndView modelAndView = new ModelAndView("course/course2");
		List<CourseListView> course = CourseListService.course(b);
		List<CourseListView> firstclassify = CourseListService.FirstClassify(b);
		List<CourseListView> secondtitle = CourseListService.SecondTitle(b);
		List<UserView> userViews = CourseListService.teacher(b);
		CourseAddView courseAddView2 = CourseListService.selectcourseimage(b);
		int courseId = courseAddView2.getCourseId();
//		//查找最近学习的视频
//		int lastvideoId = RecordService.selectRecord3(userid, courseId);
//		String lastvideoName1 = VideoService.selectVideoName(lastvideoId);
		double courseTime1 = VideoService.selectTotalTime(courseId);
		double courseTime =  (courseTime1/60);
		int courseTotalTime = (int) courseTime;
		CourseListService.updateCourseTime(courseId,courseTime);
		modelAndView.addObject("userViews", userViews);
		modelAndView.addObject("courseTotalTime", courseTotalTime);
		modelAndView.addObject("b", b);
		modelAndView.addObject("course", course);
		modelAndView.addObject("firstclassify", firstclassify);
		modelAndView.addObject("secondtitle", secondtitle);
//		modelAndView.addObject("lastvideoName1", lastvideoName1);

		return modelAndView;
	}

    /*
     * 第三层界面
     */
	@RequestMapping(value="course/course3",method=RequestMethod.GET)
	public ModelAndView getcourseURL(int c,HttpSession session,RecordView recordView){
		Object object = session.getAttribute("session_userId");
		if(object==null){
			return new ModelAndView("user/login");
			}
			Integer userid = (Integer) object; 
			
		ModelAndView modelAndView = new ModelAndView("course/course3");
		List<VideoContentView> videoURL = CourseListService.VideoURL(c);
		List<CourseListView> videoname3 = CourseListService.VideoName3(c);
		List<CommentView> commentViews = CommentService.selectComment(c);
		int courseId = VideoService.selectCourseId(c);
		long l = System.currentTimeMillis();
		Date date = new Date(l);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		RecordView recordView2 = RecordService.selectRecord(userid, courseId);
		//增加记录信息
		if(recordView2==null){
			recordView.setRecordDate(dateFormat.format(date));
			recordView.setUserId(userid);
			recordView.setVideoId(c);
			recordView.setCourseId(courseId);
			RecordService.addRecord(recordView);
		}else{
			//recordView.setRecordDate(dateFormat.format(date);
			String recordDate = dateFormat.format(date);
			int recordId = RecordService.selectRecord2(userid, courseId);
			RecordService.updateRecord(recordId,c,recordDate);
		}
		int courseTitleId=0;
		int videoId=0;
		String courseTitle=null;
		String videoName=null;
		List<LastCourseView> lastCourseViewsS = RecordService.lastCourse2(userid);
		for(LastCourseView lastCourseView:lastCourseViewsS){
			courseTitleId = lastCourseView.getCourseTitleId();
			videoId = lastCourseView.getVideoId();
			courseTitle = lastCourseView.getCourseTitle();
			videoName = lastCourseView.getVideoName();
		}
		session.setAttribute("lastcourseTitleId", courseTitleId);
		session.setAttribute("lastvideoId", videoId);
		session.setAttribute("lastcourseTitle", courseTitle);
		session.setAttribute("lastvideoName", videoName);
		session.setAttribute("cccc", c);
		modelAndView.addObject("c", c);
		modelAndView.addObject("videoURL", videoURL);
		modelAndView.addObject("videoname3", videoname3);
		modelAndView.addObject("commentViews", commentViews);
		return modelAndView;
	}

	/*
	 * 查看最近学习的列表
	 */
	@RequestMapping(value="course/lastcourse",method=RequestMethod.GET)
	public ModelAndView getLastcourse(HttpSession session){
		ModelAndView modelAndView = new ModelAndView("course/course_personal");
		Object object = session.getAttribute("session_userId");
		if(object==null){
			return new ModelAndView("user/login");
			}
			Integer userid = (Integer) object;
			List<LastCourseView> lastCourseViews = RecordService.lastCourse(userid);
			modelAndView.addObject("lastCourseViews", lastCourseViews);
			return modelAndView;
	}
}
