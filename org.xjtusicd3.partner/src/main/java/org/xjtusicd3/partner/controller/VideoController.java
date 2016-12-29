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
import org.xjtusicd3.partner.view.CommentView;

@Controller
public class VideoController {

	@RequestMapping(value="course/course_add3_video",method=RequestMethod.GET)
	public ModelAndView course_add3_video() {
		ModelAndView mv = new ModelAndView("course/course_add3_video");
		return mv;
	}
	/*
	 * 视频下的评论
	 */
	@RequestMapping(value="course/addComment",method=RequestMethod.POST)
	public String addCommont(HttpSession session,CommentView commentView){
		Object object = session.getAttribute("session_userId");
		Object object2 = session.getAttribute("cccc");
		if(object==null){
			return "user/login";
			}
			Integer userid = (Integer) object;
			Integer videoid = (Integer) object2;
			//获取时间
			long l = System.currentTimeMillis();
			Date date = new Date(l);
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
			commentView.setUserId(userid);
			commentView.setCommentDate(dateFormat.format(date));
			commentView.setCommentName(commentView.getCommentName());
			commentView.setVideoId(videoid);
			CommentService.addComment(videoid, commentView);
			ModelAndView modelAndView = new ModelAndView("course/course3");
			List<CommentView> commentViews = CommentService.selectComment(videoid);
			
			modelAndView.addObject("commentViews", commentViews);
			return "redirect:course3.html?c="+videoid;
			
			
			
			
	}
//	/*
//	 * 视频上传
//	 */
//
//	String newPath2 ="";
//	String newPath3 ="";
//	@RequestMapping(value = "/uploadVideo",method=RequestMethod.POST)
//	@ResponseBody
//	public ModelAndView uploadVideo(CourseAddView courseAddView,UserView userView,CourseTitleAddView courseTitleAddView,HttpServletRequest request,HttpSession session) throws IOException {
//		ModelAndView mv = null;
//		Object object = session.getAttribute("session_userId");
//		Object object2 = session.getAttribute("session_courseTitle");
//		if(object==null){
//			return new ModelAndView("user/login");
//		}
//		Integer userid = (Integer) object;
//		String courseTitle = (String) object2;
//		CourseAddView addView = CourseListService.selectcoursetitle3(courseTitle);
//		int courseTitleId = addView.getCourseTitleId();
//		CourseAddView addView2 = CourseListService.selectcourseimage(courseTitleId);
//		int courseId = addView2.getCourseId();
//		UserView userView3 = UserService.check2(userid);
//		String useremail = userView3.getUserEmail();
//	    MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest)request;
//	    Iterator<String> iterator = multipartRequest.getFileNames();
//	    String path  ="";
//	    String fileName = "";
//	    String suffix = "";
//		String filename = "";
//	    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//	    String dir = "static/image/"+useremail +"/"+ sdf.format(new Date()) + "/";
//	    String realPath = request.getSession().getServletContext().getRealPath("/");
//	    while(iterator.hasNext()){
//	        MultipartFile multipartFile = multipartRequest.getFile(iterator.next());
//	        if(multipartFile != null){
//	            String fn = multipartFile.getOriginalFilename();
//	            
//	            suffix = fn.substring(fn.lastIndexOf("."));
//	            filename = RandomStringUtils.randomAlphanumeric(6);
//	            fileName = dir + filename + suffix;
//	            path = realPath + fileName;
//	            path = path.replace("\\", "/");
//	            File f = new File(path);
//	            if(!f.mkdirs()){
//	                f.mkdir();
//	            }
//	            multipartFile.transferTo(f);
//	        }
//	    }
//
//		copyFile(path, useremail, sdf.format(new Date()),courseTitle);
//		newPath3 = newPath3.replace("\\", "/");
//		newPath3 = newPath3.replace("E:/eclipse/workspace/knowledgeService/org.xjtusicd3/org.xjtusicd3.partner/src/main/webapp", "/org.xjtusicd3.partner");
//		
//		VideoService.addVideo(courseId,newPath3);
//		ModelAndView modelAndView = null;
//		modelAndView = new ModelAndView("course/course_add2");
//	    return modelAndView;
//	   
//	}
//
//	public void copyFile(String path,String useremail,String time,String courseTitle) {
//		long ls = 0;
//		File fold = new File(path);
//		newPath2="E:\\eclipse\\workspace\\knowledgeService\\org.xjtusicd3\\org.xjtusicd3.partner\\src\\main\\webapp\\weike\\user\\"+useremail+"\\video\\"+courseTitle+"\\"+time+"\\";
//		File file = new File(newPath2);
//		if(!file.exists()){
//			file.mkdirs();
//		}
//		newPath3 = newPath2+fold.getName();
//		File file2 = new File(newPath2+fold.getName());
//		fold.renameTo(file2);
//		Encoder encoder = new Encoder();
//		try {
//			MultimediaInfo multimediaInfo = encoder.getInfo(file2);
//			ls = multimediaInfo.getDuration()/1000;
//			
//		} catch (EncoderException e) {
//			e.printStackTrace();
//		}
//		double time1 = (double)ls;
//		double time2 = time1/60; //转化成分钟
//		System.out.println(time2);
//		}





}
	

	
