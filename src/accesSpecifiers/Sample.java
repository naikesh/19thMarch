package accesSpecifiers;

public class Sample {

	public static void main(String[] args) {
		
		Specifiers s= new Specifiers();//created object of another class
		
	//	s.test1; we cant call private method outside of class
		s.test2();//calling default method
		s.test3();//calling protected method
		s.test4();//calling public method

	}

}
