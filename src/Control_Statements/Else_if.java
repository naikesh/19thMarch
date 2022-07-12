package Control_Statements;

public class Else_if {

	public static void main(String[] args) {
		//if marks >=66--->you are in dist
		//if marks>=60<66--->you are in 1st class
		//if marks>=50<60-->you are in 2nd class
		//if marks>=40<50-->you are just pass
		//else-->you are fail
		
		int marks=65;
		if(marks>=66)
		{
			System.out.println("you are in dist");
		}
		else if(marks>=60 & marks<66) {
			System.out.println("you are in 1st class");
		}
		else if(marks>=50 & marks<60) {
			System.out.println("you are in 2nd class");
		}
		else if(marks>=40 & marks<50) {
			System.out.println("you are just pass");
		}
		else {
			System.out.println("you are fail");
		}
		
		
		String city= "Delhi";
		
		if(city== "Pune") {
			System.out.println("you are in Maharashtra");
		}
		else if(city== "Mumbai") {
			System.out.println("you are in Maharashtra");
		}
		else if (city==" Ambajogai") {
			System.out.println("you are in Maharashtra ");
		}	
			else {
				System.out.println("you are not in Maharashtra");
			}
		
		
		
	}
	

}
