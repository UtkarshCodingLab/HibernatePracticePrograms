package com.hibernateconfiguration.javabased;

import java.util.Date;

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
        SessionFactory factory  = HibernateUtil.getSessionFactory();
        
        /*
        Student student = new Student();
        student.setRoll_number(21);
        student.setName("Krishna");
        student.setEmail("krishna@vrindavan.com");
        student.setAddress("Vrindavan");
        
        Session session = factory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        session.save(student);
        
        transaction.commit();
        
        session.close();
        */
        
        /*
        Employee employee = new Employee();
        employee.setEmp_id(99);
        employee.setName("Sachin");
        employee.setJoiningDate(new Date(24, 4, 1998));
        employee.setEmail("sachin@gmail.com");
        employee.setSalary(24000.00);
        employee.setStatus(false);
        employee.setToken("2343ef5fdfs");
        
        Session session = factory.openSession();
        
        Transaction secondTransaction =  session.beginTransaction();
        
        session.save(employee);
        
        secondTransaction.commit();
        
        session.close();
        */
        
        Session session = factory.openSession();
        
        Employee emp = session.get(Employee.class, 1);
        
        System.out.println(emp);
        
        
    }
}
