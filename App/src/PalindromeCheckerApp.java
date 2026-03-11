public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal panama";

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

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
    }
}