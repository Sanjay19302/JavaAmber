import java.util.*;
class Shap{
    public void printColor(String s){
        System.out.println("Color Of "+s+" Blue");
        System.out.println("Color Of "+s+" Is Blue");
    }
}
class Square extends Shape{
    public void area(double base,double height){
        System.out.println(0.5*base*height);
    }
}
public class Single_Inher
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Square t=new Square();
        String s=sc.next();
        double base=sc.nextDouble();
        double height=sc.nextDouble();
        t.printColor(s);
        t.area(base,height);
    }
}

