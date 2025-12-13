import java.util.Scanner;

public class j13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (n < 0) {
            n = n * -1;
        }
              System.out.println("Absolute value: "+ n);
    }
}