package tutorial;

public class Cat extends Dog {
	private int lives;

	public Cat(String name, int age, int lives) {
		super(name, age);
		this.lives = lives;
	}

	public void speak() {
		System.out.println("I am " + this.name + " and I am " + this.age + " years old" + " and i have " + this.lives + " left");
	}

}
