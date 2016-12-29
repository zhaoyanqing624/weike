package org.xjtusicd3.database.model;

import org.xjtusicd3.database.ann.Table;
import org.xjtusicd3.database.ann.TableField;
import org.xjtusicd3.database.ann.TableKey;
import org.xjtusicd3.database.ann.TableKey.Strategy;

@Table(tablename="admin")
public class AdminPersistence {
	@TableKey(strategy=Strategy.NORMAL)
	@TableField(columnName="adminId")
	private int adminId;
	@TableField(columnName="adminNumber")
	private String adminNumber;
	@TableField(columnName="adminPassword")
	private String adminPassword;
	@TableField(columnName="adminYanzhengma")
	private int adminYanzhengma;
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
	
	
}
