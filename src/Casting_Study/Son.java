package Casting_Study;

public class Son extends Father {
	
	public void car() //overriding
	
	{
		System.out.println("honda civic");
	}
	
	public void bike ()  //overriding
	{
		System.out.println("jawa");
	}
	
	public void Degree() //new method of son--->not supported for casting
	{
		System.out.println("BE");
	}

}
