class B extends A{
    public void saySomething(){
        System.out.println("HELLO "+hi);

    }
    public static void main(String[] args){
        B b=new B();
        b.saySomething();
        b.print();
    }
}