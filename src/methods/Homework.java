package methods;

public class Homework {

	public static void main(String[] args) {
		
		HW1();
		
		Homework ZF = new Homework();
		ZF.HW2();	
		
		Homework2.HW3();
		
		Homework2 ZFI = new Homework2();
		ZFI.HW4();
		
		ZFI.HW5("Naikesh", 123, 'A', 200.098d );
		ZFI.HW5("Abhijeet", 456, 'A', 400.890d);
		
		Homework2.HW6(10, 2);
		Homework2.HW6(60, 40);
		

	}

	public static void HW1() {
		
		System.out.println("HI THIS IS HW");
	}
	
	public void HW2() {
		System.out.println("hi this is hw");
	}
}
