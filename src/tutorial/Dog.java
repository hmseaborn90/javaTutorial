package tutorial;

public class Dog {
	
	protected String name;
	protected int age;
	protected static int count = 0;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		Dog.count += 1;
	}
	
	public static void display() {
		System.out.println("I am a dog");
	}
	public void speak() {
		System.out.println("I am " + this.name +" and I am " + this.age + " years old");
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int add2() {
		return this.age + 2;
	}
}
