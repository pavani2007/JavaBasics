import java.util.Scanner;
class Student{
    String name;
    int rollno;
    int marks;
    char section;
}
public class Students {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student Studentss[]=new Student[3];
        Studentss[0]=s1;
        Studentss[1]=s2;
        Studentss[2]=s3;
        for(int i=0;i<Studentss.length;i++){
            System.out.println("Enter the Student "+(i+1)+" details");
            Studentss[i].name=sc.next();
            Studentss[i].rollno=sc.nextInt();
            Studentss[i].marks=sc.nextInt();
            Studentss[i].section=sc.next().charAt(0);            
        }
        for(int i=0;i<Studentss.length;i++){
            System.out.println(Studentss[i].name +" :"+Studentss[i].rollno+"--"+Studentss[i].marks+"::"+Studentss[i].section);
        }
        System.out.println("Enter the name of the student to display marks");
        String student_name=sc.next();
        int c=0;
        for(int i=0;i<Studentss.length;i++){
            if(student_name.equals(Studentss[i].name)){
                c+=1;
                System.out.println("marks : "+Studentss[i].marks);
            }
        }
        if(c==0){System.out.println("Student with name "+ student_name+" does not found");}
    }
}