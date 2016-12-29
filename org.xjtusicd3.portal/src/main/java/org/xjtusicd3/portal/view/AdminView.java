package org.xjtusicd3.portal.view;

import org.xjtusicd3.database.model.AdminPersistence;

public class AdminView {
	private int adminId;
	private String adminNumber;
	private String adminPassword;
	private String adminPassword1;
	private String adminPassword2;
	private String adminPassword3;
	private int adminYanzhengma;
	
	
	
	public String getAdminPassword1() {
		return adminPassword1;
	}
	public void setAdminPassword1(String adminPassword1) {
		this.adminPassword1 = adminPassword1;
	}
	public String getAdminPassword2() {
		return adminPassword2;
	}
	public void setAdminPassword2(String adminPassword2) {
		this.adminPassword2 = adminPassword2;
	}
	public String getAdminPassword3() {
		return adminPassword3;
	}
	public void setAdminPassword3(String adminPassword3) {
		this.adminPassword3 = adminPassword3;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminNumber() {
		return adminNumber;
	}
	public void setAdminNumber(String adminNumber) {
		this.adminNumber = adminNumber;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public int getAdminYanzhengma() {
		return adminYanzhengma;
	}
	public void setAdminYanzhengma(int adminYanzhengma) {
		this.adminYanzhengma = adminYanzhengma;
	}
	
	public AdminView(AdminPersistence adminPersistence){
		this.adminId = adminPersistence.getAdminId();
		this.adminNumber = adminPersistence.getAdminNumber();
		this.adminPassword = adminPersistence.getAdminPassword();
		this.adminYanzhengma = adminPersistence.getAdminYanzhengma();
	}
	
	public AdminView(){
		
	}
}
