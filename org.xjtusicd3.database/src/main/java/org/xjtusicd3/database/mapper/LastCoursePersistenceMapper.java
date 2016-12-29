package org.xjtusicd3.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.xjtusicd3.database.logic.IBaseDao;
import org.xjtusicd3.database.model.LastCoursePersistence;

public interface LastCoursePersistenceMapper extends IBaseDao<LastCoursePersistence,String>{
	
	/*
	 * 查询学习过的记录
	 */
	@Select({"SELECT * FROM record,course,coursetitle,video WHERE record.courseId=course.courseId AND record.videoId=video.videoId AND course.courseTitleId=coursetitle.courseTitleId AND record.userId=#{0} order by record.recordDate DESC"})
	public abstract List<LastCoursePersistence> selectLastCourse(int param1);
	/*
	 * 查询最新的学习记录
	 */
	@Select({"SELECT coursetitle.courseTitleId,record.videoId,coursetitle.courseTitle,video.videoName FROM record,course,coursetitle,video WHERE record.courseId=course.courseId AND record.videoId=video.videoId AND course.courseTitleId=coursetitle.courseTitleId AND record.userId=#{0} ORDER BY record.recordDate DESC LIMIT 1"})
	public abstract List<LastCoursePersistence> selectLastCourse2(int param1);
}
