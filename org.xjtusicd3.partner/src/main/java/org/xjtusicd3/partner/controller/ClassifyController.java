package org.xjtusicd3.partner.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xjtusicd3.common.util.JsonUtil;
import org.xjtusicd3.database.model.ClassifyPersistence;
import org.xjtusicd3.partner.service.ClassifyService;

@Controller
public class ClassifyController {
	@RequestMapping(value={"getFirstLevel"},method={org.springframework.web.bind.annotation.RequestMethod.GET},produces="text/html;charset=UTF-8")
	public void search(HttpServletResponse response) throws IOException{

		List<ClassifyPersistence> firstLevel = ClassifyService.getFirstLevel();
		if (firstLevel == null || firstLevel.size()==0) {
			return ;
		}			
		String result = JsonUtil.toJsonString(firstLevel);
		PrintWriter out = response.getWriter();  
		out.write(result);
		return ;
	 }
	
	@RequestMapping(value={"getNextLevel"},method={org.springframework.web.bind.annotation.RequestMethod.GET},produces="text/html;charset=UTF-8")
	public void getNextLevel(int classifyId,HttpServletResponse response) throws IOException{
		if (classifyId==0) {
			return ;
		}

		List<ClassifyPersistence> nextLevel = ClassifyService.getNextLevel(classifyId);
		if (nextLevel == null || nextLevel.size()==0) {
			return ;
		}				
		String result = JsonUtil.toJsonString(nextLevel);
		
		PrintWriter out = response.getWriter();  
		out.write(result);
		return ;
	 }
	

}	
