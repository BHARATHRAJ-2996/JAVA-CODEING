import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("the"+num+"is positive");
        } else if (num < 0) {
            System.out.println("the"+num+"is negative");
        } else {
            System.out.println("The number is zero.");
        }

        sc.close();
    }
}
