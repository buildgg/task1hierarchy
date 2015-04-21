package hierarchy;

public class Turtle implements Pet {

	@Override
	public void eat() {
		System.out.println("Turtle.eat()");

	}

	@Override
	public void sleep() {
		System.out.println("Turtle.sleep() ");

	}

	@Override
	public void walk() {
		System.out.println("Turtle.walk() ");

	}

	@Override
	public void multiply() {
		System.out.println("Turtle.multiply() ");

	}
	
	public void inHouse() {
		System.out.println("Turtle.inHouse() ");

	}
	public void swim() {
		System.out.println("Turtle.Swim() ");
	}
	public String toString(){
		return "Turtle";
	}

}
