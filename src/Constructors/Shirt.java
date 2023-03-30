package Constructors;

public class Shirt {
    Shirt() {
        System.out.println("inside Constructor !");
    }
    private String color ;
    private char size ;
    public static void putOn() { System.out.println("Shirt is On !");}
    public static void takeOff() {
        System.out.println("Shirt is Off !");
    }
}
