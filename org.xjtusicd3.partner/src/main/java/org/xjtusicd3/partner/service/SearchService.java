package org.xjtusicd3.partner.service;

import java.util.ArrayList;
import java.util.List;

import org.xjtusicd3.database.helper.SearchHelp;
import org.xjtusicd3.database.model.SearchPersistence;
import org.xjtusicd3.partner.view.SearchView;

public class SearchService {
	public static void addSearch(SearchView searchView){
		SearchPersistence searchPersistence = new SearchPersistence();
		searchPersistence.setSearchId(searchView.getSearchId());
		searchPersistence.setUserId(searchView.getUserId());
		searchPersistence.setSearchName(searchView.getSearchName());
		searchPersistence.setSearchData(searchView.getSearchData());
		SearchHelp.addSearch(searchPersistence);
	}
	
	public static List<SearchView> selectHotSearch(){
		List<SearchView> list = new ArrayList<SearchView>();
		List<SearchPersistence> searchPersistences  = SearchHelp.selectHotSearch();
		if(searchPersistences == null){
			return null;
		}
		for(SearchPersistence searchPersistence2:searchPersistences){
			SearchView searchView = new SearchView(searchPersistence2);
			list.add(searchView);
		}
		return list;
		
	}
}
