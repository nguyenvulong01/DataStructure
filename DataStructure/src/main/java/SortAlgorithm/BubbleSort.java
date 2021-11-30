package SortAlgorithm;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
		bubbleSort(n, a);
		show(n, a);
		
		sc.close();
	}
	
	public static void bubbleSort(int n, int[] a) {
		boolean flag = false;
		for(int i=0; i<n-1; ++i) {
			flag = false;
			for(int j=n-1; j>i; --j) {
				if(a[j]<a[j-1]) {
					a[j-1] = a[j-1] - a[j];
					a[j] = a[j] + a[j-1];
					a[j-1] = a[j] - a[j-1];
					flag = true;
				}
			}
			if(flag == false) {
				break;
			}
		}
	}
	
	
	public static void show(int n, int[] a) {
        for(int i=0; i<n; ++i) {
			System.out.print(a[i] + " ");
		}
	}
}