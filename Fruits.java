import org.w3c.dom.ls.LSOutput;

public class Fruits {

    String taste = "sweet";

    public  void shape(){
        System.out.println("Round");
    }
    public static void use(){
        System.out.println("Healthy");
    }
}
class Apple extends Fruits{
    String colour = "Red";

    public void shape(){
        System.out.println("square");
    }
}

class call{
    public static void main(String[] args) {
        Apple one = new Apple();
        System.out.println(one.colour);
        System.out.println(one.taste);
        one.shape();
        one.use();
    }

}
