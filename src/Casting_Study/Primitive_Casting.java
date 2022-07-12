package Casting_Study;

public class Primitive_Casting {

	public static void main(String[] args) {
		
		int a= 10;//lower data type information
		System.out.println(a);
		
		double b = a; //converted to higher type info---implicite casting or widening casting
		System.out.println(b);
		
		
		
		double z= 10.5; //higher data type
		System.out.println(z);
		
		int y= (int)z; //converted to lower type information----explicite casting or narrowing casting
		System.out.println(y);
	}

}
