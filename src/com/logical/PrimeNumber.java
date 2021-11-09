package com.logical;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = scan.nextInt();
		
		if(n < 2) {
			System.out.println("Number is Not Prime Number");
		}
		
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				System.out.println("Number is Not Prime Number");
				return;
			}
		}
		System.out.println("Number is Prime Number");
	}
}
