import java.util.Scanner;
public class jo8 {
    public static void main(String[] args) {
           Scanner num = new Scanner(System.in);       
            int a = num.nextInt() % 10;
        if (a % 3 == 0) {
            System.out.println(a);
        } else {
            System.out.println( a + "NOT");
        }
    }
}
