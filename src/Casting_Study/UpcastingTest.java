package Casting_Study;

public class UpcastingTest {

	public static void main(String[] args) {
		Son s= new Son();
		s.bike();
		s.car();
		s.Degree();
		
		Father f= new Son(); //creating object of subclass and giving superclass reference
		
		f.bike(); //eligible for casting
		f.car();//eligible for casting
		//f.Degree();   not eligible for casting as its not common/ superclass method

	}

}
