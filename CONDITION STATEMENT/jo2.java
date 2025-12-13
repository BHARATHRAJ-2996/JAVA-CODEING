import java.util.Scanner;

public class jo2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.print("1");
        int num1 = scanner.nextInt();
     System.out.print("2");
    int num2 = scanner.nextInt();
        if (num1 < num2) {
          System.out.println(num1 );
      } else if (num2 < num1) {
            System.out.println(num2);
     } else {
           System.out.println("equal");
    }
        
        scanner.close();
    }
}