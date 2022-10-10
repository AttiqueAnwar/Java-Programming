
public class CreatingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers = new int[5];
		
		System.out.println(numbers[0]);
		
		
		numbers[0] = 2;
		numbers[1] = 4;
		numbers[2] = 6;
		numbers[3] = 8;
		numbers[4] = 10;
		
	// printing arrays through single line	
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		
	//printing through for loop		
		for (int i =0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}




