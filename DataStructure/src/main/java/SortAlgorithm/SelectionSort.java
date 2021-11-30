package SortAlgorithm;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		selectionnSort(n, a);
		show(n, a);
		
		sc.close();
	}

	public static void selectionnSort(int n, int[] a) {
		for (int i = 0; i < n - 1; ++i) {
			int m = i;
			for (int j = i + 1; j < n; ++j) {
				if (a[j] < a[m]) {
					m = j;
				}
			}
			if (m != i) {
				a[i] = a[i] - a[m];
				a[m] = a[m] + a[i];
				a[i] = a[m] - a[i];
			}
		}
	}

	public static void show(int n, int[] a) {
		for (int i = 0; i < n; ++i) {
			System.out.print(a[i] + " ");
		}
	}
}
