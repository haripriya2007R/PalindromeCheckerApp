import java.util.Scanner;

public class PalindromeCheckerApp {

  
    public static boolean isPalindromeReverse(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }

 
    public static boolean isPalindromeTwoPointer(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (Character.toLowerCase(input.charAt(left)) != Character.toLowerCase(input.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        
        long startTime = System.nanoTime();

        boolean result = isPalindromeTwoPointer(input);

        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("Is Palindrome : " + result);
        System.out.println("Execution Time : " + executionTime + " ns");

        scanner.close();
    }
}
