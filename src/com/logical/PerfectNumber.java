package com.logical;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum=0;
		
		System.out.print("Enter The Numnber: ");
		int n = scan.nextInt();
		
		for(int i=1;i<=n/2;i++) {
			if(n % i == 0) {
				sum=sum+i;
				System.out.println(i+ " "+sum);
			}
		}
		if(sum == n) {
			System.out.println("Number is Perfect Number");
		}else {
			System.out.println("Number is Not Perfect Number");
		}
	}
}
