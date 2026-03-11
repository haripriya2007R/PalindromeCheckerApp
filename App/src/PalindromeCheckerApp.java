public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal panama";

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

 UC10
        int i = 0;
        int j = normalized.length() - 1;

        while (i < j) {
            if (normalized.charAt(i) != normalized.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

  
    private static boolean isPalindrome(String str, int start, int end) {

      
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

      
        return isPalindrome(str, start + 1, end - 1);
      main
    }
}
