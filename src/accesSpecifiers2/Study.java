package accesSpecifiers2;

import accesSpecifiers.Specifiers;

public class Study extends Specifiers {

	public static void main(String[] args) {
		
		Specifiers spec= new Specifiers();//created object of another class
		
		spec.test4();//calling public method
	//	spec.test3();
		
		Study st= new Study();//created object of a child class
		st.test3();//calling protected method from another package
		
		st.test4();//calling public method from another package

	}

}
