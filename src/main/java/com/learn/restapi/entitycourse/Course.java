package com.learn.restapi.entitycourse;

public class Course {
	private String coname;
	private String duration;
	private String coid;
	private long coursfe;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	public Course(  String coid,String coname, long coursfe, String duration) {
		super();
		this.coname = coname;
		this.coursfe = coursfe;
		this.duration = duration;
		this.coid = coid;
	}
	public String getConame() {
		return coname;
	}
	public void setConame(String coname) {
		this.coname = coname;}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;}
	public String getCoid() {
		return coid;
	}
	public void setCoid(String coid) {
		this.coid = coid;}
	public long getCoursfe() {
		return coursfe;
	}
	public void setCoursfe(long coursfe) {
		this.coursfe = coursfe;}

	@Override
	public String toString() {
		return "Course [coname=" + coname + ", coid=" + coid + ", coursfe=" + coursfe + ", duration=" + duration + "]";
		}
	}
	 
	
	 
	
	 

