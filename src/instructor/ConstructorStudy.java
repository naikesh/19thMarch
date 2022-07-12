package instructor;

public class ConstructorStudy {
	
	int a;
	int b;  //variable declaration (global)

	public ConstructorStudy() {//user defined zero parameter constructor study
		a = 100;
		b= 50;
		
		System.out.println("constructor is used to copy/load non-static members of a class into object,when we create object of a class");
		System.out.println("constructor is used to initialize data member/variable");
	}
	
	public static void main(String[] args) {
		ConstructorStudy CST = new ConstructorStudy();//constructor is called when object of a class created
		CST.add();
		CST.sub();
	}
	
	public void add() {
		System.out.println("addition is "+ (a+b));
	}
	
	public void sub() {
		System.out.println("substraction is "+ (a-b));
	}
	

}
