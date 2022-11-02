package com.AQ.project.Groceryshop.DAO;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import com.AQ.project.Groceryshop.DTO.ManufacturercompanyDTO;
import com.AQ.project.Groceryshop.DTO.ProductDTO;

public class GroceryShopDAO {
	
	LinkedList<ProductDTO> list = new LinkedList<ProductDTO>();
    public String addproduct(ProductDTO dto) {
    	
	   list.add(dto);
	    return dto.getDto()+"data saved";
		
		
	}
       public String removeProctByCompanyName(String nameOfproduct,String companyname) {
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
   }
     
     
    public HashSet  getAllProductBynameofpruduct(String nameOfproduct) {
    	HashSet set= new HashSet();
    	for(ProductDTO product :list) {
    		if(product.getNameOfproduct().equals(nameOfproduct)) {
    		 set.add(product);
    		}
    	}
		return set;
    	
    }
    
    
    public TreeSet  getAllProductByCompanyName(String companyname) {
    	TreeSet products = new TreeSet();
    	for( ProductDTO product :list) {
    		if(product.getDto().getCompanyname().equals(companyname)) {
    			products.add(product);
    		}
    	}
		return products;
    	
    }
    
    public void showAllProdut() {
    	for(ProductDTO h : list) {
        	System.out.println(h);	
        		
        		}
        	}
    	
    public int totalNumberOfProduct() {
    	return list.size();
          
        		
       }
    
    public List getAllVegProduct() {
    	List products = new LinkedList();
    	for( ProductDTO product :list) {
    		if(product.isIsveg()) {
    			products.add(product);
    		}
    	}
       return products;
    	
    }
	
        	}
    	
    


