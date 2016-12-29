package org.xjtusicd3.partner.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.RandomStringUtils;
import org.eclipse.jetty.http.MetaData.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.xjtusicd3.common.util.JsonUtil;
import org.xjtusicd3.database.model.CourseTitleAddPersistence;
import org.xjtusicd3.partner.service.CourseListService;
import org.xjtusicd3.partner.service.UserService;
import org.xjtusicd3.partner.service.VideoService;
import org.xjtusicd3.partner.view.ClassifyView;
import org.xjtusicd3.partner.view.CourseAddView;
import org.xjtusicd3.partner.view.CourseListView;
import org.xjtusicd3.partner.view.CourseTitleAddView;
import org.xjtusicd3.partner.view.UserView;
import org.xjtusicd3.partner.view.VideoView;

import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncoderException;
import it.sauronsoftware.jave.MultimediaInfo;



@Controller
public class CourseAddController {
	/*
	 * 界面
	 */
	@RequestMapping(value="course/course_add",method=RequestMethod.GET)
	public ModelAndView course_add() {
		ModelAndView mv = new ModelAndView("course/course_add");
		return mv;
	}
	@RequestMapping(value="course/course_add_courseimage",method=RequestMethod.GET)
	public ModelAndView course_add_courseimage() {
		ModelAndView mv = new ModelAndView("course/course_add_courseimage");
		return mv;
	}
	@RequestMapping(value="course/course_add2",method=RequestMethod.GET)
	public ModelAndView course_add2() {
		ModelAndView mv = new ModelAndView("course/course_add2");
		return mv;
	}
	@RequestMapping(value="course/course_add3",method=RequestMethod.GET)
	public ModelAndView course_add3() {
		ModelAndView mv = new ModelAndView("course/course_add3");
		return mv;
	}
	@RequestMapping(value="course/course_update",method=RequestMethod.GET)
	public ModelAndView course_update() {
		ModelAndView mv = new ModelAndView("course/course_update");
		return mv;
	}
	
	/*
	 * 增添课程的标题
	 */
	@RequestMapping(value="course/addcourseTitle",method=RequestMethod.POST)
	public ModelAndView addcourseTitle(CourseTitleAddView courseListView,HttpSession session){
		ModelAndView mv = null;
		Object object = session.getAttribute("session_userId");
		if(object==null){
			return new ModelAndView("user/login");
			}
			Integer userid = (Integer) object;
			
			courseListView.setUserId(userid);
		try {
			CourseListService.addcoursetitle(courseListView);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ModelAndView modelAndView = new ModelAndView("course/course_add");
		session.setAttribute("session_courseTitle", courseListView.getCourseTitle());
		return modelAndView;
	}
	
	

	/*
	 * 增加课程的基本信息
	 */
	@RequestMapping(value="course/addcourseTitle2",method=RequestMethod.POST)
	public ModelAndView addcourse(CourseAddView courseAddView,CourseTitleAddView courseTitleAddView,ClassifyView classifyView,HttpSession session){
		ModelAndView mv = null;
		Object object = session.getAttribute("session_userId");
		if(object==null){
			return new ModelAndView("user/login");
			}
			Integer userid = (Integer) object;
			courseAddView.setUserId(userid);
			String classifyName = courseAddView.getClassifyName();
			int classifyId=0;
			try {
			    classifyId = Integer.parseInt(classifyName);
			} catch (NumberFormatException e) {
			    e.printStackTrace();
			}
			String coursetitle = courseAddView.getCourseTitle();
			CourseTitleAddView courseTitleAddView2 = CourseListService.selectcoursetitle2(coursetitle);
			int coursetitleid = courseTitleAddView2.getCourseTitleId();
			courseAddView.setUserId(userid);
			courseAddView.setCourseTitleId(coursetitleid);
			courseAddView.setClassifyId(classifyId);
			courseAddView.setCourseShortIntroduce(courseAddView.getCourseShortIntroduce());
			courseAddView.setCourseIntroduce(courseAddView.getCourseIntroduce());
			courseAddView.setCourseDifficulty(courseAddView.getCourseDifficulty());
			courseAddView.setCourseNeedkonw(courseAddView.getCourseNeedkonw());
			courseAddView.setCourseWilllearn(courseAddView.getCourseWilllearn());
			courseAddView.setCourseImage(courseAddView.getCourseImage());
			courseAddView.setCourseDate(courseAddView.getCourseDate());
			CourseListService.CourseAdd(courseAddView);
			ModelAndView modelAndView2 = null;
			CourseAddView courseAddView2 = CourseListService.selectcourseimage(coursetitleid);
			modelAndView2 = new ModelAndView("course/course_add_courseimage");
			modelAndView2.addObject(courseAddView2);
			session.setAttribute("session_courseId",courseAddView2.getCourseId());
			session.setAttribute("session_courseImage", courseAddView2.getCourseImage());
			session.setAttribute("session_courseTitleId", courseAddView2.getCourseTitleId());

			return modelAndView2;
	}
	
	/*
	 * 添加文章的大标题
	 */
	@RequestMapping(value="course/addcourseTitle3",method=RequestMethod.POST)
	public String addcourseTitle2(CourseTitleAddView courseTitleAddView,HttpSession session){
		ModelAndView mv = null;
		Object object = session.getAttribute("session_userId");
		Object object2 = session.getAttribute("session_courseTitleId");
		if(object==null){
			new ModelAndView("user/login");
		}
		Integer userid = (Integer) object;
		Integer courseTitleId = (Integer) object2;
		try {
			CourseListService.addcourseTitle2(courseTitleAddView,userid,courseTitleId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "course/course_add2";
	}
	/*
	 * 添加视频小标题
	 */
	@RequestMapping(value="course/addvideo",method=RequestMethod.POST)
	public String addvideo(VideoView videoView,CourseAddView courseAddView,HttpSession session){
		
		ModelAndView mv = null;
		Object object = session.getAttribute("session_userId");
		Object object2 = session.getAttribute("session_courseId");
		if(object==null){
			new ModelAndView("user/login");
		}
		Integer userid = (Integer) object;
		Integer courseid = (Integer) object2;
		String coursetitle = courseAddView.getCourseTitle();
		int courseTitleId=0;
		try {
			courseTitleId=Integer.parseInt(coursetitle);
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		}

		try {
			VideoService.addVideo(courseid,courseTitleId,videoView.getVideoName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("session_videoName", videoView.getVideoName());
		return "course/course_add3_video";
	}
	
    String newPath ="";
    String newPath1 ="";
    String newPath2 ="";
	String newPath3 ="";
    /*
     * 课程缩略图上传
     */
	@RequestMapping(value = "/uploadCourseImage",method=RequestMethod.POST)
    @ResponseBody
    public ModelAndView uploadUserImage(CourseAddView courseAddView,UserView userView,CourseTitleAddView courseTitleAddView,HttpServletRequest request,HttpSession session) throws IOException {
		ModelAndView mv = null;
		Object object = session.getAttribute("session_userId");
		Object object2 = session.getAttribute("session_courseTitle");
		
		if(object==null){
			return new ModelAndView("user/login");
		}
		Integer userid = (Integer) object;
		String courseTitle = (String) object2;
		
		CourseAddView addView = CourseListService.selectcoursetitle3(courseTitle);
		int courseTitleId = addView.getCourseTitleId();
		CourseAddView addView2 = CourseListService.selectcourseimage(courseTitleId);
		int courseId = addView2.getCourseId();
		UserView userView3 = UserService.check2(userid);
		String useremail = userView3.getUserEmail();
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest)request;
        Iterator<String> iterator = multipartRequest.getFileNames();
        String path  ="";
        String fileName = "";
        String suffix = "";
		String filename = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String dir = "static/image/"+useremail +"/"+ sdf.format(new Date()) + "/";
        String realPath = request.getSession().getServletContext().getRealPath("/");
        while(iterator.hasNext()){
            MultipartFile multipartFile = multipartRequest.getFile(iterator.next());
            if(multipartFile != null){
                String fn = multipartFile.getOriginalFilename();
                 suffix = fn.substring(fn.lastIndexOf("."));
                 filename = RandomStringUtils.randomAlphanumeric(6);
                fileName = dir + filename + suffix;
                path = realPath + fileName;
                path = path.replace("\\", "/");
                File f = new File(path);
                if(!f.mkdirs()){
                    f.mkdir();
                }
                multipartFile.transferTo(f);
            }
        }

		copyFile(path, useremail, sdf.format(new Date()),courseTitle);
		newPath1 = newPath1.replace("\\", "/");
		newPath1 = newPath1.replace("E:/eclipse/workspace/knowledgeService/org.xjtusicd3/org.xjtusicd3.partner/src/main/webapp", "/org.xjtusicd3.partner");
		
		CourseListService.updateCourseImage(courseId,newPath1);
		ModelAndView modelAndView = null;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CourseAddView courseAddView2 = CourseListService.selectcourseimage(courseTitleId);
		modelAndView = new ModelAndView("course/course_add_courseimage");
		modelAndView.addObject(courseAddView2);
		session.setAttribute("session_courseImage", courseAddView2.getCourseImage());
        return modelAndView;
       
    }
	/*
	 * 上传视频
	 */
	@RequestMapping(value = "/uploadVideo",method=RequestMethod.POST)
	public String uploadVideo(CourseAddView courseAddView,UserView userView,VideoView videoView,CourseTitleAddView courseTitleAddView,HttpServletRequest request,HttpSession session) throws IOException {
//		ModelAndView mv = null;
		Object object = session.getAttribute("session_userId");
		Object object2 = session.getAttribute("session_courseTitle");
		Object object3 = session.getAttribute("session_videoName");
		if(object==null){
			return "user/login";
		}
		Integer userid = (Integer) object;
		String courseTitle = (String) object2;
		String videoName = (String) object3;
		CourseAddView addView = CourseListService.selectcoursetitle3(courseTitle);
		int courseTitleId = addView.getCourseTitleId();
		CourseAddView addView2 = CourseListService.selectcourseimage(courseTitleId);
		int courseId = addView2.getCourseId();
		
		VideoView videoView2 = VideoService.selectvideo(videoName);
		int videoId = videoView2.getVideoId();
		
		UserView userView3 = UserService.check2(userid);
		String useremail = userView3.getUserEmail();
	    MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest)request;
	    Iterator<String> iterator = multipartRequest.getFileNames();
	    String path  ="";
	    String fileName = "";
	    String suffix = "";
		String filename = "";
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	    String dir = "static/image/"+useremail +"/"+ sdf.format(new Date()) + "/";
	    String realPath = request.getSession().getServletContext().getRealPath("/");
	    while(iterator.hasNext()){
	        MultipartFile multipartFile = multipartRequest.getFile(iterator.next());
	        if(multipartFile != null){
	            String fn = multipartFile.getOriginalFilename();
	            
	            suffix = fn.substring(fn.lastIndexOf("."));
	            filename = RandomStringUtils.randomAlphanumeric(6);
	            fileName = dir + filename + suffix;
	            path = realPath + fileName;
	            path = path.replace("\\", "/");
	            File f = new File(path);
	            if(!f.mkdirs()){
	                f.mkdir();
	            }
	            multipartFile.transferTo(f);
	        }
	    }

		copyFile1(path, useremail, sdf.format(new Date()),courseTitle);
		newPath3 = newPath3.replace("\\", "/");
		newPath3 = newPath3.replace("E:/eclipse/workspace/knowledgeService/org.xjtusicd3/org.xjtusicd3.partner/src/main/webapp", "/org.xjtusicd3.partner");
		
		VideoService.updateVideo(videoId,newPath3);
		VideoService.updateVideo2(videoId, time1, a);
		double courseTime1 = VideoService.selectTotalTime(courseId);
		double courseTime =  (courseTime1/60);
		int courseTotalTime = (int) courseTime;
		CourseListService.updateCourseTime(courseId,courseTotalTime);
//		ModelAndView modelAndView = null;
//		modelAndView = new ModelAndView("course/course_add3");
	    return "redirect:/course/course_add3.html";
	   
	}
	
	public void copyFile(String path,String useremail,String time,String courseTitle) {
		File fold = new File(path);
		newPath="E:\\eclipse\\workspace\\knowledgeService\\org.xjtusicd3\\org.xjtusicd3.partner\\src\\main\\webapp\\weike\\user\\"+useremail+"\\courseImage\\"+courseTitle+"\\"+time+"\\";
		File file = new File(newPath);
		if(!file.exists()){
			file.mkdirs();
		}
		newPath1 = newPath+fold.getName();
		File file2 = new File(newPath+fold.getName());
		fold.renameTo(file2);
		}
		
	long a;
	double time1;
	public void copyFile1(String path,String useremail,String time,String courseTitle) {
		long ls = 0;
		File fold = new File(path);
		newPath2="E:\\eclipse\\workspace\\knowledgeService\\org.xjtusicd3\\org.xjtusicd3.partner\\src\\main\\webapp\\weike\\user\\"+useremail+"\\video\\"+courseTitle+"\\"+time+"\\";
		File file = new File(newPath2);
		if(!file.exists()){
			file.mkdirs();
		}
		newPath3 = newPath2+fold.getName();
		File file2 = new File(newPath2+fold.getName());
		fold.renameTo(file2);//获得视频的大小
		 a = file2.length();
		Encoder encoder = new Encoder();
		try {
			MultimediaInfo multimediaInfo = encoder.getInfo(file2);
			ls = multimediaInfo.getDuration()/1000;
			
		} catch (EncoderException e) {
			e.printStackTrace();
		}
		 time1 = (double)ls;
		double time2 = time1/60; //转化成分钟
		System.out.println(a);
		}
	
	/*
	 * ajax章节标题显示
	 */
	@RequestMapping(value={"getFirstTitle"},method={org.springframework.web.bind.annotation.RequestMethod.GET},produces="text/html;charset=UTF-8")
	public void searchFirstTitle(HttpServletResponse response,HttpSession session) throws IOException{
		Object object = session.getAttribute("session_courseTitleId");
		Integer courseTitleId = (Integer) object;
		List<CourseTitleAddPersistence> firstTitle = CourseListService.getFirstTitle(courseTitleId);
		if(firstTitle == null || firstTitle.size()==0){
			return;
		}
		String result = JsonUtil.toJsonString(firstTitle);
		PrintWriter out = response.getWriter();  
		out.write(result);
		return ;
	}
 /*
  * 更改部分课程信息
  */
	@RequestMapping(value="course/courseupdate",method=RequestMethod.GET)
	public ModelAndView getCourseupdate(int t){
		ModelAndView modelAndView = new ModelAndView("course/course_update");
		List<CourseListView> courseAddViews = CourseListService.course(t);
		modelAndView.addObject("courseAddViews", courseAddViews);
		return modelAndView;
	}
	@RequestMapping(value="course/courseupdate2",method=RequestMethod.POST)
	public String courseupdate2(CourseAddView courseAddView,HttpSession session){
		Object object = session.getAttribute("session_userId");
		if(object==null){
			return "user/login";
			}
			Integer userid = (Integer) object;
			String courseTitle = courseAddView.getCourseTitle();
			CourseAddView courseAddView2 = CourseListService.selectcoursetitle3(courseTitle);
			int courseTitleId = courseAddView2.getCourseTitleId();
			String courseShortIntroduce = courseAddView.getCourseShortIntroduce();
			String courseIntroduce = courseAddView.getCourseIntroduce();
			String courseNeedkonw = courseAddView.getCourseNeedkonw();
			String courseWilllearn = courseAddView.getCourseWilllearn();
			CourseListService.updateCourse(courseTitleId,courseShortIntroduce,courseIntroduce,courseNeedkonw,courseWilllearn);
		return "course/course_personal";
		
	}
}
