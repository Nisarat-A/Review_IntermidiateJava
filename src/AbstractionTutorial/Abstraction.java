package AbstractionTutorial ;
abstract class dog{
    String breed ;
    public void bark(){
        System.out.println("Bark!");
    }
        }
        class shiba extends dog {}
public class Abstraction {
    public static void main(String[] args) {
        shiba s = new shiba();
        s.bark();
        s.breed = "shiba inu";
        System.out.println(s.breed);
    }
}
