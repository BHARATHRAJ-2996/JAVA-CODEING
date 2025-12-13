import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a chara");
        char ch = sc.next().charAt(0);

        int asciiValue = (int) ch;

        if (asciiValue % 2 == 0) {
            System.out.println("The ASCII value of"+ch+"is"+asciiValue+"even");
        } else {
            System.out.println("The ASCII value of" +ch+"s"+asciiValue+"odd");
        }

        sc.close();
    }
}
