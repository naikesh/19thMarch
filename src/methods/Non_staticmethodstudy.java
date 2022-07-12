package methods;

public class Non_staticmethodstudy {

	public static void main(String[] args) {
		//classname objectname= new classname();
		//to call nonstatic method --> objectname.methodname();
		
		
		Non_staticmethodstudy object= new Non_staticmethodstudy();//creating object to same class
		object.nonStatic();//calling non static method from same class using object
		
		OthernonstaticClass other= new OthernonstaticClass();//creating object to other/different class
		other.otherClass();//calling non static method from different class using object
		
		other.secondClass();//calling non static method from different class using object

	}
	
	public void nonStatic() {
		
		System.out.println("hi this is nonststic method");
	}
	

}
