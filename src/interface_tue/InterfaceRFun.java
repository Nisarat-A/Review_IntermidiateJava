package interface_tue;
interface waterBottle{
    String color = "Blue" ;
    void fillUp();
    void pourOut();
}
public class InterfaceRFun implements waterBottle{
    public static void main(String[] args) {
        System.out.println(color);
        InterfaceRFun i = new InterfaceRFun();
        i.fillUp();

    }
    @Override
    public void fillUp() {
        System.out.println("Filled");
    }

    @Override
    public void pourOut() {
        System.out.println();
    }
}
