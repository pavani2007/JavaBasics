import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("enter the array elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int n:a){
            sum+=n;
        }
        System.out.println("Sum of elements : "+sum);
    }
}
