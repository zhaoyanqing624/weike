package org.xjtusicd3.partner.service;

import org.xjtusicd3.database.helper.VideoHelper;
import org.xjtusicd3.database.model.VideoPersistence;
import org.xjtusicd3.partner.view.VideoView;

public class VideoService {
	/*
	 * 上传视频
	 */
	public static void VideoAdd(VideoView videoView){
		VideoPersistence videoPersistence = new VideoPersistence();
		videoPersistence.setVideoId(videoView.getVideoId());
		videoPersistence.setCourseId(videoView.getCourseId());
		videoPersistence.setCourseTitleId(videoView.getCourseTitleId());
		videoPersistence.setVideoName(videoView.getVideoName());
		videoPersistence.setVideoTime(videoView.getVideoTime());
		videoPersistence.setVideoSize(videoView.getVideoSize());
		videoPersistence.setVideoURL(videoView.getVideoURL());
		VideoHelper.addVideo(videoPersistence);
	}
	/*
	 * 添加视频
	 */
	public static void addVideo(int courseId,int courseTitleId,String videoName){
		VideoHelper.addVideo1(courseId,courseTitleId,videoName);
	}
	/*
	 * 更新视频题目
	 */
	public static void updateVideo(int videoId,String videoURL){
		VideoHelper.updateVideo(videoId,videoURL);
	}
	public static void updateVideo2(int videoId,double videoTime,long videoSize){
		VideoHelper.updateVideo2(videoId,videoTime,videoSize);
	}
	
	/*
	 * 查找视频列表信息
	 */
	public static VideoView selectvideo(String videoName){
		VideoPersistence videoPersistence = VideoHelper.selectvideo(videoName);
		if(videoPersistence==null){
			return null;
		}
		VideoView videoView = new VideoView(videoPersistence);
		return videoView;
	}
	/*
	 * 查找一个课程视频的总时间
	 */
	public static double selectTotalTime(int courseId){
		double totalTime = VideoHelper.selectTotalVideoTime(courseId);
		return totalTime;
	}
	public static int selectCourseId(int videoId){
		int a = VideoHelper.selectCourseId(videoId);
		return a;
	}
	public static String selectVideoName(int videoId){
		String a = VideoHelper.selectVideoName(videoId);
		return a;
	}
}
