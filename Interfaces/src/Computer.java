
public class Computer implements Information {

	private int serialNumber = 8035;
	
	public void start() {
		System.out.println("Computer Started");
	}

	@Override
	public void displayInformation() {
		// TODO Auto-generated method stub
		
		System.out.println("Computer serial " + serialNumber );
	}
	
	
}
