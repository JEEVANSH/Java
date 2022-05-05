import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCopyofArrayList {
		static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		
		public static void main(String[] args) {
			
			list.add("jee");
			list.add("raj");
			list.add("gani");
			list.add("manu");
			
			Iterator<String> itr = list.iterator();
			while(itr.hasNext()) {
				String name = (String) itr.next();	
				if(name.equals("manu")) {
					itr.remove();
				}
				}
			System.out.println(list);
			

		}
}
