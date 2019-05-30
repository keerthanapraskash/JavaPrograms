public class  ExampleDriver implements Example,Example1{
    public void sayHello(){
        System.out.println("Hello");

    }
    public void saySomething(String something){
        System.out.println(something);

    }
    public void sayGoodbye(){
        System.out.println("Good bye");
    }

    public static void main(String[] args){
        ExampleDriver d= new ExampleDriver();
        d.sayHello();
        d.sayGoodbye();
        d.saySomething("something");
    }
    
}