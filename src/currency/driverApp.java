package currency;

import java.util.Arrays;
import java.util.Scanner;

public class driverApp {
 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter number of currency notes");
	int size=sc.nextInt();
	
	int currency []=new int[size];
	System.out.println("Enter denomination of currency notes");
	for (int i = 0; i < currency.length; i++) {
		currency[i]=sc.nextInt();
		
	}
	System.out.println("Before sorting "+Arrays.toString(currency));
	
	MergeSort ms= new MergeSort();
	ms.sort(currency, 0, size-1);
	System.out.println("After sorting"+Arrays.toString(currency));
	System.out.println("Enter the amount");
	int amount=sc.nextInt();
	NoteCount nc=new NoteCount();
	nc.counting(currency,amount);
}
 
}
