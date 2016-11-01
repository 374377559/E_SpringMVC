package cn.web.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

public class Student implements Serializable{
		private int sids;
		private String sname;
		private String scls;
		@DateTimeFormat(pattern="yyyy-MM-dd")
		private Date sdate;
		
		//学生关联班级，多对一
		private StuCls cls ;
		
		public int getSids() {
			return sids;
		}
		public void setSids(int sids) {
			this.sids = sids;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getScls() {
			return scls;
		}
		public void setScls(String scls) {
			this.scls = scls;
		}
		public Date getSdate() {
			return sdate;
		}
		public void setSdate(Date sdate) {
			this.sdate = sdate;
		}
		
		
		public StuCls getCls() {
			return cls;
		}
		public void setCls(StuCls cls) {
			this.cls = cls;
		}
		
			
}
