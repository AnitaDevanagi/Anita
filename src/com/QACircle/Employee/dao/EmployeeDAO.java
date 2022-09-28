package com.QACircle.Employee.dao;
import com.QACircle.Employee.dto.ProgrammerDTO;

public class EmployeeDAO {
	
	private  ProgrammerDTO[] name = new ProgrammerDTO[7];
	 
	 public void save(ProgrammerDTO programmer) {
		 name[0]=programmer;
	 }
	 
	 public void save2(ProgrammerDTO programmer3) {
		 name[1]=programmer3;
	 }
		 
		 
		 public String deleteByCompanyname (String companyname) {
			   for ( int i=0;i<name.length;i++) {
				   if (name[0]!=null && name[i].getCompanyname().equals(companyname)) {
					    name[i]=null;
					    return "Deleted" + companyname;
				   }
			   }
			   
			   return "companyname"+companyname+"not present";
		 }
		 
	 }


