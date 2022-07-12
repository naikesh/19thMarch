package interfacestudy;

public class MyClass implements Myinterface {

	public static void main(String[] args) {
		
		MyClass m = new MyClass(); //created object of implementation class
		m.test();
		m.test1();
		m.mymethod();
		//a= a+10; we cant update variables from interface
		System.out.println("valu of a is "+ a);
		
		

	}

	@Override
	public void test() {
	  System.out.println("hi this method is completed in implementation class");
		
		
	}

	@Override
	public void test1() {
		System.out.println("hi this method is completed in implementation class");
		
	}
	
	public void mymethod() {
		System.out.println("this is MyClass method");
	}

}
