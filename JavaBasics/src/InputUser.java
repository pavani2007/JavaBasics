import java.util.*;
public class InputUser {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer value");
        int b=sc.nextInt();
        String a;
        System.out.println("Enter the string");
        a=sc.next();
        float c;
        System.out.println("Enter float values");
        c=sc.nextFloat();
        System.out.println("Enter char value");
        char d=sc.next().charAt(0);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
