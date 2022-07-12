package methods;

public class Staticmethodstudy {

	public static void main(String[] args) {
		myMethod();//calling static regular method from same class
		sameClassMethod();//calling static regular method from same class
		Otherclass.differentClass();//calling static regular method from different/another class
		Otherclass.notSameClass();//calling static regular method from different/another class
	}
	

	

public static void myMethod() {
	
	System.out.println("HI THIS IS MYMETHOD");}
	
	public static void sameClassMethod() {
		System.out.println("hi this is sameclassmethod");
	}
}



