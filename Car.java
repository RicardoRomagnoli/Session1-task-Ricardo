package java8.session1.inheritance;

public class Car implements Vehicle, FinancialCalculations {
	// Declaración de variables Globales de la clase
	private long idL;
	public String name;
	public int year;
	public String color;
	public String date;

	// Constructor de la clase Car c/5 Parámetros
	public Car(long idL, String name, int year, String color, String date) {
		super();
		this.idL = idL;
		this.name = name;
		this.year = year;
		this.color = color;
		this.date = date;
	}
	
	// Método calculatePrice de la clase FinancialCalculations
	@Override
	public double calculatePrice() {
		return price;
	}
	
	// Método calculateCost de la clase FinancialCalculations
	@Override
	public double calculateCost() {
		return cost;
	}

	// Método toString para mostrar la salida de los datos en consola
	@Override
	public String toString() {
		return "Car [idL= " + idL + ", name= " + name + ", year= " + year + ", color= " + color + ", date= " + date + "] \n";
	}

	// Método speedUp de la clase Vehicle
	@Override
	public void speedUp(int acelerar) {

	}

	// Método speedDown de la clase Vehicle
	@Override
	public void speedDown(int frenar) {

	}

}