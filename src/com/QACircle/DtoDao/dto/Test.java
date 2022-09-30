package com.QACircle.DtoDao.dto;
import com.QACircle.DtoDao.dao.EmployeeDAO;

public class Test {
	public static void main(String [] args) {
		
		ProgrammerDTO programmer = new ProgrammerDTO();
	     programmer.setName("Ankita");
	     programmer.setSalary(80000);
	     programmer.setCompanyname("Infosys");
	     programmer.setLocation("Banglore");
	     
	     
	     
	     EmployeeDAO programmer1=new EmployeeDAO ();
	     programmer1.save(programmer);
	     String name1 = programmer1.deleteByCompanyname("Infosys");
	     System.out.println(name1);
	}

}
