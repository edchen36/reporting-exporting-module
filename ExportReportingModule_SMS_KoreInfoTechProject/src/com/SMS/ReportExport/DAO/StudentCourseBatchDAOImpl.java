package com.SMS.ReportExport.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.SMS.ReportExport.entities.StudentCourseBatch;
import com.SMS.ReportExport.utils.HibernateUtilities;

public class StudentCourseBatchDAOImpl implements StudentCourseBatchDAO {

	@Override
	public void addStudentCourse(StudentCourseBatch sc) {
		Session session = HibernateUtilities.openSession();
		Transaction tx = session.beginTransaction();
		/*  to create transaction (save-point) for save/update of session and then once commit, 
		 *  that data is save permanently or if roll back then undo 
		 */
//		for (int i=0;i<sc.size();i++){
//			session.saveOrUpdate(sc);
//			
//		}
		session.saveOrUpdate(sc);
		tx.commit();
		HibernateUtilities.closeSession(session);

	}

	@Override
	public List<StudentCourseBatch> ListStudent() {
		Session session = HibernateUtilities.openSession();
		Query query = session.createQuery("from StudentCourseBatch");
		ArrayList<StudentCourseBatch> allStudents= (ArrayList<StudentCourseBatch>)query.list();
		HibernateUtilities.closeSession(session);
		
		return allStudents;
	}

	@Override
	public StudentCourseBatch getStudent(String courseName) {
		Session session = HibernateUtilities.openSession();
		StudentCourseBatch student= (StudentCourseBatch)session.get(StudentCourseBatch.class, courseName);
		HibernateUtilities.closeSession(session);
		return student;
	}

	@Override
	public List<StudentCourseBatch> listStudentwithCourseStatus(String courseStatus) {
		Session session = HibernateUtilities.openSession();
		Criteria cr = session.createCriteria(StudentCourseBatch.class);
		cr.add(Restrictions.eq("course_status", courseStatus));
		ArrayList<StudentCourseBatch> stu = (ArrayList<StudentCourseBatch>) cr.list();
		HibernateUtilities.closeSession(session);
		return stu;
	}

	@Override
	public List<StudentCourseBatch> listStudentwithBatchNo(String batchNo) {
		Session session = HibernateUtilities.openSession();
		Criteria cr = session.createCriteria(StudentCourseBatch.class);
		cr.add(Restrictions.eq("batch_no", batchNo));
		ArrayList<StudentCourseBatch> stu = (ArrayList<StudentCourseBatch>) cr.list();
		HibernateUtilities.closeSession(session);
		return stu;
	}

}
