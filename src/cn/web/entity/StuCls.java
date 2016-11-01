package cn.web.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class StuCls implements Serializable{
	 private int stid;
	 private String cname;
	 private String cteacher;
	
	
	
	public StuCls() {
		super();
	}

	public StuCls(int stid, String cname, String cteacher) {
		super();
		this.stid = stid;
		this.cname = cname;
		this.cteacher = cteacher;
	}

	public int getStid() {
		return stid;
	}
	

	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCteacher() {
		return cteacher;
	}
	public void setCteacher(String cteacher) {
		this.cteacher = cteacher;
	}
	 
	 
}
