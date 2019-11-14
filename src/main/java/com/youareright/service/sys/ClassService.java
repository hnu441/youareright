package com.youareright.service.sys;

import java.util.List;

import com.youareright.model.sys.ClassEntity;

public interface ClassService {
	
	public void insertClass(ClassEntity classEntity);
	
	public void updateClass(ClassEntity classEntity);
	
	public void deleteClasses(List<String> className);
	
	public void del(ClassEntity classEntity);
	
	public List<ClassEntity> classList(String goodsFilename, int pageSize, int start) ;

	public Integer classSize(String goodsClass, int pageSize, int start);

}