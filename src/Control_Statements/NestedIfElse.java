package Control_Statements;

public class NestedIfElse {

	public static void main(String[] args) {
		  //if username is correct--->Enter password
//   {   
		  //if-->password is correct--->login success
		  //else-->enter correct password
//   }
		  //else-->enter correct username
		
		
		String UN = "velocity";
		String Password = "velocity123";

		if(UN== "velocity")
		{
		System.out.println("please enter Password");	
		
		if (Password== "velocity123") {
			System.out.println("Login success");
		}
		else {
			System.out.println("Password is incorrect");
		}
		}	
		
		else {
			System.out.println("please enter correct username");
		}
		
		String Mothertongue= "Indian";
		String Country= "India";
		
		if (Mothertongue== "Indian") {
			System.out.println("you are from India");
			
			if(Country=="India") {
			System.out.println("you are Indian");	
			}
			else {System.out.println("you are not Indian");}
		}
		
		else {System.out.println("You are from another country");}
		
	}

}
