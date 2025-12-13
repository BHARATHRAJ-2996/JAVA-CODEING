import java.util.Scanner;
public class  jo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    if (num >= 100 && num <= 999) {        
          System.out.println(num + " is a 3-digit number.");
        } else {
         System.out.println(num + " is NOT a 3-digit number.");
        }
    }
}
