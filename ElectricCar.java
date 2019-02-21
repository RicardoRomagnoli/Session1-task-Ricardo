package java8.session1.inheritance;

public class ElectricCar extends Car {
	public int batteries;
	public int power;

	public ElectricCar(long idL, String name, int year, String color, String date) {
		super(idL, date, year, date, date);
	}

}
