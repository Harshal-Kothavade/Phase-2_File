package com;
import java.io.File;
import java.util.*;
public class OuterFunction extends InnerFunction {
	 String filename;
	 
	    String n;

		static String ch;
	    static Scanner sc = new Scanner(System.in);
	    static boolean c = true;
        
		
		static void display()
		{
		    File f = null;
		    String[] paths;
		    System.out.println("Files in Asceding Order : ");     
		    try {    
		    
		       f = new File("D:/INFOSTRETCH/Project FSD/Phase 2/directory for files");
		        
		       paths = f.list();
		       
		       for(String path:paths) {
		        System.out.println(path);
		       }
		       
		    } catch(Exception e) {
		          e.printStackTrace();
		    }
		}
		  static void operation()
		     {
			 
		        while(c==true){
		            if(c==true){
		                
		        System.out.println(" a. Add file \n d. Delete file \n s. Search file \n e. exit");
		      System.out.print("enter the action no. to be performed\n");
		      ch=sc.next();

		      switch(ch)
		      {
		        
		      case "a" :
		          create();
		          break;
		      
		      case "d":
		          delete();
		          break;
		      case "s":
		          search();
		          break;
		      case "e":
		    	  exit();
		            c=false;
		            break;
		            
		      case "A" :
		          create();
		          break;
		      
		      case "D":
		          delete();
		          break;
		      case "S":
		          search();
		          break;
		      case "E":
		    	  exit();
		            c=false;
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
