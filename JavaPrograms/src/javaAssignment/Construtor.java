package javaAssignment;

import java.util.Scanner;

public class Construtor {

	
		String fruitname;
		double fruitPrize;
        String fruitColor;
        double fruitWeight;
        
        Construtor(String fruitname,double fruitPrize,String fruitColor,double fruitWeight)
        {
        	this.fruitname=fruitname;
        	this.fruitPrize=fruitPrize;
        	this.fruitColor=fruitColor;
        	this.fruitWeight=fruitWeight;
    
        }
       public void fruitdetails()
       {
    	   System.out.println("fruitname:"+fruitname);
    	   System.out.println("fruitPrize:"+fruitPrize);
    	   System.out.println("fruitcolor:"+fruitColor);
    	   System.out.println("fruitWeight:"+fruitWeight);
    	   
       }
       public static void main (String [] args)
       {
    	   Scanner sc=new Scanner(System.in);
    	   
    	   System.out.println("Enter the fruitname:");
    	   String fname=sc.next();
    	   
    	   System.out.println("Enter the fruitPrize:");
    	   Double fPrize=sc.nextDouble();
    	   
    	   System.out.println("Enter the fruitcolor:");
    	   String fcolor=sc.next();
    	   
    	   System.out.println("Enter the fruitWeight:");
    	   Double fWeight=sc.nextDouble();
    	   
    	   Construtor f1=new Construtor(fname,fPrize,fcolor,fWeight);
    	   f1.fruitdetails();
    	   

    	   
    	   System.out.println("Enter the fruitname:");
    	   String fname2=sc.next();
    	   
    	   System.out.println("Enter the fruitPrize:");
    	   Double fPrize2=sc.nextDouble();
    	   
    	   System.out.println("Enter the fruitcolor:");
    	   String fcolor2=sc.next();
    	   
    	   System.out.println("Enter the fruitWeight:");
    	   Double fWeight2=sc.nextDouble();
    	   
    	   Construtor f2=new Construtor(fname2,fPrize2,fcolor2,fWeight2);
    	   f2.fruitdetails();
	}

}
