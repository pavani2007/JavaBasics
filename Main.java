import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numbers[]=new int[4];
        numbers[0]=20;
        numbers[1]=23;
        numbers[2]=74;
        numbers[3]=12;
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
    }

}
