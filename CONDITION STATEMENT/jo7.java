import java.util.Scanner;
public class jo7 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
          int b = sc.nextInt();
            int c = sc.nextInt();
        int greatest = Math.max(a, Math.max(b, c));
        System.out.println("small number is: " + greatest);
    }
}
