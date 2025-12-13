import java.util.Scanner;

public class jo4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.print("1");
        int num = scanner.nextInt();
        System.out.print("2");
        int num1 = scanner.nextInt();
        int diif = (num-num1);
        if (diif % 2 == 0) {
          System.out.println("even" );
          }else {
            System.out.println("odd");
    }
    }
}