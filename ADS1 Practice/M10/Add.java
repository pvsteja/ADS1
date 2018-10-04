import java.util.Scanner;
class Solution {
    String pairString(String str) {

        if (str.length() == 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" +pairString(str.substring(1));
        }
        return str.charAt(0) + pairString(str.substring(1));

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str =  scan.nextLine();
        Solution s = new Solution();
        System.out.println(s.pairString(str));

    }
}