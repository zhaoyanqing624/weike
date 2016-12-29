package org.xjtusicd3.partner.view;

import org.xjtusicd3.database.model.SearchPersistence;

public class SearchView {
	private int searchId;
	private int userId;
	private String searchName;
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
	
	public SearchView(SearchPersistence searchPersistence){
		if(searchPersistence==null){
			return;
		}
		this.searchId = searchPersistence.getSearchId();
		this.userId = searchPersistence.getUserId();
		this.searchName = searchPersistence.getSearchName();
		this.searchData = searchPersistence.getSearchData();
	}
	
	public SearchView(){
		
	}
}
