package arrays;

public class IntArray {

	public static void main(String[] args) {
		int rollnum[]= new int [5];
		
		rollnum [0]= 101;
		rollnum [1]= 102;
		rollnum [2]= 103;
		rollnum [3]= 104;
		rollnum [4]= 105;
		
		for(int i=0; i<=rollnum.length-1; i++) {
			System.out.println(rollnum[i]);
		}
		
		System.out.println("==================");
		
		for(int i=rollnum.length-1; i>=0; i--) {
         System.out.println(rollnum[i]);}}}


