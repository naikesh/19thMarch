package arrays;

public class CharArray {

	public static void main(String[] args) {
		// array declaration
		char grade[]= new char[5];
		
		//assign value
		grade[0]= 'A';
		grade[1]= 'B';
		grade[2]= 'c';
		grade[3]= 'd';
		grade[4]= 'E';
		
		//usage
		for (int i=0; i<=4; i++) {
			System.out.println(grade[i]);
		}
		System.out.println("=====================");
		
		for(int i=0; i<=grade.length-1; i++) {
			System.out.println(grade[i]);
		}
		System.out.println("======================");
		
		for(int i=grade.length-1; i>=0; i--) {
			System.out.println(grade[i]);
		}
		System.out.println("========================");

	}

}
