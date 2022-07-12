package inheritance;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Father f = new Father();
		Son s = new Son();
		Daughter d = new Daughter();
		
		f.emotions();
		
		s.emotions();
		s.bike();
		
		d.emotions();
		d.scooty();
	}

}
