public class Driver{
    public static void main(String[] args){

        Sample<Integer> SampleInteger=new Sample<>(65);
        System.out.println(SampleInteger);

        Sample<String> SampleString = new Sample<>("Hello");
        System.out.println(SampleString);

Example<Integer,String> ExampleString = new Example<>(4,"Hello");
        System.out.println(ExampleString);

    }
}