package org.xjtusicd3.database.mapper;

import org.apache.ibatis.annotations.Select;
import org.xjtusicd3.database.logic.IBaseDao;
import org.xjtusicd3.database.model.VideoPersistence;

public interface VideoPersistenceMapper extends IBaseDao<VideoPersistence, String>{
	@Select("insert into video(courseId,courseTitleId,videoName) VALUES (#{0},#{1},#{2})")
	VideoPersistence addVideo(int param1,int param2,String param3);
	
	@Select("select * from video where videoName=#{videoName}")
	VideoPersistence selectvideo(String videoName);
	
	@Select("update video set videoURL=#{1} where videoId=#{0}")
	VideoPersistence updateVideo(int param2,String param1);
	
	@Select("update video set videoTime=#{1},videoSize=#{2} where videoId=#{0}")
	VideoPersistence updateVideo2(int param1,double param2,long param3);
	
	@Select("select sum(videoTime) from video where courseId=#{0}")
	public double selectTotalVideoTime(int param1);
	
	@Select("select courseId from video where videoId=#{videoId}")
	int selectCourseId(int videoId);
	
	@Select("select videoName from video where videoId=#{videoId}")
	String selectVideoName(int videoId);
	
}
