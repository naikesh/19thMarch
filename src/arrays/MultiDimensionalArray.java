package arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		int a [][]= new int[2][2];   //initialization
		
		a[0][0]=1;  //declaration
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;   
		
		System.out.print(a[0][0]+" ");
		System.out.println(a[0][1]);
		System.out.print(a[1][0]+" ");
		System.out.println(a[1][1]);
		
		System.out.println("====================");

	
	
	for(int i=0; i<=a.length-1;i++) //0,1,2 row
	{   
		for(int j=0;j<=a.length-1;j++) //0,1,2 column 
		{
			System.out.print(a[i][j]+" ");
		}
		
		System.out.println();
	}

	}}
