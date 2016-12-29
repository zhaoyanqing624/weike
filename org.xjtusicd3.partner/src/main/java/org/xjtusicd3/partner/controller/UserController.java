package org.xjtusicd3.partner.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.xjtusicd3.partner.service.RecordService;
import org.xjtusicd3.partner.service.UserService;
import org.xjtusicd3.partner.view.LastCourseView;
import org.xjtusicd3.partner.view.UserView;
import org.xjtusicd3.partner.view.UserpersonalView;
@Controller
public class UserController {
    String newPath ="";
    String newPath1 ="";
	/*
	 * 界面
	 */
	@RequestMapping(value="index",method=RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	@RequestMapping(value="user/login",method=RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("user/login");
		return mv;
	}
	@RequestMapping(value="user/register",method=RequestMethod.GET)
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView("user/register");
		return mv;
	}
	@RequestMapping(value="search",method=RequestMethod.GET)
	public ModelAndView search(){
		ModelAndView mv = new ModelAndView("search");
		return mv;
	}
	@RequestMapping(value="search2",method=RequestMethod.GET)
	public ModelAndView search2(){
		ModelAndView mv = new ModelAndView("search2");
		return mv;
	}
	@RequestMapping(value="search3",method=RequestMethod.GET)
	public ModelAndView search3(){
		ModelAndView mv = new ModelAndView("search3");
		return mv;
	}
	
	@RequestMapping(value="question",method=RequestMethod.GET)
	public ModelAndView question(){
		ModelAndView mv = new ModelAndView("question");
		return mv;
	}
	@RequestMapping(value="question2",method=RequestMethod.GET)
	public ModelAndView question2(){
		ModelAndView mv = new ModelAndView("question2");
		return mv;
	}
	@RequestMapping(value="user/personal",method=RequestMethod.GET)
	public ModelAndView personal(){
		ModelAndView mv = new ModelAndView("user/personal");
		return mv;
	}
	@RequestMapping(value="user/personal2",method=RequestMethod.GET)
	public ModelAndView personal2(){
		ModelAndView mv = new ModelAndView("user/personal2");
		return mv;
	}
	@RequestMapping(value="user/myinfo",method=RequestMethod.GET)
	public ModelAndView myinfo(){
		ModelAndView mv = new ModelAndView("user/myinfo");
		return mv;
	}
	@RequestMapping(value="user/myinfo2",method=RequestMethod.GET)
	public ModelAndView myinfo2(){
		ModelAndView mv = new ModelAndView("user/myinfo2");
		return mv;
	}
	@RequestMapping(value="user/myinfo2_2",method=RequestMethod.GET)
	public ModelAndView myinfo2_2(){
		ModelAndView mv = new ModelAndView("user/myinfo2_2");
		return mv;
	}
	@RequestMapping(value="user/myinfo3",method=RequestMethod.GET)
	public ModelAndView myinfo3(){
		ModelAndView mv = new ModelAndView("user/myinfo3");
		return mv;
	}
	@RequestMapping(value="course/course_personal",method=RequestMethod.GET)
	public ModelAndView course_personal(){
		ModelAndView mv = new ModelAndView("course/course_personal");
		return mv;
	}
	@RequestMapping(value="course/course_personal2",method=RequestMethod.GET)
	public ModelAndView course_personal2(){
		ModelAndView mv = new ModelAndView("course/course_personal2");
		return mv;
	}
	@RequestMapping(value="course/course_personal3",method=RequestMethod.GET)
	public ModelAndView course_personal3(){
		ModelAndView mv = new ModelAndView("course/course_personal3");
		return mv;
	}
	@RequestMapping(value="test",method=RequestMethod.GET)
	public ModelAndView test(){
		ModelAndView mv = new ModelAndView("test");
		return mv;
	}

	

	/*
	 * 用户注册
	 */
	@RequestMapping(value="user/save",method=RequestMethod.POST)
	public String save(UserView userView){
		try {
			UserService.save(userView);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "user/login";
	}
	/*
	 * 用户登录
	 */
	@RequestMapping(value="user/logincheck",method=RequestMethod.POST)
	public ModelAndView logincheck(UserView userView,HttpSession session){
		ModelAndView modelAndView = null;
		try {
			UserView userView2 = UserService.check(userView);
			if (userView2==null){
				modelAndView = new ModelAndView("error");
			}else {
				modelAndView = new ModelAndView("redirect:/index.html");
				modelAndView.addObject(userView2);
				
				session.setAttribute("session_userId", userView2.getUserId());
				session.setAttribute("session_userEmail", userView2.getUserEmail());
				session.setAttribute("session_userPassword", userView2.getUserPassword());
				session.setAttribute("session_userName", userView2.getUserName());
				session.setAttribute("session_userAccount", userView2.getUserAccount());
				session.setAttribute("session_userPhone", userView2.getUserPhone());
				session.setAttribute("session_userSex", userView2.getUserSex());
				session.setAttribute("session_userSignature", userView2.getUserSignature());
				session.setAttribute("session_userAddress", userView2.getUserAddress());
				session.setAttribute("session_userJob", userView2.getUserJob());
				session.setAttribute("session_userImage", userView2.getUserImage());
				session.setAttribute("session_userCardImage", userView2.getUserCardImage());
				session.setAttribute("session_userTrueName", userView2.getUserTrueName());
				session.setAttribute("session_userCardNumber", userView2.getUserCardNumber());
				session.setAttribute("session_userTrueJob", userView2.getUserTrueJob());
				session.setAttribute("session_userExperience", userView2.getUserExperience());
				session.setAttribute("session_userState", userView2.getUserState());
				
				int courseTitleId=0;
				int videoId=0;
				String courseTitle=null;
				String videoName=null;
				List<LastCourseView> lastCourseViewsS = RecordService.lastCourse2(userView2.getUserId());
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

			}
		} catch (Exception e) {
			e.printStackTrace();
			modelAndView = new ModelAndView("user/login");
		}
		return modelAndView;
	}
	/*
	 * 用户退出
	 */
	@RequestMapping(value="loginout",method=RequestMethod.GET)
	public String loginout(UserView userView,HttpSession session){
		ModelAndView modelAndView = null;
		session.invalidate();
		return "redirect:/index.html";
	}
	/*
	 * 用户信息修改
	 */
	@RequestMapping(value="user/updatemyinfo",method=RequestMethod.POST)
	public ModelAndView myinfo(UserView userView,HttpSession session ){
		ModelAndView mv = null;
		Object object = session.getAttribute("session_userId");
		if(object==null){
			return new ModelAndView("user/login");
			}
			Integer userid = (Integer) object; 
			UserView userView2 = UserService.check2(userid);
			String useremail = userView2.getUserEmail();
			String userpassword = userView2.getUserPassword();
			String username = userView.getUserName();
			String userphone =  userView.getUserPhone();
			String userjob = userView.getUserJob();
			String useraddress = userView.getUserAddress();
			String usersex = userView.getUserSex();
			String usersignature = userView.getUserSignature();
			String userimage = userView2.getUserImage();
			String usercardimage = userView2.getUserCardImage();
			String usertruename  =userView2.getUserTrueName();
			String usercardnumber = userView2.getUserCardNumber();
			String usertruejob = userView2.getUserTrueJob();
			String userexperience = userView2.getUserExperience();
			String userregisterdate = userView2.getUserRegisterDate();
			String userapplicationdate = userView2.getUserApplicationDate();
			int userstate = userView2.getUserState();
			userView.setUserId(userid);
			userView.setUserEmail(useremail);
			userView.setUserPassword(userpassword);
			userView.setUserName(username);
			userView.setUserPhone(userphone);
			userView.setUserJob(userjob);
			userView.setUserAddress(useraddress);
			userView.setUserSex(usersex);
			userView.setUserSignature(usersignature);
			UserController userController = new UserController();
			userView.setUserImage(userimage);
			userView.setUserCardImage(usercardimage);
			userView.setUserTrueName(usertruename);
			userView.setUserCardNumber(usercardnumber);
			userView.setUserTrueJob(usertruejob);
			userView.setUserExperience(userexperience);
			userView.setUserState(userstate);
			userView.setUserRegisterDate(userregisterdate);
			userView.setUserApplicationDate(userapplicationdate);
			
			UserService.update(userView);
			ModelAndView modelAndView = null;
			UserView userView3 = UserService.check2(userid);
			modelAndView = new ModelAndView("user/myinfo");
			modelAndView.addObject(userView3);
			session.setAttribute("session_userId", userView3.getUserId());
			session.setAttribute("session_userEmail", userView3.getUserEmail());
			session.setAttribute("session_userPassword", userView3.getUserPassword());
			session.setAttribute("session_userName", userView3.getUserName());
			session.setAttribute("session_userAccount", userView3.getUserAccount());
			session.setAttribute("session_userPhone", userView3.getUserPhone());
			session.setAttribute("session_userSex", userView3.getUserSex());
			session.setAttribute("session_userSignature", userView3.getUserSignature());
			session.setAttribute("session_userAddress", userView3.getUserAddress());
			session.setAttribute("session_userJob", userView3.getUserJob());
			session.setAttribute("session_userImage", userView3.getUserImage());
		return modelAndView;
	}
	
	@RequestMapping(value="user/updatemyinfo2",method=RequestMethod.POST)
	public ModelAndView myinfo2(HttpSession session,String userPassword1,String userPassword2,String userPassword3){
		ModelAndView mv = null;
		Object object = session.getAttribute("session_userId");
		if(object==null){
			return new ModelAndView("user/login");
			}
			Integer userid = (Integer) object; 
			UserView userView2 = UserService.check2(userid);
			String useremail = userView2.getUserEmail();
			String userimage = userView2.getUserImage();
			String userpassword = userView2.getUserPassword();
			System.out.println(userpassword);//原密码
			System.out.println(userPassword1);//第一个密码
			
			if(userPassword1.equals(userpassword)){
				if(userPassword2.equals(userPassword3) && !userPassword2.equals(userPassword1)){
					System.out.println(userPassword2);
					userpassword = userPassword2;
					userView2.setUserPassword(userpassword);
					UserService.update(userView2);
					ModelAndView modelAndView = null;
					UserView userView3 = UserService.check2(userid);
					modelAndView = new ModelAndView("user/myinfo2");
					return modelAndView;
				}else {
					return null;
				}
			}else {
				return null;
			}
	}
	@RequestMapping(value="user/updatemyinfo3",method=RequestMethod.POST)
	public ModelAndView myinfo3(UserView userView,HttpSession session) throws Exception{
		ModelAndView mv = null;
		Object object = session.getAttribute("session_userId");
		if(object==null){
			return new ModelAndView("user/login");
		}
		Integer userid = (Integer) object; 
		UserView userView2 = UserService.check2(userid);
		String useremail = userView2.getUserEmail();
		String userpassword = userView2.getUserPassword();
		String username = userView2.getUserName();
		String userphone =  userView2.getUserPhone();
		String userjob = userView2.getUserJob();
		String useraddress = userView2.getUserAddress();
		String usersex = userView2.getUserSex();
		String usersignature = userView2.getUserSignature();
		String userimage = userView2.getUserImage();
		String usercardimage = userView2.getUserCardImage();
		String usertruename  =userView.getUserTrueName();
		String usercardnumber = userView.getUserCardNumber();
		String usertruejob = userView.getUserTrueJob();
		String userexperience = userView.getUserExperience();
		String userregisterdate = userView2.getUserRegisterDate();
		
		int userstate = userView.getUserState();
		userView.setUserId(userid);
		userView.setUserEmail(useremail);
		userView.setUserPassword(userpassword);
		userView.setUserName(username);
		userView.setUserPhone(userphone);
		userView.setUserJob(userjob);
		userView.setUserAddress(useraddress);
		userView.setUserSex(usersex);
		userView.setUserSignature(usersignature);
		userView.setUserImage(userimage);
		userView.setUserCardImage(usercardimage);
		userView.setUserTrueName(usertruename);
		userView.setUserCardNumber(usercardnumber);
		userView.setUserTrueJob(usertruejob);
		userView.setUserExperience(userexperience);
		userView.setUserState(0);
		userView.setUserRegisterDate(userregisterdate);
		
		long l = System.currentTimeMillis();
		Date date = new Date(l);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		userView.setUserApplicationDate(dateFormat.format(date));
		UserService.update(userView);
		ModelAndView modelAndView = null;
		UserView userView3 = UserService.check2(userid);
		modelAndView = new ModelAndView("user/myinfo3");
		modelAndView.addObject(userView3);
		session.setAttribute("session_userId", userView3.getUserId());
		session.setAttribute("session_userCardImage", userView3.getUserCardImage());
		session.setAttribute("session_userTrueName", userView3.getUserTrueName());
		session.setAttribute("session_userCardNumber", userView3.getUserCardNumber());
		session.setAttribute("session_userTrueJob", userView3.getUserTrueJob());
		session.setAttribute("session_userExperience", userView3.getUserExperience());
		session.setAttribute("session_userState", userView3.getUserState());
		return modelAndView;
	}
	
	/*
	 * 头像上传
	 */
	@RequestMapping(value = "/uploadUserImage",method=RequestMethod.POST)
    @ResponseBody
    public ModelAndView uploadUserImage(UserView userView,HttpServletRequest request,HttpSession session) throws IOException {
		ModelAndView mv = null;
		Object object = session.getAttribute("session_userId");
		if(object==null){
			return new ModelAndView("user/login");
		}
		Integer userid = (Integer) object;
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

		copyFile(path, useremail, sdf.format(new Date()));
		newPath1 = newPath1.replace("\\", "/");
		newPath1 = newPath1.replace("E:/eclipse/workspace/knowledgeService/org.xjtusicd3/org.xjtusicd3.partner/src/main/webapp", "/org.xjtusicd3.partner");
        UserService.updateUserImage(userid,newPath1);
		ModelAndView modelAndView = null;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		UserView userView2 = UserService.check2(userid);
		modelAndView = new ModelAndView("user/myinfo");
		modelAndView.addObject(userView2);
		session.setAttribute("session_userId", userView2.getUserId());
		session.setAttribute("session_userImage", userView2.getUserImage());
        return modelAndView;
       
    }
	
	/*
	 * 身份证上传
	 */
	@RequestMapping(value = "/uploadUserCardImage",method=RequestMethod.POST)
    @ResponseBody
    public ModelAndView uploadUserCardImage(UserView userView,HttpServletRequest request,HttpSession session) throws IOException {
		ModelAndView mv = null;
		Object object = session.getAttribute("session_userId");
		if(object==null){
			return new ModelAndView("user/login");
		}
		Integer userid = (Integer) object;
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

		copyFile2(path, useremail, sdf.format(new Date()));
		newPath1 = newPath1.replace("\\", "/");
		newPath1 = newPath1.replace("E:/eclipse/workspace/knowledgeService/org.xjtusicd3/org.xjtusicd3.partner/src/main/webapp", "/org.xjtusicd3.partner");
        UserService.updateUserCardImage(userid, newPath1);
		ModelAndView modelAndView = null;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		UserView userView2 = UserService.check2(userid);
		modelAndView = new ModelAndView("user/myinfo3");
		modelAndView.addObject(userView2);
		session.setAttribute("session_userId", userView2.getUserId());
		session.setAttribute("session_userCardImage", userView2.getUserCardImage());
        return modelAndView;
       
    }
	
	public void copyFile(String path,String useremail,String time) {
		File fold = new File(path);
		newPath="E:\\eclipse\\workspace\\knowledgeService\\org.xjtusicd3\\org.xjtusicd3.partner\\src\\main\\webapp\\weike\\user\\"+useremail+"\\userImage\\"+time+"\\";
		File file = new File(newPath);
		if(!file.exists()){
			file.mkdirs();
		}
		newPath1 = newPath+fold.getName();
		File file2 = new File(newPath+fold.getName());
		fold.renameTo(file2);
		} 
	
	public void copyFile2(String path,String useremail,String time) {
		File fold = new File(path);
		newPath="E:\\eclipse\\workspace\\knowledgeService\\org.xjtusicd3\\org.xjtusicd3.partner\\src\\main\\webapp\\weike\\user\\"+useremail+"\\userCardImage\\"+time+"\\";
		File file = new File(newPath);
		if(!file.exists()){
			file.mkdirs();
		}
		newPath1 = newPath+fold.getName();
		File file2 = new File(newPath+fold.getName());
		fold.renameTo(file2);
		} 
	
	/*
	 * 用户的个人信息查询
	 */
	@RequestMapping(value="listuser",method=RequestMethod.GET)
	public ModelAndView getlistuser(int u){
		ModelAndView modelAndView = new ModelAndView("user/personal2");
		UserView userView = UserService.check2(u);
		
		List<UserpersonalView> userViews = UserService.listuser(u);
		modelAndView.addObject("userName", userView.getUserName());
		modelAndView.addObject("userImage", userView.getUserImage());
		modelAndView.addObject("userAccount", userView.getUserAccount());
		modelAndView.addObject("userJob", userView.getUserJob());
		modelAndView.addObject("userSignature", userView.getUserSignature());
		modelAndView.addObject("userViews",userViews);
		return modelAndView;
	}
	
//	@RequestMapping(value="apply",method=RequestMethod.GET)
//	public ModelAndView apply(HttpSession session){
//		ModelAndView mv = new ModelAndView();
//		Object email =  session.getAttribute("session_email");
//		try {
//			if (email==null) {
//				mv = new ModelAndView("login");
//				return mv;
//			}
//			ViewUser viewUser = UserService.getByEmail((String)email);
//			mv = new ModelAndView("user/apply");
//			mv.addObject(viewUser);
//			
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		
//		return mv;
//	}
//	
//	@RequestMapping(value="saveapply",method=RequestMethod.POST)
//	public ModelAndView saveapply(ViewUser user,HttpSession session) {
//		ModelAndView mv = null;
//		Object email =  session.getAttribute("session_email");
//		try {
//			
//			if (email==null) {
//				mv = new ModelAndView("login");
//				return mv;
//			}
//			user.setEmail((String) email);
//			UserService.apply(user,(String) email);
//			mv = new ModelAndView("success");
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			mv = new ModelAndView("error");
//		}
//		return mv;
//	}
	
//	@ResponseBody
//	@RequestMapping(value="checkemail",method=RequestMethod.GET)
//	public String  checkemail(@RequestParam("email") String email) {
//		try {
//			ViewUser viewUser = UserService.getByEmail(email);
//			if (viewUser == null) {
//				return "email_notexists";
//			}else {
//				return "email_exists";
//			}
//		} catch (Exception e) {
//			return "error";
//		}
//		
//	}
}
