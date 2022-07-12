package string_Study;

public class StringMethodUse {

	public static void main(String[] args) {
		
		String name= "Velocity";
		
		//length() method use
		System.out.println(name.length());
		
		int lengthofString= name.length();
		System.out.println(lengthofString);
		
		//toUpperCase()  method use
		System.out.println(name);
		System.out.println(name.toUpperCase());
		String m = name.toUpperCase();
		System.out.println(m);
		
		//toLowerCase() method use
		System.out.println(name.toLowerCase());
		System.out.println(m.toLowerCase());
        String n= m.toLowerCase();
        System.out.println(n);
        
        //equals() method use
        String a= "Velocity";
        String b= "Velocity";
        String c= new String("Velocity");
        String d=new String ("Velocity");
        String e= new String ("VELOCITY");
        //== compares memory locations of two operations
        //equals method compares character sequence of two objects
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println("=================");
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
        
        boolean result= a.equals(c);
        System.out.println("a and c are equal =="+result);
        System.out.println(d.equals(e)); //checking character sequence along with case sensitivity
        System.out.println("=============================");
        
        
        //equalsIgnoreCase() method use
        
        String city = "Pune";
        String locality= "Pune";
        String dist= "pune";
        
        System.out.println(city.equals(dist));
        System.out.println(city.equalsIgnoreCase(dist));
        System.out.println("==========================");
        
        //contains() method use
        String k = "Katraj";
        System.out.println(k.contains("Ka"));
        System.out.println(k.contains("ar"));
        System.out.println("=======================");
       
        //isEmpty() method use
        String p="Test";
        String q= " ";
        String r= null;
        String s ="";
        
        System.out.println(q.length());
       // System.out.println(r.length());
        
        System.out.println(p.isEmpty());
        System.out.println(q.isEmpty());
     //   System.out.println(r.isEmpty());
        System.out.println(s.isEmpty());
        
        System.out.println(q.isBlank());//difference between isEmpty and isBlank for q
        System.out.println(s.isBlank());
        System.out.println("===============================");
        
        //charAt method use
        
        String country = "India";
        System.out.println(country.charAt(0));
        char requiredchar = country.charAt(0);
        System.out.println(requiredchar);
      //  System.out.println(country.charAt(9)); StringIndexOutOfBoundsException
        
        
        
        
        
        
		
	}

}
