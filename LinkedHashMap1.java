import java.util.*;
import java.util.Map.Entry;

public class LinkedHashMap1 {
	 
	 public static void main(String args[]){  
	   
	  LinkedHashMap<Integer, String> hm=new LinkedHashMap();  
	  
	  hm.put(100,"jee");  
	  hm.put(110,"san");  
	  hm.put(102,"dar");  
	System.out.println(hm); 
	Set<Entry<Integer,String>> set=hm.entrySet();
	for(Entry<Integer,String> entry:set) {
	System.out.println(entry);
	}

	 }  
	}

