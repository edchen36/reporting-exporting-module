package com.SMS.ReportExport.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

import com.SMS.ReportExport.entities.StudentCourseBatch;
import com.SMS.ReportExport.main.StudentCourseBatchDataBean;


public class JasperReportFill {
	
		public static final String TEMPLATE = "jrxml/StudentCourseBatchSchedule.jrxml";
		
		public void reportService(){
			
			StudentCourseBatchDataBean databean = new StudentCourseBatchDataBean();
			
			ArrayList<StudentCourseBatch> datalist = databean.getdatabean();
		
			JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(datalist);
		
			try{
				Map parameters = new HashMap();
				parameters.put("Title", "Student Course Batch Report");
				
				InputStream reportStream = this.getClass().getResourceAsStream(TEMPLATE);
				
				JasperDesign jd = JRXmlLoader.load(reportStream);
				
				JasperReport jr = JasperCompileManager.compileReport(jd);	
			
				JasperPrint jasperPrint = JasperFillManager.fillReport(reportStream, parameters, beanColDataSource);
				
				OutputStream outputStream = new FileOutputStream(new File("report/student.pdf"));
				
				JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
				
			}catch (JRException e){
					e.printStackTrace();
			}catch (FileNotFoundException e){
					e.printStackTrace();
			}
		
		}
			
}
		




