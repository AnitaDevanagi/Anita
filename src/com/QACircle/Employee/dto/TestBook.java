package com.QACircle.Employee.dto;
import com.QACircle.Employee.dao.BookDAO;

public class TestBook {
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
