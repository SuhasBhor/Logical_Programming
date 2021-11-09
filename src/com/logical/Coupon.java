package com.logical;

import java.util.Random;
import java.util.Scanner;

public class Coupon {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int val, count = 0, a = 0;
		System.out.print(" How Many Coupon Number You Wants: ");
		int n = scan.nextInt();
		
		int[] array = new int[n];

		while (count < n) {
			val = random.nextInt(1000);
			System.out.print("\nchecking " + val);
			for (int i = 0; i < count; i++) {
				if (array[i] == val) {
					System.out.print(" already used ");
					a = 1;
					break;
				}else {
					a = 0;
				}
			}
			
			if (a == 0) {
				array[count++] = val;
			}
			System.out.print("\n Current array: ");
			for (int i = 0; i < count; i++) {
				System.out.print(" " + array[i]);
			}
		}		
	}
}
