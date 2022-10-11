
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vehicle vehicle1 = new Vehicle();
		Car car = new Car();
		Vehicle vehicle2 = car;
		vehicle2.design();
		
		car.ride();
		//vehicle2.ride();
		
		createDesign(car);
	}

public static void createDesign(Vehicle vehicle) {
		
		vehicle.design();
	}
}
