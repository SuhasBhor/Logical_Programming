package com.logical;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int reverse=0;
		
		System.out.print("Enter The Number: ");
		int n=scan.nextInt();
		
		while(n != 0) {
			reverse = reverse * 10 + n % 10;
			n = n / 10;
		}
		System.out.println("Reverse Number Is: "+reverse);
	}
}
