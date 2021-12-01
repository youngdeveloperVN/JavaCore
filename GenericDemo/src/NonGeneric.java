import java.util.ArrayList;
import java.util.List;

public class NonGeneric {
	
	public static void main(String[] args) {
		
		List list = new ArrayList<>();
		list.add(2);
		list.add("String");
		list.add(true);
		
		System.out.println(list);
		
		for (Object object : list) {
			if(object instanceof Integer) {
				
			}
			System.out.println(object);
		}
		
	}

}
