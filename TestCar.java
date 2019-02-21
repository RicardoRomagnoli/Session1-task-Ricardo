package java8.session1.inheritance;

public class TestCar {
	// Método Main o Principal
	public static void main(String[] args) {
		// Creación de las Instancias de clases

		// Instancia de la clase Car: Inicializar sus Variables
		// idL,name,year,color & date
		Car fiesta = new Car(1, "Ford", 1997, "blanco", "01/10/1997");
		System.out.println(fiesta);

		// Instancia de la clase ElectricCar: Inicializar sus Variables
		// bateries & power
		ElectricCar toyota = new ElectricCar(2, "Prius", 2017, "azul", "01/05/2017");
		toyota.batteries = 1;
		toyota.power = 600;
		System.out.println(toyota);
		System.out.println("El Carro " + toyota.name + ". Tiene: " + toyota.batteries + " bateria Eléctrica");
		System.out.println("Además tiene una potencia de: " + toyota.power + " Voltios. +\n");

		// Instancia de la clase GasolineCar: Inicializar sus Variables
		// gallons & mpgF
		GasolineCar volkwagen = new GasolineCar(3, "Jetta", 1980, "café", "18/11/1980");
		volkwagen.gallons = 15;
		volkwagen.mpgF = 0.04f;
		System.out.println(volkwagen);
		System.out.println("El Carro " + volkwagen.name + ". Tiene Capacidad de: " + volkwagen.gallons + " Galones de Combustible");
		System.out.println("Además tiene una fuerza de: " + volkwagen.mpgF + " Caballos de Fuerza");

	}// Cierre del Método Main

}// Cierre de la Clase TestCar