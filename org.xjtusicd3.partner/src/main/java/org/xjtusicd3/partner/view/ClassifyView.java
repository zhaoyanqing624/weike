package org.xjtusicd3.partner.view;

import org.xjtusicd3.database.model.ClassifyPersistence;

public class ClassifyView {
	private int classifyId;
	private String classifyName;
	private String classifyDuo;
	private int classifyParentId;
	private int classifyLevels;
	
	
	
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
	public String getClassifyDuo() {
		return classifyDuo;
	}
	public void setClassifyDuo(String classifyDuo) {
		this.classifyDuo = classifyDuo;
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
	
	
	public ClassifyView(ClassifyPersistence classifyPersistence) {
		if(classifyPersistence ==null){
			return;
		}
		this.classifyId = classifyPersistence.getClassifyId();
		this.classifyName = classifyPersistence.getClassifyName();
		this.classifyDuo = classifyPersistence.getClassifyDuo();
		this.classifyParentId = classifyPersistence.getClassifyParentId();
		this.classifyLevels = classifyPersistence.getClassifyLevels();
		
	}
	public ClassifyView(){
		
	}
}
