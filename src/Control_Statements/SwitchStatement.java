package Control_Statements;

public class SwitchStatement {

	public static void main(String[] args) {
		// year 1-->welcome to 1st yr engg
		//year 2-->welcome to 2nd yr engg
		//year 3-->welcome to 3rd yr engg
		//year 4-->welcome to 4th year engg
		//year default-->Please enter year between 1-4
		
		
		int year=1;
		
		switch (year) {
			case 1: System.out.println("welcome to 1st yr engg");
			break;
			case 2: System.out.println("welcome to 2nd yr engg");
			break;
			case 3: System.out.println("welcome to 3rd yr engg");
			break;
			case 4: System.out.println("welcome to 4th yr engg");
			break;
			default: System.out.println("please enter year in between 1-4");
			break;
		}
		
		
		String city = "ACC";
		
		switch(city) {
			
		case "PCC":System.out.println("welcome to pune cricket club");
		break;
		case "MCC":System.out.println("welcome to mumbai cricket club");
		break;
		case "ACC":System.out.println("welcome to ambajogai cricket club");
		break;
		default:System.out.println("Please enter registered cricket club");
		break;
		}
				
			

	}

}
