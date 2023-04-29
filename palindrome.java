package class13.HW;

public class palindrome {

    public static void main(String[] args) {


        String str = "ouma";
        boolean isPalindrome = true;

        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
