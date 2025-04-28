import java.util.Scanner;
class Mobile{
    String name;
    int cost;
    int model;
} 
public class Mobiles {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Mobile m1=new Mobile();
        m1.name="Samsung";
        m1.cost=15000;
        m1.model=15;
        Mobile m2=new Mobile();
        m2.name="Redmi";
        m2.cost=12000;
        m2.model=12;
        Mobile m3=new Mobile();
        m3.name="Realme";
        m3.cost=12500;
        m3.model=13;
        Mobile m4=new Mobile();
        m4.name="Oppo";
        m4.cost=16000;
        m4.model=10;

        Mobile mobiles[]=new Mobile[4];
        mobiles[0]=m1;
        mobiles[1]=m2;
        mobiles[2]=m3;
        mobiles[3]=m4;

        for(int i=0;i<mobiles.length;i++){
            System.out.println(mobiles[i].name + ":" +mobiles[i].model + "::" + mobiles[i].cost);
        }

        System.out.println("Enter the budget");
        int budget=sc.nextInt();
        int c=0;
        for(int i=0;i<mobiles.length;i++){
            if(mobiles[i].cost<=budget){
                c+=1;
                System.out.println(mobiles[i].name +"::"+mobiles[i].model +":"+mobiles[i].cost);
            }
        }
        if(c==0){System.out.println("No mobile available in this budget");}

        System.out.println("Enter the name of the mobile");
        String mobile_name=sc.next();
        int d=0;
        for(int i=0;i<mobiles.length;i++){
            if(mobiles[i].name.equals(mobile_name)){
                d+=1;
                System.out.println(mobiles[i].name +"::"+mobiles[i].model +":"+mobiles[i].cost);
            }
        }
        if(d==0){
            System.out.println("There is no mobile of your preference available right now");
        }
    }
}