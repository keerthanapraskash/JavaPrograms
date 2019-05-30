public class IntegerDriver{
    public static void main(String[] args){
        String name="125";
        int k=Integer.parseInt(name);
        k=k+1;
        System.out.println(k);

name="10.5";
double l=Double.parseDouble(name);
l=l+0.2;
System.out.println(l);


String binaryk=Integer.toBinaryString(k);
System.out.println(binaryk);

//System.out.println(Integer.parseInt("100"))

    }
}