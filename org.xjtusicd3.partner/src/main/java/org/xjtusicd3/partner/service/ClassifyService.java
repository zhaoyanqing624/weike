package org.xjtusicd3.partner.service;

import java.util.List;

import org.xjtusicd3.database.helper.ClassifyHelp;
import org.xjtusicd3.database.model.ClassifyPersistence;
import org.xjtusicd3.partner.view.ClassifyView;

public class ClassifyService {
	public static List<ClassifyPersistence> getFirstLevel() {
		List<ClassifyPersistence> list = ClassifyHelp.getFirstLevel(1);
		return list;
	}

	public static List<ClassifyPersistence> getNextLevel(int classifyId) {
		List<ClassifyPersistence> list = ClassifyHelp.getNextLevel(classifyId);
		return list;
	}
	
	public static ClassifyView selectClassifyById(int b){
		ClassifyPersistence classifyPersistence = ClassifyHelp.selectClassifyById(b);
		if(classifyPersistence ==null){
			return null;
		}
		ClassifyView classifyView = new ClassifyView(classifyPersistence);
		return classifyView;
	}
}
