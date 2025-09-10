import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;  // Store the original number

        int reversedNum = 0;

        // Reverse the number
        while (num != 0) {
            int digit = num % 10; // get last digit
            reversedNum = reversedNum * 10 + digit; // build reversed number
            num = num / 10; // remove last digit
        }

        // Compare original and reversed
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome number.");
        } else {
            System.out.println(originalNum + " is NOT a Palindrome number.");
        }

        sc.close();
    }
}
