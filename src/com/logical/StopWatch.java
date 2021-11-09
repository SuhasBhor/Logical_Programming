package com.logical;

import java.util.Scanner;

public class StopWatch {
	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 int n = 0;
	 
	 System.out.print("Enter Any Numebr To Start: ");
	 scan.nextInt();
	 long start = System.nanoTime();
	 long end = 0;
	 while( n != 1 ){
		 System.out.print("Enter 1 To Stop: ");
		 n = scan.nextInt();
		 switch(n) {
		 case 1:
			 end=System.nanoTime();
		 }
	 	}
	 float ElapseTime = (float)((end - start)*Math.pow(10 , -9));
	 System.out.print("ElapseTime is: "+ElapseTime);
	}
}
