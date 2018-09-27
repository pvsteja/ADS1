import java.util.Scanner;
/**
 *Solution class.
 **/

public final class  Solution {

/**
 *Solution class.
 */
private Solution() {

}

/**.
     * { Merge Arrays }
     * @param      arr1     { parameter_description }
     * @param      arr2     { parameter_description }
     */
    public void mergeArrays(final int[] arr1, final int[] arr2) {

        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr3 = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i];
                i++;
            } else {
                arr3[k++] = arr2[j];
                j++;
            }
        }
        if (i == arr1.length) {
            while (j < arr2.length) {
                arr3[k++] = arr2[j];
                j++;
            }
        } else {
            while (i < arr1.length) {
                arr3[k++] = arr1[i];
                i++;

            }
        }
        int x;
        for (x = 0; x < arr3.length - 1; x++) {
            System.out.print(arr3[x] + ",");
        }
        System.out.println(arr3[x]);
    }

/**
 * @brief [brief description]
 * @details [long description]
 *
 * @param args arguments
 */
    public static void main(final String[] args) {

/**
 * @brief [brief description]
 * @details [long description]
 */
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        String[] elements;
        if (m != 0) {
            elements = sc.nextLine().split(",");
            for (int i = 0; i < elements.length; i++) {
                arr1[i] = Integer.parseInt(elements[i]);
            }
        } else {
            sc.nextLine();
        }
        if (n != 0) {
            elements = sc.nextLine().split(",");
            for (int i = 0; i < elements.length; i++) {
                arr2[i] = Integer.parseInt(elements[i]);
            }
        }
        new Solution().mergeArrays(arr1, arr2);
    }
}
