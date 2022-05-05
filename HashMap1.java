import java.util.*;
public class HashMap1 {
	  
	 public static void main(String args[]){ 
		 
	Map<Integer,String> m=new HashMap();    
	  m.put(11,"Mango");
	  m.put(10,"areca");
	   m.put(null,"Apple");    
	  m.put(12,"Banana");   
	  m.put(4,"Grapes");
	  m.put(123, "null");
	  m.put(300, "asdfghjk");
	  m.put(4,"Graps");
	       
	  System.out.println(m);
	  System.out.println(m.containsKey(4));
	  System.out.println(m.containsValue("Rohit"));
	  System.out.println(m.get(8));
	  System.out.println(m.size());
	 }}