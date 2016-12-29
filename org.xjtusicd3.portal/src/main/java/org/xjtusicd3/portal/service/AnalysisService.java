package org.xjtusicd3.portal.service;

import java.util.ArrayList;
import java.util.List;

import org.xjtusicd3.database.helper.SearchHelp;
import org.xjtusicd3.database.helper.UserHelper;
import org.xjtusicd3.database.model.SearchVisiualPersistence;
import org.xjtusicd3.database.model.UserVisiualPersistence;
import org.xjtusicd3.portal.view.SearchVisiualView;
import org.xjtusicd3.portal.view.UserVisiualView;

public class AnalysisService {

	public static List<SearchVisiualView> SearchVisiual() {
		List<SearchVisiualView> list = new ArrayList<SearchVisiualView>();
		List<SearchVisiualPersistence> searchVisiualPersistences = SearchHelp.selectHotSearch2();
		if(searchVisiualPersistences==null){
			return null;
		}
		for(SearchVisiualPersistence searchVisiualPersistence2:searchVisiualPersistences){
			SearchVisiualView searchVisiualView = new SearchVisiualView(searchVisiualPersistence2);
			list.add(searchVisiualView);
		}
		return list;
	}
	
	public static List<UserVisiualView> UserVisiual(){
		List<UserVisiualView> list = new ArrayList<UserVisiualView>();
		List<UserVisiualPersistence> userVisiualPersistences = UserHelper.selectUserVisiual();
		if(userVisiualPersistences==null){
			return null;
		}
		for(UserVisiualPersistence userVisiualPersistence2:userVisiualPersistences){
			UserVisiualView userVisiualView = new UserVisiualView(userVisiualPersistence2);
			list.add(userVisiualView);
		}
		return list;
	}


}
