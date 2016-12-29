package org.xjtusicd3.portal.view;

import org.xjtusicd3.database.model.UserVisiualPersistence;

public class UserVisiualView {
	private String userJob;
	private String counts_userJob;
	public String getUserJob() {
		return userJob;
	}
	public void setUserJob(String userJob) {
		this.userJob = userJob;
	}
	public String getCounts_userJob() {
		return counts_userJob;
	}
	public void setCounts_userJob(String counts_userJob) {
		this.counts_userJob = counts_userJob;
	}
	
	public UserVisiualView(UserVisiualPersistence userVisiualPersistence){
		if(userVisiualPersistence==null){
			return;
		}
		this.userJob = userVisiualPersistence.getUserJob();
		this.counts_userJob = userVisiualPersistence.getCounts_userJob();
	}
	
	@Override
	public String toString(){
		return "UserVisiualView [userJob="+userJob+",counts_userJob="+counts_userJob+"]";
	}
}
