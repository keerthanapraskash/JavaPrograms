public class Stud{

int age;
int roll_no;
String name;
String batch;



public Stud(int age,int roll_no, String name, String batch){

this.age=age;
this.roll_no=roll_no;
this.name=name;
this.batch=batch;

}


public boolean checkAge() throws StudUnderAgeException{
    if(age>=18){
        return true;
        }else{
            throw new StudUnderAgeException();
            
        }
}



public void print(){

System.out.println("name: " +name);
System.out.println("Rollno: " +roll_no);
System.out.println("batch: " +batch);
System.out.println("age: " +age);
}



}