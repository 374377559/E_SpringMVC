package cn.web.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Student implements Serializable{
		private int sids;
		private String sname;
		private String scls;
		@DateTimeFormat(pattern="yyyy-MM-dd")
		private Date sdate;
		
		
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
			
}
