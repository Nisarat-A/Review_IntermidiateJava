package EnumRFun;
enum level  {LOW,MEDIUM,HIGH} ;
public class Enum {
   /* static String[] level = {"low","medium","high"} ;*/

    public static void main(String[] args) {
       /* System.out.println(level[0]);
        System.out.println(level[1]);
        System.out.println(level[2]);*/
        System.out.println(level.LOW);
        level l = level.LOW;
        System.out.println(l);

        switch (l){
            case LOW -> System.out.println("low level");
            case MEDIUM -> System.out.println("medium level");
            case HIGH -> System.out.println("high level");
        }
    }
}
