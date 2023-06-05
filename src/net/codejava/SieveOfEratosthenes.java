package net.codejava;

import java.util.*;

public class SieveOfEratosthenes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the maximum integer to check for prime numbers: ");
		int maxNum = scanner.nextInt();

		boolean[] isPrime = new boolean[maxNum + 1];
		Arrays.fill(isPrime, true);

		for (int i = 2; i * i <= maxNum; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= maxNum; j += i) {
					isPrime[j] = false;
				}
			}
		}

		System.out.println("Prime numbers up to " + maxNum + ":");
		for (int i = 2; i <= maxNum; i++) {
			if (isPrime[i]) {
				System.out.print(i + " ");
			}
		}

		scanner.close();
	}
}
