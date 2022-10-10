
public class MultidimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int [] oneDimensionalArray =  	{12,49,922};
		System.out.println(oneDimensionalArray[1]);
		
		
		
		int [][] multidimensionalArray = {{12,49,922},{22,32,1213,3221},{12,323,54,76,}};
		System.out.println(multidimensionalArray[2][2]);
		
		
		
		double [][] doublearray = new double [4][2];
		doublearray [2][1] = 2.1;
		System.out.println(doublearray[2][1]);
		
		
		
		for(int array =0 ; array < multidimensionalArray.length; array ++) {
			for(int item =0 ; item < multidimensionalArray[array].length; item++) {
			System.out.print(multidimensionalArray[array][item] + "\t");
			}
			System.out.println();
			
		}
		
		
		
	} 

}
