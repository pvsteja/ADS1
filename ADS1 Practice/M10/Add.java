import java.util.Scanner;
class Solution {
    String addString(String s) {

        if (s.length() == 1) {
            return s;
        }
        if (s.charAt(0) == s.charAt(1)) {
            return s.charAt(0) + "*" +addString(s.substring(1));
        }
        return s.charAt(0) + addString(s.substring(1));

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s =  scan.nextLine();
        Solution s = new Solution();
        System.out.println(s.addString(s));

    }
}