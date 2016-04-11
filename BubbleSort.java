import java.util.Scanner;

class Sort {
	
	//BubbleSort method
    public static void Sort(int[] array)
    {	
    	//Determine the size
        for (int i = array.length - 1; i > 0; --i)
            for (int j = 0; j < i; ++j)
                if (array[j] > array[j + 1])
                    Swap(array, j, j + 1);
        for (int i : array) { // Print array contents 
    		System.out.print(i); 
    	} 
    }
    
    //Change the array's position when the B more than the A
    private static void Swap(int[] array, int A, int B)
    {
        int tmp = array[A];
        array[A] = array[B];
        array[B] = tmp;
    }
    
    public int[] Array(String s)
	{		
    	int[] ary;
		// Processing the digital part
		ary = new int[s.length()]; //array's length is StringS's length
		for (int i = 0; i < s.length(); i++) { //Use the loops to read each character
			String s2 = s.substring(i, i+1); //Use substring () to catch each character
			ary[i] = Integer.parseInt(s2); //Characters into an integer, stored in an array
		} 		
		return ary;
	}		
}

public class BubbleSort{
	public static void main(String[] args){
		Sort sort = new Sort();
		Scanner input = new Scanner(System.in);
		String a;
		System.out.println("Enter number:");
		a = input.nextLine();
		int[] A = sort.Array(a);
		sort.Sort(A);
	}
}
