package Constructors;

public class main {
    public static void main(String[] args) {
        Shirt s = new Shirt() ;
        s.setColor("White");
        s.setSize('L');

        s.putOn();
        System.out.println(s.color);
        System.out.println(s.size);
    }
}
