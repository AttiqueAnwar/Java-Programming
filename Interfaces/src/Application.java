
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Computer computer1 = new Computer();
		computer1.start();
		
		Vehicle vehicle1 = new Vehicle("Car");
		vehicle1.drive();
		
		System.out.println();
		
		Information info = new Computer();
		info.displayInformation();
		Information info1 =  vehicle1;
		vehicle1.displayInformation();
		
		System.out.println();
		
		showInformation(computer1);
		showInformation(vehicle1);
	}
	
	private static void showInformation(Information info) {
		info.displayInformation();
	}
	

}
