public class fruit{
    private String shape;
    private String color;
   private String name;

   public fruit(){
       //default
   }
   public fruit(String Fruitshape, String color,String name){
       shape=Fruitshape;
       this.color=color;
       this.name=name;
   }
   public void setShape(String shape){
       this.shape=shape;
   }
    public String getShape(){
       return shape;
   }
   public String toString(){
       return shape+" "+" "+color+" "+name;
   }
   
   

}