import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" number:");
        int num = sc.nextInt();

        int lastDigit = num % 10;

        if (lastDigit % 2 == 0) {
            System.out.println(" digit ("+lastDigit+") of "+ num+ "is even.");
        } else {
            System.out.println("the digit ("+lastDigit+") of "+ num+ "is odd.");
        }
    }
}
