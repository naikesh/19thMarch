package instructor;

public class UserDefinedConstructor {

	
	public UserDefinedConstructor() { //user defined without/zero parameter constructor
		System.out.println("hi this is user defined constructor example");
		int a= 60;
		int b= 40;
		System.out.println("addition is "+ (a+b));
		System.out.println("sub is "+ (a-b));
	} 
	
	
	public static void main(String[] args) {
		UserDefinedConstructor UDC = new UserDefinedConstructor();//created object of a class
        UDC.test();
	}
	
	public void test() {
		System.out.println("hi this is just example of nonstatic method");
	}

}
