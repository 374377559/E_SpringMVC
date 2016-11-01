package cn.web.dao;

import org.springframework.stereotype.Repository;
import cn.web.entity.StuCls;

@Repository("stuClsDao")
public class StuClsDao extends BaseDao{
	
	
	public boolean addCls(StuCls cls){
		try {
			getSession().save(cls);
			return true;
		} catch (Exception e) {
			System.err.println("添加出现异常！！！return false"+getSession());
		}
		return false;
	}
}
