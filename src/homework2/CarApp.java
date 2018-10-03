package homework2;

public class CarApp {
	public static void main(String[] args) {
		
		//Define The First Ford Mustang
		CarInfo car1 = new CarInfo();
		car1.setManufacture("Ford");
		car1.setModel("Mustang");
		car1.setMakeYear("1964");
		
		//Define The first Chevy Corvette
		CarInfo car2 = new CarInfo();
		car2.setManufacture("Chevy");
		car2.setModel("Corvette");
		car2.setMakeYear("1953");
		
		//Define The first Dodge Charger
		CarInfo car3 = new CarInfo();
		car3.setManufacture("Dodge");
		car3.setModel("Charger");
		car3.setMakeYear("1966");
		
		//Print the first entry
		System.out.println(car1.getManufacture());
		System.out.println(car1.getModel());
		System.out.println(car1.getMakeYear());
		
		//Print the second entry
		System.out.println(car2.getManufacture());
		System.out.println(car2.getModel());
		System.out.println(car2.getMakeYear());
		
		//Print the Third entry
		System.out.println(car3.getManufacture());
		System.out.println(car3.getModel());
		System.out.println(car3.getMakeYear());
		
		// while loop that counts down to print go
		
		for(int i = 10; i > 0; i-- ) {
			if( i == 0 ) {
				]-
				System.out.println("race");01
			}
			else
				System.out.println(i);
		} 
	}
	
}
