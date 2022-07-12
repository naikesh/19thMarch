package inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		// to call mothers nonstatic property i need mothers object
		
		Mother M= new Mother();//created object of mother class
		
		//to call childs nonstatic property i need childs object
		
		Child C= new Child();//created object of childs class
		
		M.nature();//calling mothers  property
		Mother.care();//calling mothers property
		
		C.mobile();
		Child.laptop();
		
		C.nature();//by using childs object we are calling mothers properties
		Child.care();//by using childs classname calling mothers static property
		Child.laptop();
	}

}
