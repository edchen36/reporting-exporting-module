package com.SMS.ReportExport.main;

import java.util.ArrayList;

import com.SMS.ReportExport.entities.Course;
import com.SMS.ReportExport.entities.CourseStatus;
import com.SMS.ReportExport.entities.Student;
import com.SMS.ReportExport.entities.StudentCourseBatch;

public class StudentCourseBatchDataBean {
	
	/* Course Class is temporary and for testing purpose, 
	 * actual class will be taken from Amit/Diparati Module
	 */
	//String courseName,String studentName,int bacthNo,String remarks
	
	public ArrayList<StudentCourseBatch> getdatabean(){
		
		ArrayList<StudentCourseBatch> datalist = new ArrayList<StudentCourseBatch> ();
		
		datalist.add(datainfo("Java","Amit","Paid",1,"No Comment"));
		datalist.add(datainfo("Java","Dinesh","Paid",1,"No Comment"));
		datalist.add(datainfo("Oracle","Edy","Paid",2,"No Comment"));
		datalist.add(datainfo("Linux","Shankar","Paid",2,"No Comment"));
		
		return datalist;
	}
	
	public StudentCourseBatch datainfo (String courseName,String studentName,String courseStatus,
			int batchNo,String remarks){
		
		StudentCourseBatch databean = new StudentCourseBatch();
		databean.setCourseName(courseName);
		databean.setStudentName(studentName);
		databean.setCourseStatus(courseStatus);
		databean.setBatchNo(batchNo);
		databean.setRemarks(remarks);
		
		return databean;
	}
		

		
	
	}

	


		
	
	
	
	


