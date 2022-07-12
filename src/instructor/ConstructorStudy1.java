package instructor;

public class ConstructorStudy1 {
	
	int a;
	int b;
	
	public ConstructorStudy1() {
		a= 100;
		b= 100;		
	}
	
	public ConstructorStudy1(int x) //user defined constructor with single parameter 
	{  a=x; }
	
	public ConstructorStudy1(int x, int y)//user defined constructor with two parameter
	{ a=x;
	  b=y;}
	
	
	public static void main(String[] args) {
		ConstructorStudy1 CS1 = new ConstructorStudy1();//created object using zero parameter constructor
		CS1.add();
		ConstructorStudy1 CS2 = new ConstructorStudy1(900);//created object using single parameter constructor
		CS2.add();
		ConstructorStudy1 CS3 = new ConstructorStudy1(90,80);//created object using two parameter constructor
		CS3.add();
	}
		
		public void add() {
			int sum= a+b;
					System.out.println("addition is "+ sum);
		}
		
		

	

}
