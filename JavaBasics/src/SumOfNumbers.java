import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter a and b values");
        a=sc.nextInt();
        b=sc.nextInt();
        int c=a+b;
        System.out.println("Sum of two numbers is "+c);
    }
}
