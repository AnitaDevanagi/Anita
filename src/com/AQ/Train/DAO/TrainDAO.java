package com.AQ.Train.DAO;
import com.AQ.Train.DTO.MumbaiExpressDTO;

public class TrainDAO {
		
		 MumbaiExpressDTO [] mumbaiexpress = new  MumbaiExpressDTO[5];
		 
		 public void save(MumbaiExpressDTO mumbai ) {
			 mumbaiexpress[0]=mumbai; 
		 }
		 
		 public String deleteByStartfrom(String startfrom) {
			 for(int i=0; i<mumbaiexpress.length;i++) {
				 if (mumbaiexpress[0] != null &&  mumbaiexpress[i].getStartfrom().equals(startfrom)) {
					 mumbaiexpress=null;
					 return "Deleted"+startfrom;
				 }
			 }
			 return "compartments"+ startfrom+ "not present";
		 }

	}



