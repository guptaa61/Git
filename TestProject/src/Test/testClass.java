package Test;

public class testClass extends testConstructor {

	public static void main(String[] args) {
	
		testConstructor t1= new testConstructor();
	
		int Addition =t1.add(20, 30);
		System.out.println(Addition);
		
		t1.Divide(20,3);
		System.out.println(t1.Divide(20,3));
		
		t1.substract(25, 52);
		System.out.println(t1.substract(25, 52));
		
		t1.Multiply(10, 3);
		System.out.println(t1.Multiply(10, 3));
		
		
		
		System.out.println("test");
		System.out.println("test");
	}

}
