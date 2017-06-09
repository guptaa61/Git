package Test;

public class testConstructor {
	
	public testConstructor() {
		
		int a =10;
		int b=20;
		int c = a+b;
		System.out.println("Addition is:" +c);
		System.out.println("Constructor is running");
	}
	public int add(int a , int b)
	{
		
		return a+b;
		
	}
	public int substract(int a , int b)
	{
		
		return a-b;
		
	}
	public int Multiply(int a , int b)
	{
		
		return a*b;
		
	}
	public int Divide(int a , int b)
	{
		
		return a/b;
	}
	
	static{
		System.out.println("I am a rock star");
		
	}
	
	{
		System.out.println("how many time i shoukd tell u i am a rockstar");
	}
}

