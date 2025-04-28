import java.util.*;
public class Arrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][2];
        System.out.println("Enter the array values");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int n[]:arr){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
