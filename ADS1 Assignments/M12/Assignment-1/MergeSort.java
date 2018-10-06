import java.util.Arrays;

/**
 * Class for merge sort : Descending order.
 */
public class MergeSort {

	public static boolean greater(Comparable x, Comparable y) {
		return x.compareTo(y) > 0;
	}

	public static void merge(Comparable[] a, Comparable[] aux,
	                         int low, int mid, int high) {

		for (int i = low; i <= high; i++) {
			aux[i] = a[i];
		}

		int i = low;
		int j = mid + 1;
		for (int k = low; k <= high; k++) {
			if (i > mid) {
				a[k] = aux[j++];
			} else if (j > high) {
				a[k] = aux[i++];
			} else if (greater(aux[j], aux[i])) {
				a[k] = aux[j++];
			} else {
				a[k] = aux[i++];
			}
		}
	}

	// top down sort
	public static void sort(Comparable[] a, Comparable[] aux, int low, int high) {
		if (high <= low) return;
		int mid = low + (high - low) / 2;
		sort(a, aux, low, mid);
		sort(a, aux, mid + 1, high);
		merge(a, aux, low, mid, high);
	}

	// top down sort
	public static void sort(Comparable[] a) {
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1);
	}

}