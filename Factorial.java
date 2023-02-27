

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	        int i;
	        int factorial=1;  
	        int number=sc.nextInt();    
	     for(i=1;i<=number;i++){    
	         factorial=factorial*i;    
	    }    
	      //System.out.println("Factorial is"+factorial);  	    
	}

}
