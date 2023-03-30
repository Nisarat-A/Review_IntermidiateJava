package OOPfund;

public class Headphone {
    String type = "bluetooth" ;
    String [] controls = {"power","volume","skip","power","play/pause"};
    String color = "Red/Black" ;
    static  int volume =0 ;

    static boolean power = false ;
    public  static  void powerOn() {power = true;}
    public  static  void powerOff() {power = false;}
    public static void VolumeUp() {volume++;}
    public static void VolumeDown() {volume--;}


}
