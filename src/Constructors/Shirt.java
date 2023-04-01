package Constructors;

public class Shirt {
    Shirt() {
        System.out.println("inside Constructor !");
    }
    public static String color ;
    public static char size ;
    public static void putOn() { System.out.println("Shirt is On !");}
    public static void takeOff() {System.out.println("Shirt is Off !");}
    public static void setColor(String newColor) {color = newColor ;}
    public static void setSize(char newSize) {size = newSize;}


}
