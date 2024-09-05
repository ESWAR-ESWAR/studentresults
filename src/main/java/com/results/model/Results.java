package com.results.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Results {
	
	@Id
	private String hallticketno;
	private String javamarks;
	private String acdmarks;
	private String semarks;
	private String mefamarks;
	private String rmarks;
	public Results() {
		super();
	}
	public Results(String hallticketno, String javamarks, String acdmarks, String semarks, String mefamarks,
			String rmarks) {
		super();
		this.hallticketno = hallticketno;
		this.javamarks = javamarks;
		this.acdmarks = acdmarks;
		this.semarks = semarks;
		this.mefamarks = mefamarks;
		this.rmarks = rmarks;
	}
	public String getHallticketno() {
		return hallticketno;
	}
	public void setHallticketno(String hallticketno) {
		this.hallticketno = hallticketno;
	}
	public String getJavamarks() {
		return javamarks;
	}
	public void setJavamarks(String javamarks) {
		this.javamarks = javamarks;
	}
	public String getAcdmarks() {
		return acdmarks;
	}
	public void setAcdmarks(String acdmarks) {
		this.acdmarks = acdmarks;
	}
	public String getSemarks() {
		return semarks;
	}
	public void setSemarks(String semarks) {
		this.semarks = semarks;
	}
	public String getMefamarks() {
		return mefamarks;
	}
	public void setMefamarks(String mefamarks) {
		this.mefamarks = mefamarks;
	}
	public String getRmarks() {
		return rmarks;
	}
	public void setRmarks(String rmarks) {
		this.rmarks = rmarks;
	}
	@Override
	public String toString() {
		return "Results [hallticketno=" + hallticketno + ", javamarks=" + javamarks + ", acdmarks=" + acdmarks
				+ ", semarks=" + semarks + ", mefamarks=" + mefamarks + ", rmarks=" + rmarks + "]";
	}
	
	

}
