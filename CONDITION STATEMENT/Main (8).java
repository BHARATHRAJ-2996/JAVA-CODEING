import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
 int num2 = sc.nextInt();
int bharath=num1%10;
int bharath1=num2%10;

        if (bharath==bharath1) {
            System.out.println("the"+ num1 +"is not devid");
        } else {
            System.out.println("the"+ num2 + "is not divi");
        }
    }
}
