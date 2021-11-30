package SortAlgorithm;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		show(n, a);

		sc.close();
	}

	public static void quickSort(int n, int[] a, int l, int r) {
		int m = (l + r) / 2;
		int p = a[m];
		int i = l;
		int j = r;
		while (i < j) {
			while (a[i] < p) {
				++i;
			}
			while (a[j] > p) {
				--j;
			}
			if (i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				++i;
				--j;
			}
		}
		if (i < r) {
			quickSort(n, a, i, r);
		}
		if (j > l) {
			quickSort(n, a, l, j);
		}

	}
	
	public static void show(int n, int[] a) {
		//quickSort(n, a, 0, n - 1);
		
		int[] evens = new int[n];
		int[] olds = new int[n];
		int x=0;
		int z=0;
		
		for(int i=0; i<n; ++i) {
			if(a[i] == 0) {
				continue;
			}
			if(a[i] > 0) {
				evens[x++] = a[i];
			} else {
				olds[z++] = a[i];
			}
		}
		
		quickSort(x, evens, 0, x-1);
		quickSort(z, olds, 0, z-1);

		x=0;
		
		
		for(int i=0; i<n; ++i) {
			if(a[i] == 0) {
				System.out.print(0 + " ");
			}
			else if(a[i] > 0) {
				System.out.print(evens[x++] + " ");
			} else {
				System.out.print(olds[--z] + " ");
			}
		}
	}
}
