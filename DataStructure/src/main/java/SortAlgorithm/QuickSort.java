package SortAlgorithm;

import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		quickSort(n, a, 0, n-1);
		show(n, a);
		
		sc.close();
	}
	
	public static void quickSort(int n, int[] a, int l, int r) {
		int m = (l+r)/2;
		int p = a[m];
		int i=l;
		int j=r;
		while(i<j) {
			while(a[i] < p) {
				++i;
			}
			while(a[j] > p) {
				--j;
			}
			if(i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;				
				++i;
				--j;
			}
		}
		if(i<r) {
			quickSort(n, a, i, r);
		}
		if(j>l) {
			quickSort(n, a, l, j);
		}
		
	}

	public static void show(int n, int[] a) {
		for (int i = 0; i < n; ++i) {
			System.out.print(a[i] + " ");
		}
	}
}
