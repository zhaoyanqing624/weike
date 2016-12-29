package org.xjtusicd3.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.xjtusicd3.database.logic.IBaseDao;
import org.xjtusicd3.database.model.UserpersonalPersistence;

public interface UserpersonalPersistenceMapper extends IBaseDao<UserpersonalPersistence, String>{
	@Select("SELECT * from record,course,coursetitle,video,user WHERE record.userId=user.userId AND record.courseId=course.courseId AND record.videoId=video.videoId AND course.courseTitleId=coursetitle.courseTitleId AND record.userId=#{0} ORDER BY record.recordDate DESC")
	List<UserpersonalPersistence> getlistuser(int u);
	
	
	
	
	


}
