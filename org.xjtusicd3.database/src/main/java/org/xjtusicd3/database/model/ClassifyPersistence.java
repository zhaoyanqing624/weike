package org.xjtusicd3.database.model;

import org.xjtusicd3.database.ann.Table;
import org.xjtusicd3.database.ann.TableField;

@Table(tablename="classify")
public class ClassifyPersistence {
	
	@TableField(columnName = "classifyId")
	private int classifyId;
	@TableField(columnName = "classifyName")
	private String classifyName;
	@TableField(columnName = "classifyDuo")
	private String classifyDuo;
	@TableField(columnName = "classifyParentId")
	private int classifyParentId;
	@TableField(columnName = "classifyLevels")
	private int classifyLevels;
	
	
	
	public String getClassifyDuo() {
		return classifyDuo;
	}
	public void setClassifyDuo(String classifyDuo) {
		this.classifyDuo = classifyDuo;
	}
	public int getClassifyId() {
		return classifyId;
	}
	public void setClassifyId(int classifyId) {
		this.classifyId = classifyId;
	}
	public String getClassifyName() {
		return classifyName;
	}
	public void setClassifyName(String classifyName) {
		this.classifyName = classifyName;
	}
	public int getClassifyParentId() {
		return classifyParentId;
	}
	public void setClassifyParentId(int classifyParentId) {
		this.classifyParentId = classifyParentId;
	}
	public int getClassifyLevels() {
		return classifyLevels;
	}
	public void setClassifyLevels(int classifyLevels) {
		this.classifyLevels = classifyLevels;
	}
	
	
	
}
