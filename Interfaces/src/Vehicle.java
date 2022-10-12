
public class Vehicle implements Information {

	
	private String type;
	
	
	
	public Vehicle(String type) {
		this.type = type;
	}



	public void drive() {
		System.out.println("drive vehicle");
	}



	@Override
	public void displayInformation() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle type is " + type);
		
	}
	
	
	
	
}


