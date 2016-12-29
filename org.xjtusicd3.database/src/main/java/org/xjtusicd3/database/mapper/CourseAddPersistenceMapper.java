package org.xjtusicd3.database.mapper;

import org.apache.ibatis.annotations.Select;
import org.xjtusicd3.database.logic.IBaseDao;
import org.xjtusicd3.database.model.CourseAddPersistence;
import org.xjtusicd3.database.model.UserPersistence;

public interface CourseAddPersistenceMapper extends IBaseDao<CourseAddPersistence, String>{
	@Select({"SELECT * From coursetitle WHERE courseTitle=#{courseTitle};"})
	CourseAddPersistence selectCourseTitle3(String courseTitle);
	
	@Select("update course set courseImage=#{1} where courseId=#{0};")
	UserPersistence updateCourseImage(int param2,String param1);
	
	@Select("select * From course where courseTitleId=#{courseTitleId}")
	CourseAddPersistence selectCourseImage(int courseTitleId);
	
	@Select("update course set courseTime=#{1} where courseId=#{0};")
	UserPersistence updateCourseTime(int param2,double param1);
	
	@Select("update course set courseShortIntroduce=#{1},courseIntroduce=#{2},courseNeedkonw=#{3},courseWilllearn=#{4} where courseTitleId=#{0};")
	void updateCourse(int param1, String param2, String param3, String param4,String param5);
	
	
	
}
