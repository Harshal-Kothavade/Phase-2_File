package com;
import java.util.*;
public class Loop extends OuterFunction {
	 String filename;
	 
	    static String n;

		String ch;
	    static Scanner sc = new Scanner(System.in);
	    static boolean b = true;
	    static void switch1()
	    {
	       
	        
	        while(b==true){
	            if(b==true){
	                
	            System.out.println(" 1. Show all files \n 2. perform operations on files \n 3. exit");

	        System.out.print("enter the action no. to be performed\n");
	          n=sc.next();
	        switch(n)
	        {
	          
	        case "1":
	            display();
	        break;
	        
	      case "2":
	      operation();
	        break;
	      case "3":
	            System.out.println("Thank you for Visiting");
	            b=false;
	        break;
	        
	      default:
	        System.out.println("plz select correct option");
	        break;
	        }
	    }
	    else{
	    break;
	    }
	        }
	    }

	   }
