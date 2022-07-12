package abstractStudy;

public class ConcreteStudy extends AbstractStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcreteStudy cc= new ConcreteStudy();
		cc.test();
		cc.test1();
		cc.test3();
		cc.sample();

	}

	@Override
	public void test() {
		System.out.println("this method is completed in concrete class");
		
	}
	
	public void sample() {
		System.out.println("this is own method of concrete class");
	}

}
