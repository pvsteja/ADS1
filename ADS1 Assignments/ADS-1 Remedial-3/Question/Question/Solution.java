import java.util.*;
class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MaxPQ<Candidates> max = new MaxPQ<>();
		// double a[] = new double[n];
		int inp = Integer.parseInt(s.nextLine());
		while(inp > 0) {
			String[] str = s.nextLine().split(" ");

			switch(str[0]) {
				case "Apply":
					String[] details = str[1].split(",");
					Candidates applicants = new Candidates(Integer.parseInt(details[0]), details[1], details[2], Double.parseDouble(details[3]));
					max.insert(applicants);
					break;
				case "Recruit_Top_Candidate":
					System.out.println(max.delMax());
					inp--;
					break;
				case "Ranking":
					System.out.println();
					int size = max.size();
					for (int i = 0; i < size; i++) {
						System.out.println(i+1 + ":" + max.delMax());
					}

			}

		}
	}
}