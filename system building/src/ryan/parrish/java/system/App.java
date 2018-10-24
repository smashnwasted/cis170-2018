package ryan.parrish.java.system;


public class App {

	public static void main(String[] args) {
		
		Car car1 = new Car(12, 32, 100);
		
		//If else to determine the pass fail
		if (car1.milesdriven >= 0) {
			System.out.println("this car passes");
			//int mpg, int tankSize, int milesdriven
			System.out.printf("this car has %d miles left till pit stop", car1.getMilesTillnextPitStop(car1.mpg, car1.tankSize, car1.milesdriven));

		}
		else {
			System.out.println("this car fails");
		}
		
		
	}

}
