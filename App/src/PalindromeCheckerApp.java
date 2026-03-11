
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 UC6
        System.out.print("Input : ");
        String input = scanner.nextLine().toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

       
        String input = "noon";

       
        Stack<Character> stack = new Stack<>();

      
 main
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

 UC6
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {

        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
 main
                isPalindrome = false;
                break;
            }
        }

UC6
        System.out.println("Is Palindrome: " + isPalindrome);
        scanner.close();

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + isPalindrome);
 main
    }
}
