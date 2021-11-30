package SortAlgorithm;
import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        insertionSort(n, a);
        show(n, a);
        
        sc.close();
	}
	
	public static void insertionSort(int n, int[] a) {
		//boolean flag = false;
		for(int i=1; i<n; ++i) {
			int x = a[i];
			int j = i-1;
			while(j>=0 && a[j]>x) {
				a[j+1] = a[j];
				--j;
			}
			a[j+1] = x;
		}
	}
	
	public static void show(int n, int[] a) {
        for(int i=0; i<n; ++i) {
			System.out.print(a[i] + " ");
		}
	}
}