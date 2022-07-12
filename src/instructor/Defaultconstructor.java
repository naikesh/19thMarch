package instructor;

public class Defaultconstructor {

	public static void main(String[] args) {
		Defaultconstructor DCS = new Defaultconstructor();
		DCS.dcstudy();
		DCS.extra();

	}
	
	public void dcstudy() {
		
		System.out.println("hi this is default constructor example");
		}
	public static void extra () {
		System.out.println("trying to call static method by using object of the class");
	}
	

}
