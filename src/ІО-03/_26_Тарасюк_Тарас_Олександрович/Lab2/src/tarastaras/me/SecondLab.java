package tarastaras.me;

/**
 * 
 * 326 % 5 = C5 = 1 --> C=transpose
 * 326 % 7 = C7 = 4 --> long type
 * 326 % 11 = C11 = 7
 *
 */

public class SecondLab{

	public static void main(String[] args) {
		System.out.println("Operation ¹1:\n");
		long [][] arr = {{1,2,3,4},
						{6,7,8,9},
						{5,4,3,2},
						{10,9,8,7},
						{25,2,1,4},
						{1,3,4,16},
						{13,31,42,18}};
		long [][] arrTran = new long [arr[0].length][arr.length];
		
		System.out.println("<----------Show the initial matrix---------->");
		for(int i = 0; i < arr.length; i++) {
			for	(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println(" ");
		}
		
		// transpose the array
		for(int i = 0; i < arr.length; i++) {
			for	(int j = 0; j < arr[i].length; j++) {
				arrTran[j][i] = arr[i][j];
			}
		}
		
		System.out.println("<----------Show transposed matrix---------->");
		for(int i = 0; i < arrTran.length; i++) {
			for	(int j = 0; j < arrTran[i].length; j++) {
				System.out.print(arrTran[i][j]+"\t");
			}
			System.out.println(" ");
		}
		
		
		System.out.print("\nOperation ¹2:\n");
		
		int indexOdd = 0;  
		int indexEven = 0;  
		long [] evenNums = new long[(arrTran[0].length/2)*arrTran.length];
		long [] oddNums = new long[((arrTran[0].length%2)+(arrTran[0].length/2))*arrTran.length];
		
		//the quantity of evenNums and oddNums elements
//		System.out.println("odd="+((arrTran[0].length%2)+(arrTran[0].length/2)*arrTran.length));
//		System.out.println("even="+((arrTran[0].length/2)*arrTran.length));
		
		// get arrays depending on the column 
		for(int i = 0; i < arrTran.length; i++) {
			for	(int j = 0; j < arrTran[i].length; j++) {
				//get numbers from even columns 
				if((j+1)%2==0) {
					evenNums[indexEven++] = arrTran[i][j]; 
					System.out.println(arrTran[i][j]);
				}
				//get numbers from odd columns
				if((j+1)%2!=0) {
					oddNums[indexOdd++] = arrTran[i][j]; 
				}	
			}
		}

		// get sorted array of odd numbers
		for(int i = 0; i < indexOdd; i++) {
			oddNums[i] = bubbleSort(indexOdd, oddNums)[i];
			//System.out.print(oddNums[i]+" ");
		}
        // get sorted array of even numbers
		for(int i = 0; i < indexEven; i++) {
			evenNums[i] = bubbleSort(indexEven, evenNums)[i];
			//System.out.print(evenNums[i]+" ");
		}
	
		System.out.println("\nNums from even columns: Sum = "+evenNums[0]+"+"+evenNums[1]+" = "+(evenNums[0]+evenNums[1]));
		System.out.println("Nums form odd columns: Sum = "+oddNums[indexOdd-2]+"+"+oddNums[indexOdd-1]+" = "+(oddNums[indexOdd-2]+oddNums[indexOdd-1]));
		
	}
	
	
	// get sorted array 
	static long[] bubbleSort(int index, long [] arr) {
		boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			for (int i = 0; i < index-1; i++) {
				if(arr[i] > arr[i+1]){
					isSorted = false;
					long temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		return arr;
	}
}
