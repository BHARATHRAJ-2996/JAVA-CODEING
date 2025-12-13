import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 0 && num <= 9 || num <= -1 && num >= -9) {
            System.out.println("The number " + num + " is a single-digit number.");
        } else if (num >= 10 && num <= 99 || num <= -10 && num >= -99) {
            System.out.println("The number " + num + " is a two-digit number.");
        } else if (num >= 100 && num <= 999 || num <= -100 && num >= -999) {
            System.out.println("The number " + num + " is a three-digit number.");
        } else {
            System.out.println("num");
        }

        sc.close();
    }
}
