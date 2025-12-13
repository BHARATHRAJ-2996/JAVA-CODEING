public class j8{
public static void main (String[] args){
    int a =10;
    int b=7;
    System.out.println("Before swapping: "+a+" "+b);
    a=a+b;
    b=a-b; 
    a=a-b; 
   System.out.println("After swapping: "+a+" "+b);
}
}