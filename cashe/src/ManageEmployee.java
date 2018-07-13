/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 
import org.hibernate.HibernateException; 
import org.hibernate.Transaction;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.ProjectionList;

public class ManageEmployee {
   private static SessionFactory factory; 
   public static void main(String[] args) {
      try{
         factory = new Configuration().configure().buildSessionFactory();
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      ManageEmployee ME = new ManageEmployee();

      /* List down all the employees */
      ME.listEmployees();
      System.out.println("-------------------");
      //ME.list();

   }
   
    /* Method to  READ all the employees */
   public void listEmployees( ){
      Session session = factory.openSession();
      Transaction tx = null;
      try{

session.beginTransaction();
 
Session sessionTemp = factory.openSession();
sessionTemp.beginTransaction();
try
{
    //fetch the department entity from database first time
    Employee department = (Employee) session.load(Employee.class, new Integer(1));
    System.out.println(department.getFirstName());
     
    //fetch the department entity again
    department = (Employee) session.load(Employee.class, new Integer(1));
    System.out.println(department.getFirstName());
     
    //object will be retrieved from the db, as Level1 Cache is different for session and sessionTemp
    department = (Employee) sessionTemp.load(Employee.class, new Integer(1));
    System.out.println(department.getFirstName());
}
finally
{
    session.getTransaction().commit();
     
    sessionTemp.getTransaction().commit();
}
      }catch (HibernateException e) {
   }
   }

   public void list()
   {
       //Open the hibernate session
Session session = factory.openSession();
session.beginTransaction();
try
{
    //fetch the department entity from database first time
    Employee department = (Employee) session.load(Employee.class, new Integer(1));
    System.out.println(department.getFirstName());
     
    //fetch the department entity again
    department = (Employee) session.load(Employee.class, new Integer(1));
    System.out.println(department.getFirstName());
     
    session.evict(department); //to remove specific object from session cache
    //session.clear();//to remove all objects from session cache
     
    department = (Employee) session.load(Employee.class, new Integer(1));
    System.out.println(department.getFirstName());
}
finally
{
    session.getTransaction().commit();
}
   }
   
}
