import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollecction1 {
public static void main(String[] args) {
		
		ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<Integer,String>();
		map.put(0, "Basics");
		map.put(1, "Strong");
		map.put(0,"Tech");
	//	map.put(null,null);
		System.out.println(map);
		//map.remove(1);
		
		
		map.putIfAbsent(0,"Hello");
		System.out.println(map);
		
		
	
		map.remove(1,"Strong");
		System.out.println(map);
		
		map.replace(0, "Wrong", "Know");
		System.out.println(map);
		
		map.replace(0,"BasicsStrong");
		System.out.println(map);
		System.out.println(map.replace(3,"BasicsStrong"));

	}

}
