package org.xjtusicd3.partner.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.xjtusicd3.database.helper.CourseListHelper;
import org.xjtusicd3.database.helper.UserHelper;
import org.xjtusicd3.database.model.CourseAddPersistence;
import org.xjtusicd3.database.model.CourseListPersistence;
import org.xjtusicd3.database.model.CourseTitleAddPersistence;
import org.xjtusicd3.database.model.UserPersistence;
import org.xjtusicd3.database.model.VideoContentPersistence;
import org.xjtusicd3.partner.view.CourseAddView;
import org.xjtusicd3.partner.view.CourseListView;
import org.xjtusicd3.partner.view.CourseTitleAddView;
import org.xjtusicd3.partner.view.UserView;
import org.xjtusicd3.partner.view.VideoContentView;

public class CourseListService {
	/*
	 * 查看那课程列表
	 */
	public static List<CourseListView> courseList(String c){
		List<CourseListView> courseListViews = new ArrayList<CourseListView>();
		List<CourseListPersistence> courseListPersistences = CourseListHelper.selectCourseList(c);
		if(courseListPersistences == null){
			return null;
			}
		for(CourseListPersistence courseListPersistence2:courseListPersistences){
			CourseListView view = new CourseListView(courseListPersistence2);
			courseListViews.add(view);
		}
		return courseListViews;
	}
	/*
	 * 查看我的课程
	 */
	public static List<CourseListView> myCourse(int userId){
		List<CourseListView> courseListViews = new ArrayList<CourseListView>();
		List<CourseListPersistence> courseListPersistences = CourseListHelper.selectMyCourse(userId);
		if(courseListPersistences == null){
			return null;
			}
		for(CourseListPersistence courseListPersistence2:courseListPersistences){
			CourseListView view = new CourseListView(courseListPersistence2);
			courseListViews.add(view);
		}
		return courseListViews;
	}
	public static List<CourseListView> myCourse1(int userId){
		List<CourseListView> courseListViews = new ArrayList<CourseListView>();
		List<CourseListPersistence> courseListPersistences = CourseListHelper.selectMyCourse1(userId);
		if(courseListPersistences == null){
			return null;
			}
		for(CourseListPersistence courseListPersistence2:courseListPersistences){
			CourseListView view = new CourseListView(courseListPersistence2);
			courseListViews.add(view);
		}
		return courseListViews;
	}
	public static List<CourseListView> myCourse2(int userId){
		List<CourseListView> courseListViews = new ArrayList<CourseListView>();
		List<CourseListPersistence> courseListPersistences = CourseListHelper.selectMyCourse2(userId);
		if(courseListPersistences == null){
			return null;
			}
		for(CourseListPersistence courseListPersistence2:courseListPersistences){
			CourseListView view = new CourseListView(courseListPersistence2);
			courseListViews.add(view);
		}
		return courseListViews;
	}
	/*
	 * search查看那课程列表
	 */
	public static List<CourseListView> courseList2(String c){
		List<CourseListView> courseListViews = new ArrayList<CourseListView>();
		List<CourseListPersistence> courseListPersistences = CourseListHelper.selectCourseList2(c);
		if(courseListPersistences == null){
			return null;
			}
		for(CourseListPersistence courseListPersistence2:courseListPersistences){
			CourseListView view = new CourseListView(courseListPersistence2);
			courseListViews.add(view);
		}
		return courseListViews;
	}
	public static int courseList3(String c){
		int a  = CourseListHelper.selectCourseList3(c);
		return a;
	}
	
	/*
	 * 查看课程详情页面
	 */
	public static List<CourseListView> course(int b){
		List<CourseListView> courseListViews = new ArrayList<CourseListView>();
		List<CourseListPersistence> courseListPersistences = CourseListHelper.selectCourse(b);
		if(courseListPersistences == null){
			return null;
			}
		for(CourseListPersistence courseListPersistence2:courseListPersistences){
			CourseListView view = new CourseListView(courseListPersistence2);
			courseListViews.add(view);
		}
		return courseListViews;
	}
	/*
	 * 查看第一层分类
	 */
	public static List<CourseListView> FirstClassify(int b){
		List<CourseListView> courseListViews = new ArrayList<CourseListView>();
		List<CourseListPersistence> courseListPersistences = CourseListHelper.selectFirstClassify(b);
		if(courseListPersistences == null){
			return null;
			}
		for(CourseListPersistence courseListPersistence2:courseListPersistences){
			CourseListView view = new CourseListView(courseListPersistence2);
			courseListViews.add(view);
		}
		return courseListViews;
	}
	/*
	 * 查找出子标题以及视频   第二层
	 */
	public static List<CourseListView> SecondTitle(int b){
		List<CourseListView> courseListViews = new ArrayList<CourseListView>();
		List<CourseListPersistence> courseListPersistences = CourseListHelper.selectSecondTitle(b);
		if(courseListPersistences == null){
			return null;
			}
		for(CourseListPersistence courseListPersistence2:courseListPersistences){
			List<VideoContentView> videoContentViews = new ArrayList<>();
			List<VideoContentPersistence> videoContentPersistences = CourseListHelper.selectVideoContent(courseListPersistence2.getCourseTitleId());
			
			for(VideoContentPersistence persistence : videoContentPersistences){
				VideoContentView videoContentView = new VideoContentView(persistence);
				videoContentViews.add(videoContentView);
			}
			CourseListView view = new CourseListView(courseListPersistence2);
			view.setVideocontent(videoContentViews);
			courseListViews.add(view);
		}
		return courseListViews;
	}
	/*
	 * 查找出视频的URL  第三层
	 */
	public static List<VideoContentView> VideoURL(int b){
		List<VideoContentView> videoContentViews= new ArrayList<VideoContentView>();
		List<VideoContentPersistence> videoContentPersistences = CourseListHelper.selectVideoURL(b);
		if(videoContentPersistences == null){
			return null;
			}
		for(VideoContentPersistence videoContentPersistence:videoContentPersistences){
			VideoContentView view = new VideoContentView(videoContentPersistence);
			videoContentViews.add(view);
		}
		return videoContentViews;
	}

	public static List<CourseListView> VideoName3(int b){
		List<CourseListView> courseListViews = new ArrayList<CourseListView>();
		List<CourseListPersistence> courseListPersistences = CourseListHelper.selectVideoName3(b);
		if(courseListPersistences == null){
			return null;
			}
		for(CourseListPersistence courseListPersistence2:courseListPersistences){
			CourseListView view = new CourseListView(courseListPersistence2);
			courseListViews.add(view);
		}
		return courseListViews;
	}
	/*
	 * 添加课程的题目
	 */
	public static void addcoursetitle(CourseTitleAddView courseListView){
		CourseTitleAddPersistence courseListPersistence = new CourseTitleAddPersistence();
		courseListPersistence.setCourseTitleId(courseListView.getCourseTitleId());
		courseListPersistence.setCourseTitle(courseListView.getCourseTitle());
		courseListPersistence.setCourseTitleParentId(0);
		courseListPersistence.setCourseTitleLevels(1);
		courseListPersistence.setUserId(courseListView.getUserId());
		CourseListHelper.addCourseTitle(courseListPersistence);
	}
	/*
	 * 查找课程标题
	 */
	public static CourseTitleAddView selectcoursetitle(int userId){
		CourseTitleAddPersistence courseTitleAddPersistence = CourseListHelper.selectCourseTitle(userId);
		if(courseTitleAddPersistence == null){
			return null;
		}
		CourseTitleAddView courseTitleAddView = new CourseTitleAddView(courseTitleAddPersistence);
		return courseTitleAddView;
	}
	/*
	 * 添加课程的基本信息
	 */
	public static CourseTitleAddView selectcoursetitle2(String coursetitle){
		CourseTitleAddPersistence courseAddPersistence = CourseListHelper.selectCourseTitle2(coursetitle);
		if(courseAddPersistence ==null){
			return null;
		}
		CourseTitleAddView courseAddView = new CourseTitleAddView(courseAddPersistence);
		return courseAddView;
	}
	public static CourseAddView selectcoursetitle3(String coursetitle){
		CourseAddPersistence courseAddPersistence = CourseListHelper.selectCourseTitle3(coursetitle);
		if(courseAddPersistence ==null){
			return null;
		}
		CourseAddView courseAddView = new CourseAddView(courseAddPersistence);
		return courseAddView;
	}
	public static void CourseAdd(CourseAddView courseAddView){
		CourseAddPersistence courseAddPersistence = new CourseAddPersistence();
		courseAddPersistence.setCourseId(courseAddView.getCourseId());
		courseAddPersistence.setUserId(courseAddView.getUserId());
		courseAddPersistence.setCourseTitleId(courseAddView.getCourseTitleId());
		courseAddPersistence.setClassifyId(courseAddView.getClassifyId());
		courseAddPersistence.setCourseShortIntroduce(courseAddView.getCourseShortIntroduce());
		courseAddPersistence.setCourseIntroduce(courseAddView.getCourseIntroduce());
		courseAddPersistence.setCourseDifficulty(courseAddView.getCourseDifficulty());
		courseAddPersistence.setCourseNeedkonw(courseAddView.getCourseNeedkonw());
		courseAddPersistence.setCourseWilllearn(courseAddView.getCourseWilllearn());
		courseAddPersistence.setCourseImage("/org.xjtusicd3.partner/static/image/card1.png");
		courseAddPersistence.setCourseState(0);
		courseAddPersistence.setCourseTime(0);
		courseAddPersistence.setCourseScore(0);
		long l = System.currentTimeMillis();
		Date date = new Date(l);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		courseAddPersistence.setCourseDate(dateFormat.format(date));
		CourseListHelper.CourseAdd(courseAddPersistence);
	}
	/*
	 * 上传课程缩略图
	 */
	public static void updateCourseImage(int courseId,String courseImage){
		CourseListHelper.updateCourseImage(courseId, courseImage);
	}
	public static void updateCourseTime(int courseId,double courseTime){
		CourseListHelper.updateCourseTime(courseId, courseTime);
	}
	/*
	 * 查找课程缩略图
	 */
	public static CourseAddView selectcourseimage(int courseTitleId){
		CourseAddPersistence courseAddPersistence = CourseListHelper.selectCourseImage(courseTitleId);
		if(courseAddPersistence ==null){
			return null;
		}
		CourseAddView courseAddView = new CourseAddView(courseAddPersistence);
		return courseAddView;
	}
	/*
	 * ajax查找章节题目
	 */
	public static List<CourseTitleAddPersistence> getFirstTitle(int b){
		List<CourseTitleAddPersistence> list = CourseListHelper.getFirstTitle(b);
		return list;
	}
	/*
	 * 添加章节标题
	 */
	public static void addcourseTitle2(CourseTitleAddView courseTitleAddView,int userId,int courseTitleId)throws Exception{
		CourseTitleAddPersistence courseTitleAddPersistence = new CourseTitleAddPersistence();
		courseTitleAddPersistence.setCourseTitleId(courseTitleAddView.getCourseTitleId());
		courseTitleAddPersistence.setCourseTitle(courseTitleAddView.getCourseTitle());
		courseTitleAddPersistence.setUserId(userId);
		courseTitleAddPersistence.setCourseTitleParentId(courseTitleId);
		courseTitleAddPersistence.setCourseTitleLevels(2);
		CourseListHelper.addcourseTitle2(courseTitleAddPersistence);
		
	}
	public static void updateCourse(int courseTitleId, String courseShortIntroduce, String courseIntroduce,
			String courseNeedkonw, String courseWilllearn) {
		CourseListHelper.updateCourse(courseTitleId, courseShortIntroduce,courseIntroduce,courseNeedkonw,courseWilllearn);
	}
	public static List<UserView> teacher(int b) {
		List<UserView> userViews = new ArrayList<UserView>();
		List<UserPersistence> userPersistences = UserHelper.teacher(b);
		if(userPersistences==null){
			return null;
		}
		for(UserPersistence userPersistence2:userPersistences){
			UserView view = new UserView(userPersistence2);
			userViews.add(view);
		}
		return userViews;
	}
}
	

