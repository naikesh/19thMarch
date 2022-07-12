package inheritance;

public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Grandmother gm= new Grandmother();
		gm.receipe(); //calling own property
		
		Mother m = new Mother();
		m.receipe();//calling superclass method using sub class object
		m.nature();//calling own property
		Mother.care();//calling own static method
		
		Child c= new Child();
		c.receipe();//calling supermost class properties using childs object
		c.nature();//calling superclass properties using childs object
		c.mobile();//calling own property
		
		Child.stories();//calling supermost class properties using childs classname
		Child.care();//calling superclass properties using childs classname
		Child.laptop();//calling own property

	}

}
