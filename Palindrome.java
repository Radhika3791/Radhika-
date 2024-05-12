public class PalindromeSum {
    
    static boolean isPalindrome(int num) {
        int rev = 0, n = num;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return num == rev;
    }
    
    static int palindromeSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int start = 100, end = 1000;
        System.out.println("Sum of palindromic numbers between " + start + " and " + end + " is: " + palindromeSum(start, end));
    }
}
