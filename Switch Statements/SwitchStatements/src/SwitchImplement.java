import java.util.Scanner;

public class SwitchImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		// Variable types supported by switch statements: char, byte, short, int and String
		System.out.println(" Enter your letter: ");
		
		String letter = input.next();
		
		switch(letter){
			case "a" :
				System.out.println(" It is A ");
			break;
			case "b" :
				System.out.println(" It is B ");
			break;
			
			default :
				System.out.println("It is not a letter. ");
		}
	}

}