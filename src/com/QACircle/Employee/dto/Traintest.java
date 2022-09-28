package com.QACircle.Employee.dto;
import  com.QACircle.Employee.dao.TrainDAO;

public class Traintest {

      public static void main(String [] args) {
    	  MumbaiExpressDTO mumbai = new MumbaiExpressDTO();
    	  mumbai.setName("Mumbai Express");
    	  mumbai.setCompartments((byte)10);
    	  mumbai.setIshavingACcoach(false);
    	  mumbai.setStartfrom("Munbai");
    	  
    	  
    	  TrainDAO s= new TrainDAO();
    	  s.save(mumbai);
    	   String result = s.deleteByStartfrom("Munbai");
    	   System.out.println(result);
    	  
    	  
      }
}
