package SortAlgorithm;

import java.util.Scanner;

public class ShellSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        shellSort(n, a);
		show(n, a);
		
		sc.close();
	}
	
	public static void shellSort(int n, int[] a) {
		int interval, i, j;
		for(interval = n/2; interval > 0; interval /= 2) {
			for(i = interval-1; i < n; ++i) {
				int temp = a[i];
				for(j = i; j >= interval && a[j-1] > temp; j -= interval) {
					a[j] = a[j-interval];
				}
				a[j] = temp;
			}
		}
	}
	
	
	public static void show(int n, int[] a) {
        for(int i=0; i<n; ++i) {
			System.out.print(a[i] + " ");
		}
	}
}
