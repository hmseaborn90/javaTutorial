package tutorial;

public interface Vehicle {
	
	final int gear = 5;
	
	void speedUp(int a);
	void slowDown(int a);
	void changeGear(int a);
	
	default void out() {
		System.out.println("default method");
	}
	
	static int math(int b) {
		return b + 9;
	}
}
