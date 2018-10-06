import java.util.Scanner;
import java.util.Arrays;
public final class Solution {


	public static void main(final String[] args) {
			Scanner scan = new Scanner(System.in);
			int students = Integer.parseInt(scan.nextLine());
			int vacancies = Integer.parseInt(scan.nextLine());
			int opencategory = Integer.parseInt(scan.nextLine());
			int bccategory = Integer.parseInt(scan.nextLine());
			int sccategory = Integer.parseInt(scan.nextLine());
			int stcategory = Integer.parseInt(scan.nextLine());
			int N = students;
			int size = 0;
			Information[] students = new Information[N];

			for (int i = 0; i < N; i++) {
				Information temp = new Information(scan.nextLine());
				students[size++] = temp;
			}
			scan.close();

			MergeSort.sort(students);
			for (int i = 0; i < N; i++) {
				System.out.println(students[i]);
			}

			Information[] filledSeats = seatsfilled(students,
			                                    vacancies, opencategory,
			                                    bccategory, sccategory, stcategory);
			for (int i = 0; i < vacancies; i++) {
				System.out.println(filledSeats[i]);
			}
	}
}

