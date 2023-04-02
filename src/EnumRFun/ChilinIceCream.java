package EnumRFun;

public class ChilinIceCream {
    enum flavor {ChocChip , Matcha , Vanila } ;
    public static void getVanila(){
        System.out.println(flavor.Vanila);
    }


    public static void main(String[] args) {
        flavor f= flavor.Matcha ;
        if (f==flavor.Vanila) {
            System.out.println( "i dnt like");
        }else System.out.println("Nan");;
    }
}
