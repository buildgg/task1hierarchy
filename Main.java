package hierarchy;
/**
 * C������ �������� ������� Pet, ��� ��������� ���� �� ��������, ���, ������, � �������. 
 * �� ��������� ����� ���������� Pet ��� ����������� ����� ��� ���������. 
 * ��������� ����� ������ � ����� Pet ���� ����������. 
 * ��� ������� � ������� ��������� ������ ���� ���������� ������� ���� , �����, ������, ����������� - 
 * � ��������� ����� ������� ����� ���� ������ � ����������� ���������, �� ������ �����
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
