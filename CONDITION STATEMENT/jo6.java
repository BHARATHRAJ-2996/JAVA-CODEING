import java.util.Scanner;
public class jo6 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
          int b = sc.nextInt();
            int c = sc.nextInt();
        int greatest = Math.min(a, Math.min(b, c));
        System.out.println("small number is: " + greatest);
    }
}
