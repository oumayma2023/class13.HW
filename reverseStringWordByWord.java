package class13.HW;

public class reverseStringWordByWord {
    public static void main(String[] args) {


            String str = "This is sentence I want to reverse";
            System.out.println(str);
            String[] words = str.split(" ");
            System.out.println(words);
            for (String str1 : words) {
                for (int i = str1.length() - 1; i >= 0; i--) {
                    System.out.print(str1.charAt(i));
                }
                System.out.print(" ");
            }
        }
    }



