package org.xjtusicd3.portal.view;

import org.xjtusicd3.database.model.SearchVisiualPersistence;

public class SearchVisiualView {
	private String searchName;
	private String counts_searchName;
	public String getSearchName() {
		return searchName;
	}
	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}
	
	public String getCounts_searchName() {
		return counts_searchName;
	}
	public void setCounts_searchName(String counts_searchName) {
		this.counts_searchName = counts_searchName;
	}
	public SearchVisiualView(SearchVisiualPersistence searchVisiualPersistence){
		if(searchVisiualPersistence==null){
			return;
		}
		this.searchName = searchVisiualPersistence.getSearchName();
		this.counts_searchName = searchVisiualPersistence.getCounts_searchName();
	}
	@Override
	public String toString(){
		return "SearchVisualView [searchName="+searchName+",counts_searchName="+counts_searchName+"]";   
	}
}
