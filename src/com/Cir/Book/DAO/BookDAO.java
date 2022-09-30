package com.Cir.Book.DAO;
import com.Cir.Book.DTO.ScienceDTO;



public class BookDAO {
	ScienceDTO[] science= new ScienceDTO[4];

	public void save(ScienceDTO book) {
		 science[0]=book;
		  
	}
	
	public short deleteByPrice(short price) {
		
       for (int i=0;i<science.length;i++) {
    	   if( science[i].getPrice().equals(price) ) {
    		  return  price;
    		   
    	   }
	  }
	    
}
	
}


