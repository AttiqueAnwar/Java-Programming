
class Methods {
	String animal;
	int value ; 
	int month;
	
	void run() {
		System.out.println("running");
		
		for(int i = 0 ; i<4 ; i++) {
			System.out.println("My " + animal + " is " + value + " years old.");
		}
		
	}
	
	
	int calculateMonthsToBirthday() {
		int monthsLeft = 12 - month;
			return monthsLeft;
	}
	
	void talk(String text) {
		System.out.println(text);
	}
	
	void walk(int speed) {
		System.out.println("Walking " + speed + " km per hour");
	}
	
	void timer(int minutes, double seconds) {
		
		System.out.println("It took " + minutes + "m and " + seconds + "s to get down the road.");
	}
	
}


public class Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methods name = new Methods();
		
		//void animal
		name.animal = "Dog";
		name.value = 2;
		name.run();
		
		//birthday to month
		name.month = 10;
		int months = name.calculateMonthsToBirthday();
		
		//void walk
		name.walk(7);
		
		//void talk
		name.talk("Hi, I am Attique!");
		String hello = "Hello there!";
		name.talk(hello);
		
		
		//void timer
		name.timer(9, 3.65);
		
		System.out.println("Months until birthday " + months);
		
	}

}
