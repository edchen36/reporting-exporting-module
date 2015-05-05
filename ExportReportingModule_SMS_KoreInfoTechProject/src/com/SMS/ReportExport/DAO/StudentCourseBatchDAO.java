package com.SMS.ReportExport.DAO;

import java.util.ArrayList;
import java.util.List;

import com.SMS.ReportExport.entities.StudentCourseBatch;

public interface StudentCourseBatchDAO {
	
	public void addStudentCourse(StudentCourseBatch sc);
	public List<StudentCourseBatch> ListStudent();
	public StudentCourseBatch getStudent (String courseName);
	public List<StudentCourseBatch> listStudentwithCourseStatus (String courseStatus);
	public List<StudentCourseBatch> listStudentwithBatchNo (String batchNo);
	
	
	

}
