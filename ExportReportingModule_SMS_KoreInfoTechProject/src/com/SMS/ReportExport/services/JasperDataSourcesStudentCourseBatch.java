package com.SMS.ReportExport.services;

import java.util.ArrayList;

import com.SMS.ReportExport.DAO.StudentCourseBatchDAO;
import com.SMS.ReportExport.DAO.StudentCourseBatchDAOImpl;
import com.SMS.ReportExport.entities.StudentCourseBatch;
import com.SMS.ReportExport.main.StudentCourseBatchDataBean;

public class JasperDataSourcesStudentCourseBatch {
	
public static void main(String[] args) {
		
	StudentCourseBatchDataBean databean = new StudentCourseBatchDataBean ();
		
	StudentCourseBatchDAO stuDAO = new StudentCourseBatchDAOImpl();
		
//	stuDAO.addStudentCourse(databean.getdatabean());
	stuDAO.addStudentCourse(databean.datainfo("Java", "Edy", "Paid", 3, "No Comment"));
	
		
	ArrayList<StudentCourseBatch> stulist = (ArrayList<StudentCourseBatch>) stuDAO.ListStudent();
		
		for(StudentCourseBatch sc:stulist){
			System.out.println(sc.getStudentName());
			
		}
		
		
	}
		
		
	
			
	
		
		

	

}
