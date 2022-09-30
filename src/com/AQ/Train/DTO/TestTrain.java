package com.AQ.Train.DTO;
import com.AQ.Train.DAO.TrainDAO;


public class TestTrain {
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



