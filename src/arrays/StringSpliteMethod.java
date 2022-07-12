package arrays;

public class StringSpliteMethod {

	public static void main(String[] args) {
		// I LOVE MY INDIA
		
		String s= "I LOVE MY INDIA";
		
		//System.out.println(s.split(" "));
		
		String ar[]=s.split(" ");
		//String ar[]={"I", "LOVE","MY","INDIA";}
		
	for(int i=0;i<=ar.length-1;i++) {
		System.out.println(ar[i]);
	}
	System.out.println("=========================================");
	
	
	
	String st= "THIS_IS_MY_COUNTRY";
	
	String hw[]=st.split("_");
	
	for(int i=0; i<=hw.length-1;i++) {
		System.out.println(hw[i]);
	}

	}

}
