package Variable_Types;

public class Globalvariable {
	int a= 20; //global non static variable
	static int b= 100; //global static variable
	
	

	public static void main(String[] args) {
		
	    Globalvariable GV = new Globalvariable();//created object
	    GV.test(); //calling nonstatic method
	    test1(); //calling static method
	    
	    System.out.println("value of a is "+ GV.a);//calling nonstatic global variable
		                                           //objectname.nonstaticGlobalVariable
	   
	    System.out.println("value of b is "+ b);//calling static global variable from same class-->variablename
	    
	    
	    //Now call to nonstatic global variable from another class
	    Sample s = new Sample(); //created object of another class
	    System.out.println("global nonstatic variable from another class is "+ s.p);
	    
	    //call to static global variable from another class
	    System.out.println("global static variable from another class is "+ Sample.q);
	    
	    int sub= 1000- GV.a;//using nonstatic global variable from same class
        int sub1= 1000-b;//using static variable from same class
        
        int sub2= 1000- s.p; //using nonstatic global variablefrom another class
        int sub3= 1000- Sample.q;//using static global variable from another class
        
        System.out.println(sub);
        System.out.println(sub1);
        System.out.println(sub2);
        System.out.println(sub3);
	}
	
	public void test() //nonstatic method
	{        
		int a= 890;  //local variable
	    int sum= a+10; //we can call non static global variable
	    int sub= b-10; //we can call static global variable
		
	}
	 
	public static void test1() //static method
	{
		//int sum= a+10 //we cant call  nonstatic global variable
		int sub = b-10; //we can call static global variable
	}

}
