package interfacestudy;

public interface Mother {
	void recceipe();
	void care();
	
	//multiple inheritance using interface
	default void money() {
		System.out.println("mothers money");
	}
	
	static void test() {
		System.out.println("mothers test");
	}

}
