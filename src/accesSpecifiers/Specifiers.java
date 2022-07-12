package accesSpecifiers;

public class Specifiers {

	public static void main(String[] args) {
		
		Specifiers sp= new Specifiers();
		
		sp.test1();//caling private method
		sp.test2();//calling default method
		sp.test3();//calling protected method
		sp.test4();//calling public method
		
		

	}

	private void test1()//only within the class.It cant be acces from other classes.
	{
		System.out.println("hi this is private test 1 method");
	}
	
	void test2()//remains only within the package
	{
		System.out.println("hi this is default test 2 method");
	}
	protected void test3()//remains only within the package,can be acces by outside package by inheritance
	{
		System.out.println("hi this is protected test3 method");
	}
	public void test4()//remains throuout the project
	{
		System.out.println("hi this is public test4 method");
	}
}
