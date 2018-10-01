import java.util.Scanner;
import java.util.Arrays;
public class Selection {
	public static void sort(Comparable[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i + 1; j < N; j++) {
				if (less(a[j], a[min])) {
					min = j;
				}
			}
			exch(a, i, min);
		}
	}
	public static boolean less(Comparable v , Comparable w) {
		return v.compareTo(w) < 0;
	}
	public static void exch(Comparable[] a, int i, int min) {
		Comparable temp = a[i];
		a[i] = a[min];
		a[min] = temp;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] a = scan.nextLine().split(" ");
		sort(a);
		System.out.println(Arrays.toString(a));
	}
}