package AbstractionTutorial ;
abstract class dog{
    String breed ;
    public void barked(){
        System.out.println("barked");}
    public abstract  void poop();
        }
        class shiba extends dog {
    public void poop(){
        System.out.println("poop");
    }}
public class Abstraction {
    public static void main(String[] args) {
        shiba s = new shiba();

        s.breed = "shiba inu";
        System.out.println(s.breed);
    }
}
