public class EvenSum {
    
    public static void main(String[] args) {
        int start = 1, end = 100; // Example range
        int sum = 0;
        
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) { // Checking if the number is even
                sum += i; // Adding even number to sum
            }
        }
        
        System.out.println("Sum of even numbers between " + start + " and " + end + " is: " + sum);
    }
}