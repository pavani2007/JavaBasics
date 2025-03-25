import java.util.Scanner;
public class Patterns {
    public static void main(String[] args){
        /* printing ****
                    ****
                    ****
                    ****
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Pattern2");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Pattern3");
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Pattern4");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("Pattern5");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Pattern6");
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("Pattern7");
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Pattern8");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Pattern9");
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
