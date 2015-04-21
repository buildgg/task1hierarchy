package hierarchy;

public class Cat implements Pet {

	@Override
	public void eat() {
		System.out.println("Cat.eat()");

	}

	@Override
	public void sleep() {
		System.out.println("Cat.sleep() ");

	}

	@Override
	public void walk() {
		System.out.println("Cat.walk() ");

	}

	@Override
	public void multiply() {
		System.out.println("Cat.multiply() ");

	}

	public void scratch() {
		System.out.println("Cat.scratch() ");
	}

	public void jump() {
		System.out.println("Cat.jump() ");
	}
	public String toString(){
		return "Cat";
	}
}
