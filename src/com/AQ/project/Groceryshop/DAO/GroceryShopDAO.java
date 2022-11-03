package com.AQ.project.Groceryshop.DAO;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import com.AQ.project.Groceryshop.DTO.ManufacturercompanyDTO;
import com.AQ.project.Groceryshop.DTO.ProductDTO;

public class GroceryShopDAO {
	
	LinkedList<ProductDTO> list = new LinkedList<ProductDTO>();
    public boolean addproduct(ProductDTO dto) {
    	try {
	     list.add(dto);
	    return true;
    	}catch(NullPointerException e) {
    		e.printStackTrace();
    		return false;
    	}
		
		
	}
       public String removeProctByCompanyName(String nameOfproduct,String companyname) {
    	  try {
    	  int count =0;
    	for(int i=0; i<list.size(); i++) {
    		ProductDTO pro = list.get(i); 
    		if(pro.getNameOfproduct().equals(nameOfproduct) && pro.getDto().getCompanyname().equals(companyname)) {
    			list.remove(pro);
    			count++;
    		}
         } 
    	if(count>0) {
    		return "product removed";
    	 }
    	else {
    		return "product is not available";
    	}
    	
    	  }catch(NullPointerException | ArrayIndexOutOfBoundsException e) {
    	      e.printStackTrace();
    	      return "product not found";
        }
       }
     
     
    public HashSet  getAllProductBynameofpruduct(String nameOfproduct) {
    	HashSet set= new HashSet();
    	try {
    	for(ProductDTO product :list) {
    		if(product.getNameOfproduct().equals(nameOfproduct)) {
    		 set.add(product);
    		}
    	  }
    	}catch(NullPointerException | IndexOutOfBoundsException e) {
    		e.printStackTrace();
    	  }
		return set;
     }
    
    
    public HashSet  getAllProductByCompanyName(String companyname) {
    	HashSet products = new HashSet();
    	try {
    	for( ProductDTO product :list) {
    		if(product.getDto().getCompanyname().equals(companyname)) {
    			products.add(product);
    		}
    	}
    	}catch(NullPointerException | IndexOutOfBoundsException e) {
    		e.printStackTrace();
    	}
    	
		return products;
    	
    }
    
   
    	
    public int totalNumberOfProduct() {
    	try {
    	return list.size();
    	}catch(IndexOutOfBoundsException e) {
    		e.printStackTrace();
    		return 0;
    	}
      }
    
    public List getAllVegProduct() {
    	List products = new LinkedList();
    	try {
    	for( ProductDTO product :list) {
    		if(product.isIsveg()) {
    			products.add(product);
    		}
    	}
    	}catch(NullPointerException | IndexOutOfBoundsException e) {
    		e.printStackTrace();
    	}
       return products;
     }
    
    
    public LinkedList getAllNonVegProduct() {
        LinkedList products = new LinkedList();
    	try {
    	for( ProductDTO product :list) {
    		if(product.isIsveg()) {
    			products.add(product);
    		}
    	  }
    	}catch(NullPointerException |IndexOutOfBoundsException e) {
    		e.printStackTrace();
    	   }
    	  return products;
      }
    
    
      
     public void showAllProduct() {
    	try {
    	for(ProductDTO h : list) {
        	System.out.println(h);	
        		
        		}
        	}catch(NullPointerException | IndexOutOfBoundsException e) {
        		e.printStackTrace();
        	    System.out.println("Product not found");
        	}
    }
     
} 

	
  	
    


