import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Student x = new Student();
		x.setA(10);
		Student z = update(x);
		System.out.println(x.getA());
		
	}
	
	private static Student update(Student x) {
		Student y = x;
		y.setA(11);
		return y;
	}
	

}
