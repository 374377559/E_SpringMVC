package cn.web.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.web.dao.StuClsDao;
import cn.web.entity.StuCls;

@Service("stiClsService")
public class StuClsService {
	
	@Resource
	private StuClsDao stuClsDao;
	
		public boolean addCls(StuCls cls){
			if(stuClsDao.addCls(cls)){
				return true;
			}
			return false;
		}
}
