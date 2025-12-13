import java.util.Scanner;

public class j19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (n > 0) {
     System.out.println("Positive");
        } else if (n < 0) {
       System.out.println("Negative");
     } else {
  System.out.println("Zero");
        }
    }
}