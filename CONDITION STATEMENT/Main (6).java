import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 7 == 0) {
            System.out.println("the"+ num +"is not devid");
        } else {
            System.out.println("the"+ num + "is not divi");
        }
    }
}
