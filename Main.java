package hierarchy;
/**
 * Cоздать иерархию классов Pet, где потомками были бы Черепаха, Кот, Собака, и Попугай. 
 * На основании этого определить Pet это абстрактный класс или интерфейс. 
 * Перенести общие методы в класс Pet если необходимо. 
 * Как минимум у каждого животного должна быть реализация методов есть , спать, гулять, размножатся - 
 * и несколько таких которые могут быть только у конкретного дивотного, на личный выбор
 * 
 * @author vov
 *
 */

public class Main {

	public static void main(String[] args) {
	Pet [] pet = {new Turtle(), new Cat(), new Dog(), new Parrot()};
		
		Zoo.printZoo(pet);
		Zoo.allZooWalk(pet);
		Zoo.superPowers(pet);
	}

}
