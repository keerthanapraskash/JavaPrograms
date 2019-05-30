public class Driver{
    public static void display(fruit[] fruits){
        for(int i=0;i<fruits.length;i++){
            System.out.println(fruits[i]);
        }

    }
    public static void main(String args[]){
        fruit watermelon= new fruit("Round ","Green","Watermelon");
        System.out.println(watermelon);

        fruit[] fruits=new fruit[3];
        fruits[0]= new fruit("long","yellow","Banana");
        fruits[1]= watermelon;
        fruits[2]= new fruit("round","red","apple");
        Driver driver =new Driver();
        driver.display(fruits);

        ArrayList<Integer> integerList =new ArrayList<>();
        integerList.add(10);
         integerList.add(11);
         System.out.println(integerList);


        

    }
}