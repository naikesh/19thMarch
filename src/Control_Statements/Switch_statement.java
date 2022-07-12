package Control_Statements;

public class Switch_statement {

	public static void main(String[] args) {
		char grade= 'C';
		
		switch(grade) {
		case 'A' :System.out.println("You got 70%");
		break;
		case 'B' : System.out.println("you got 60%");
		break;
		case 'C': System.out.println("you got 50%");
		break;
		case 'D':System.out.println("you got 40%");
		break;
		default:System.out.println("Please enter characters from A-D");
		break;
		}
		
		
		String month= "june";
		
		switch(month) {
		case "jan": System.out.println("this is 1st month of the year");
		break;
		case "feb":System.out.println("this is 2nd month of the year");
		break;
		case "march":System.out.println("this is 3rd month of the year");
		break;
		case "april":System.out.println("this is 4th month of the year");
		break;
		case "may":System.out.println("this is 5th month of the year");
		break;
		case"june":System.out.println("this is 6th month of the year");
		break;
		case "july":System.out.println("this is 7th month of the year");
		break;
		case "augast":System.out.println("this is 8th month of the year");
		break;
		case "sept":System.out.println("this is 9th month of the year");
		break;
		case "oct":System.out.println("this is 10th month of the year");
		break;
		case "nov":System.out.println("this is 11th month of the year");
		break;
		case"dec":System.out.println("this is 12th month of the year");
		break;
		default:System.out.println("please enter month-name");
		break;
		
		
		
		
		
		}
		
       
		
				
	}

}
