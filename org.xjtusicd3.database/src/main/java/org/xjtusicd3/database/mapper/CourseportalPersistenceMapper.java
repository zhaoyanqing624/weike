package org.xjtusicd3.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.xjtusicd3.database.logic.IBaseDao;
import org.xjtusicd3.database.model.CourseportalPersistence;

public interface CourseportalPersistenceMapper extends IBaseDao<CourseportalPersistence, String>{
	
	@Select("SELECT * from course,user,classify,coursetitle WHERE course.classifyId=classify.classifyId AND course.courseTitleId=coursetitle.courseTitleId AND course.userId=user.userId AND course.courseState='0' ORDER BY course.courseDate")
	List<CourseportalPersistence> getCourse();
	
	@Select("SELECT * from course,user,classify,coursetitle WHERE course.classifyId=classify.classifyId AND course.courseTitleId=coursetitle.courseTitleId AND course.userId=user.userId AND course.courseState='1' ORDER BY course.courseDate")
	List<CourseportalPersistence> getCourse2();
	
	@Update("Update course set courseState='1' where courseId=#{0}")
	void updateCourse(int c);
	@Update("Update course set courseState='0' where courseId=#{0}")
	void updateCourse2(int c);

}
