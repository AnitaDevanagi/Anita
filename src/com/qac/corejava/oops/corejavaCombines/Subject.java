package com.qac.corejava.oops.corejavaCombines;

public class Subject {

	
     static short persubnoOfpages ;
     static boolean isNovel;
     static char lastsubname;
     byte noOfsubjects;
       long totalsubnopages ;
       double percentage;
    
     
       
       
       Subject( short persubnoOfpages,boolean isNovel,char lastsubname){
    	   this.persubnoOfpages=persubnoOfpages;
    	   this.isNovel=isNovel;
    	   this.lastsubname=lastsubname;
       }
       
       Subject( byte noOfsubjects, long totalsubnopages,double percentage){
    	   
    	   this.noOfsubjects=noOfsubjects;
    	   this.totalsubnopages=totalsubnopages;
    	   this.percentage=percentage;
    	   
       }
       
    
   
        
       public static void main(String[] args) {
    	   
    	   float cgpa=8.8f;
    	   int totalcost=6000;
    	   String firstSubname ="Kannada";
    	   String lastname="Hindi";
    	   System.out.println(cgpa);
    	   System.out.println(totalcost);
    	   System.out.println(firstSubname);
           System.out.println(lastname);
    	   
    	   Subject  result  = new  Subject((short)420,false,'H');
    	   System.out.println(Subject.persubnoOfpages);
    	   System.out.println(Subject.isNovel);
           System.out.println(Subject.lastsubname);
    	   
    	   Subject  result1  = new  Subject((byte)6,1678543l, 88.89d);
    	   System.out.println(result1.noOfsubjects);
    	   System.out.println(result1.totalsubnopages);
           System.out.println(result1.percentage);
           
          
          }
       
       
       
       
}
