package hierarchy;

public class Zoo {
   
	public static void printZoo(Pet[] pet){
		for (Pet p : pet){
			System.out.println(p);
		}
	}
	public static void allZooWalk(Pet[] pet){
		for (Pet p : pet){
			p.walk();
		}
	}
	public static void superPowers(Pet[] pet) {
		for (Pet p : pet) {
			if (p instanceof Turtle) {
				((Turtle) p).swim();
			} else if (p instanceof Cat) {
				((Cat) p).scratch();
			} else if (p instanceof Dog) {
				((Dog) p).bark();
			} else if (p instanceof Parrot) {
				((Parrot) p).fly();
			}
		}
	}
}
