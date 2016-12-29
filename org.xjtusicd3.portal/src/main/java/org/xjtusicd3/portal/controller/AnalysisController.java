package org.xjtusicd3.portal.controller;

import java.util.List;

import javax.jws.WebParam.Mode;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.xjtusicd3.portal.service.AnalysisService;
import org.xjtusicd3.portal.view.SearchVisiualView;
import org.xjtusicd3.portal.view.UserVisiualView;

@Controller
public class AnalysisController {
	@RequestMapping(value={"searchVisiual"},method={org.springframework.web.bind.annotation.RequestMethod.GET})
	public ModelAndView searchVisiual(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView("info");
		List<SearchVisiualView> list = AnalysisService.SearchVisiual();
		List<UserVisiualView> list2 = AnalysisService.UserVisiual();
		int length = list.size();
		int length2 = list2.size();
		String a = null;
		String b;
		String c = null;
		String date_searchName="'";
		String date_counts_searchName="";
		String date="";
		for(SearchVisiualView searchVisiualView:list){
			length--;
			a = searchVisiualView.getSearchName();
			b = searchVisiualView.getCounts_searchName();
			c = "{value:"+b+",name:'"+a+"'}";
			date_searchName += a;
			date_counts_searchName +=b;
			date +=c;
			if(length>=1){
				date_searchName +="','";
				date_counts_searchName +=",";
				date+=",";
			}else {
				date_searchName +="'";
			}
			
		}
		String d = null;
		String f;
		String  date_userJob = "'";
		String date_counts_userJob ="";
		
		for(UserVisiualView userVisiualView:list2){
			length2--;
			d = userVisiualView.getUserJob();
			f = userVisiualView.getCounts_userJob();
			int dd = Integer.parseInt(d);
			if(dd==0){
				d="没有填写";
			}else if (dd==1) {
				d="页面重构设计师";
			}else if (dd==2) {
				d="交互设计师";
			}else if (dd==3) {
				d="产品经理";
			}else if (dd==4) {
				d="UI设计师";
			}else if (dd==5) {
				d="JS工程师";
			}else if (dd==6) {
				d="Web前端工程师";
			}else if (dd==7) {
				d="移动开发工程师";
			}else if (dd==8) {
				d="PHP开发工程师";
			}else if (dd==9) {
				d="软件测试工程师";
			}else if (dd==10) {
				d="Linux系统工程师";
			}else if (dd==11) {
				d="JAVA工程师";
			}else if (dd==13) {
				d="学生";
			}else if (dd==15) {
				d="数据库工程师";
			}else if (dd==16) {
				d="全栈工程师";
			}else if (dd==17) {
				d="CG影视动画师";
			}
			date_userJob +=d;
			date_counts_userJob +=f;
			if(length2>=1){
				date_userJob += "','";
				date_counts_userJob += ",";
			}else {
				date_userJob +="'";
			}
			
		}
		modelAndView.addObject("date_searchName", date_searchName);
		modelAndView.addObject("date", date);
		modelAndView.addObject("date_userJob", date_userJob);
		modelAndView.addObject("date_counts_userJob", date_counts_userJob);
		System.out.println(date_userJob);
		System.out.println(date_counts_userJob);
		return modelAndView;
		
	}
	
	
}
