package org.xjtusicd3.database.model;

import org.xjtusicd3.database.ann.Table;
import org.xjtusicd3.database.ann.TableField;

@Table(tablename="search")
public class SearchPersistence {
	@TableField(columnName = "searchId")
	private int searchId;
	@TableField(columnName = "userId")
	private int userId;
	@TableField(columnName = "searchName")
	private String searchName;
	@TableField(columnName = "searchData")
	private String searchData;
	
	
	public int getSearchId() {
		return searchId;
	}
	public void setSearchId(int searchId) {
		this.searchId = searchId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getSearchName() {
		return searchName;
	}
	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}
	public String getSearchData() {
		return searchData;
	}
	public void setSearchData(String searchData) {
		this.searchData = searchData;
	}
	
	
}
