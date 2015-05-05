package com.SMS.ReportExport.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "StudentCourseBatch")
public class StudentCourseBatch {

	@Id
	@Column(name = "course_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseid;
	
	@Column(name="course_name")
	private String courseName;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="course_status")
	private String courseStatus;
	
	@Column(name="batch_no")
	private int batchNo;
	
	@Column(name="remarks")
	private String remarks;

//	public StudentCourseBatch( String courseName,
//			String studentName, String courseStatus, int batchNo, String remarks) {
//		this.courseName = courseName;
//		this.studentName = studentName;
//		this.courseStatus = courseStatus;
//		this.batchNo = batchNo;
//		this.remarks = remarks;
//	}

	public StudentCourseBatch() {
		
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}

	public int getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(int batchNo) {
		this.batchNo = batchNo;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	
	
	
	
	
	
	
}
