package interfacestudy;

public class Son implements Father, Mother
{

	public static void main(String[] args) {
		Son s = new Son();
		s.care();
		s.love();
		s.nature();
		s.recceipe();
		s.money();
		Father.test();//calling static method from father interface
		Mother.test();//calling static method from mother interface
	

	}

	@Override
	public void recceipe() {
		System.out.println("mothers receipe completed in sons class");
		
		
	}

	@Override
	public void care() {
		System.out.println("mothers care completed in sons class");
		
	}

	@Override
	public void love() {
		System.out.println("Fathers love completed in sons class");
		
	}

	@Override
	public void nature() {
		
		System.out.println("fathers nature completed in sons class");
		
	}

	@Override
	public void money() {
		System.out.println("sons money");
		Father.super.money();//super keyword is used to resolve calling issue
		Mother.super.money();
		
	}

}
