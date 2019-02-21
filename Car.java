package java8.session1.inheritance;

public class Car implements Vehicle, FinancialCalculations {
	// Declaraci�n de variables Globales de la clase
	private long idL;
	public String name;
	public int year;
	public String color;
	public String date;

	// Constructor de la clase Car c/5 Par�metros
	public Car(long idL, String name, int year, String color, String date) {
		super();
		this.idL = idL;
		this.name = name;
		this.year = year;
		this.color = color;
		this.date = date;
	}
	
	// M�todo calculatePrice de la clase FinancialCalculations
	@Override
	public double calculatePrice() {
		return price;
	}
	
	// M�todo calculateCost de la clase FinancialCalculations
	@Override
	public double calculateCost() {
		return cost;
	}

	// M�todo toString para mostrar la salida de los datos en consola
	@Override
	public String toString() {
		return "Car [idL= " + idL + ", name= " + name + ", year= " + year + ", color= " + color + ", date= " + date + "] \n";
	}

	// M�todo speedUp de la clase Vehicle
	@Override
	public void speedUp(int acelerar) {

	}

	// M�todo speedDown de la clase Vehicle
	@Override
	public void speedDown(int frenar) {

	}

}