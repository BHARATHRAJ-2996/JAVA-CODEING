import java.util.Scanner;

public class Main {
  import java.util.Scanner;

public class FirstDigitOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        if (num >= 100 && num <= 999) {
            int firstDigit = num / 100;
            if (firstDigit % 2 == 0) {
                System.out.println("The first digit (" + firstDigit + ") of " + num + " is even.");
            } else {
                System.out.println("The first digit (" + firstDigit + ") of " + num + " is odd.");
            }
        } else {
            System.out.println("Please enter ");
        }

        sc.close();
    }
}
 