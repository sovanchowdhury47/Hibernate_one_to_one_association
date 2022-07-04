package org.jspider.hibernateApp;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class Dao {
public static void main(String[] args) {
	Passport passport=new Passport();
	passport.setPassport_name("David Gayen");
	
	Person person=new Person();
	person.setPerson_name("David");
	person.setPassport(passport);
	
	Configuration conf=new Configuration();
	conf.configure();
	
	SessionFactory sef=conf.buildSessionFactory();
	Session ses=sef.openSession();
	Transaction tran=ses.beginTransaction();
	ses.save(person);
	tran.commit();
	ses.close();
}
}
