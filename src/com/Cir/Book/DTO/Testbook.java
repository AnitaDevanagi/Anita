package com.Cir.Book.DTO;
import com.Cir.Book.DAO.BookDAO;

public class Testbook {
	public static void main(String[] args) {
		
	ScienceDTO book = new  ScienceDTO();
	book.setName("Science");
	book.setPrice((short)300);
	book.setNoOfpages((short)400);
	book.setVersion("7th");
	
	BookDAO book1 = new BookDAO();
	book1.save(book);
	short  print = book1.deleteByPrice(short(300));
	
	
	
	
	
	}
}



