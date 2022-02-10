package com.mondee;
import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  

public class MainLogic {

	public static void main(String[] args) {
	    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.xml").build();  
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	    SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	    Session session = factory.openSession();  
	    Transaction t = session.beginTransaction();
	    
	
	    Student s1=new Student();    
	    
	     //Insert Query:
	    /* s1.setSid(4);    
	    s1.setSname("vijay");    
	    s1.setSmarks(900);  */
	 
	   //Select Query:
	    /*Student x = (Student)session.get(Student.class, 4);
	    System.out.println("Student Values:");
	    System.out.println("Get the Student Values  "+"SId-->  "+x.getSid()+"  Sname-->  "+x.getSname()+"  Smarks-->  "+x.getSmarks());
	    System.out.println("Student updated Values:"); */
	    
	    
        
       // Update Query:
	    /* s1 = (Student)session.get(Student.class, 4);
	    s1.setSname("vijay kumar");    
	    s1.setSmarks(750); 
	    session.update(s1); 
		System.out.println("Updated-"+s1.getSid()+" "+s1.getSname()+" "+s1.getSmarks()); */

	     //Delete Query:

	     s1 = (Student)session.get(Student.class, 0);
	      //System.out.println("Student deleted Values:"); 
		  session.delete(s1);
	     System.out.println("Deleted-"+s1.getSid()+" "+s1.getSname()+" "+s1.getSmarks());
	    session.save(s1);  
	    t.commit();  
		session.close();

	}

}
