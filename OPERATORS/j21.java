import java.util.Scanner;
public class j21{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);         System.out.print("Enter marks: ");
        int marks = scanner.nextInt();
   if (marks >= 35) {
            System.out.println("Result: Pass");
  } else {
            System.out.println("Result: Fail");
        }
    }
}