package com.hibernatecrudoperations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        
        Session session = factory.openSession();
        
        // Create operation
        
        /*
        Student student1 = new Student();
        student1.setName("Ram");
        student1.setAddress("Ayodhya");
        student1.setEmail("ram@ayodhya.com");
        
        Student student2 = new Student();
        student2.setName("Shiva");
        student2.setAddress("Mansarovar");
        student2.setEmail("shiva@mansarovae.com");
        
        Transaction transaction = session.beginTransaction();
        
        session.save(student1);
        session.save(student2);
        
        transaction.commit();
        
        */
        
        // Read operation (printing the values)
        
        /*
        
        List<Student> studentList = session.createQuery("from Student", Student.class).list();
        for(Student i: studentList)
        {
        	System.out.println(i);
        }
        
        */
        
        // Update operation
        
        /*
        Student student = session.get(Student.class, 2);
        student.setAddress("Himalaya");
        student.setEmail("shiva@himalaya.com");
        
        Transaction transaction = session.beginTransaction();
        
        session.saveOrUpdate(student);
        
        transaction.commit();
        
        */
        
        /*
        Student student3 = new Student();
        student3.setName("Raavan");
        student3.setAddress("Lanka");
        student3.setEmail("raavan@lanka.com");
        
        Transaction transaction = session.beginTransaction();
        
        session.save(student3);
        
        transaction.commit();
        */
        
        // Delete operation
        
        /*
        Student deletestudent = session.get(Student.class,3);
        
        Transaction transaction = session.beginTransaction();
        
        session.delete(deletestudent);
        
        transaction.commit();
        
        */
        
        session.close();
        
        factory.close();
        
    }
}
