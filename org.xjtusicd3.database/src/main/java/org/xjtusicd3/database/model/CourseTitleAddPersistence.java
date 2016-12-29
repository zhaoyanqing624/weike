package org.xjtusicd3.database.model;

import org.xjtusicd3.database.ann.Table;
import org.xjtusicd3.database.ann.TableField;
import org.xjtusicd3.database.ann.TableKey;
import org.xjtusicd3.database.ann.TableKey.Strategy;
@Table(tablename="coursetitle")
public class CourseTitleAddPersistence {
	@TableKey(strategy = Strategy.NORMAL)
	@TableField(columnName = "courseTitleId")
	public int courseTitleId;
	@TableField(columnName = "userId")
	public int userId;
	@TableField(columnName = "courseTitle")
	public String courseTitle;
	@TableField(columnName = "courseTitleParentId")
	public int courseTitleParentId;
	@TableField(columnName = "courseTitleLevels")
	public int courseTitleLevels;
	
	
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCourseTitleId() {
		return courseTitleId;
	}
	public void setCourseTitleId(int courseTitleId) {
		this.courseTitleId = courseTitleId;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public int getCourseTitleParentId() {
		return courseTitleParentId;
	}
	public void setCourseTitleParentId(int courseTitleParentId) {
		this.courseTitleParentId = courseTitleParentId;
	}
	public int getCourseTitleLevels() {
		return courseTitleLevels;
	}
	public void setCourseTitleLevels(int courseTitleLevels) {
		this.courseTitleLevels = courseTitleLevels;
	}
	
	
}
