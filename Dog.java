package hierarchy;

public class Dog implements Pet {
	@Override
	public void eat() {
		System.out.println("Dog.eat()");

	}

	@Override
	public void sleep() {
		System.out.println("Dog.sleep() ");

	}

	@Override
	public void walk() {
		System.out.println("Dog.walk() ");

	}

	@Override
	public void multiply() {
		System.out.println("Dog.multiply() ");

	}

	public void growl() {
		System.out.println("Dog.growl() ");

	}

	public void bark() {
		System.out.println("Dog.bark() ");

	}
	public String toString(){
		return "Dog";
	}

}
