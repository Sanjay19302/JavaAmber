public class Inheritance {
    public static void main(String[] args) {
        eagel e = new eagel();
        System.out.println(e.legs);
        e.display();

        kili k = new kili();
        System.out.println(k.legs);
        k.display();

        parot p = new parot();
        System.out.println(p.legs);
        p.display();
    }
}

class bird{
    int legs = 2;
    public void display(){
        System.out.println("the great");
    }
}

class eagel extends bird{
    public void display(int a){
        System.out.println("the mass of whole world");
    }
}

class kili extends eagel{

}

class parot extends bird{

}
