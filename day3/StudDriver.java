import java.util.Scanner;
import java.util.ArrayList;

public class StudDriver{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the no of students");
        int n= scan.nextInt();

        int c=0;
     Stud student;
     String name;
     String batch;
     int roll_no;
     int age;

    
     ArrayList<Stud> studentList =new ArrayList<>();
     for(int i=0;i<n;i++){
            System.out.println();
            System.out.println("enter the student "+i+1+"Details:");
            System.out.println("enter the name");
            scan.nextLine();
            name=scan.nextLine();
            System.out.println("Enter the rollno");
            roll_no=scan.nextInt();
            System.out.println("Enter the batch");
            scan.nextLine();
            batch=scan.nextLine();
            System.out.println("Enter the age");
            age=scan.nextInt();
            //student=new Student(age,roll_no,name,batch);
            studentList.add(stud);
     boolean check=false;
        try{
            check=student.checkAge();
        } catch(StudUnderAgeException sue){
            System.err.println(sue);
        } finally{
            if(check)
            {
             stud[c++]=student;   
            }
        }
        }

        for(int i=0;i<c;i++){

            System.out.println();
            System.out.println("student"+(i+1)+"details");
            stud.get(i).print();

        }



    }
}
