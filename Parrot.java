package hierarchy;

public class Parrot implements Pet {
	@Override
	public void eat() {
		System.out.println("Parrot.eat()");
	}

	@Override
	public void sleep() {
		System.out.println("Parrot.sleep() ");
	}

	@Override
	public void walk() {
		System.out.println("Parrot.walk() ");
	}

	@Override
	public void multiply() {
		System.out.println("Parrot.multiply() ");
	}
	public void fly() {
		System.out.println("Parrot.fly() ");
	}
	public void peck() {
		System.out.println("Parrot.peck() ");
	}
	public String toString(){
		return "Parrot";
	}
	
}
