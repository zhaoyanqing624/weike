package org.xjtusicd3.database.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.xjtusicd3.database.logic.IBaseDao;
import org.xjtusicd3.database.model.CourseAddPersistence;
import org.xjtusicd3.database.model.CourseTitleAddPersistence;

public interface CourseTitleAddPersistenceMapper extends IBaseDao<CourseTitleAddPersistence, String>{
	/*
	 * 查询课程主题目
	 */
	@Select({"SELECT * From coursetitle WHERE courseTitleId=#{courseTitleId};"})
	CourseTitleAddPersistence selectCourseTitle(int courseTitleId);
	/*
	 * 根据课程名称查询详细信息
	 */
	@Select({"SELECT * From coursetitle WHERE courseTitle=#{courseTitle};"})
	CourseTitleAddPersistence selectCourseTitle2(String courseTitle);
	
	/*
	 * ajax查看章节题目
	 */
	@Select({"select * FROM coursetitle where courseTitleParentId=#{courseTitleId}"})
	List<CourseTitleAddPersistence> getFirstTitle(int courseTitleId);
	}

