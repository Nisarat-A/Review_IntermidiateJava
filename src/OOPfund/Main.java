package OOPfund;

public class Main {
    public static void main(String[] args) {
        Pen p  = new Pen();
        System.out.println(p.color);
        System.out.println(p.point);
        System.out.println(p.type);
        System.out.println(p.clicked);
       p.click();
        System.out.println(p.clicked);

        Headphone h = new Headphone();
        System.out.println(h.color);
        System.out.println(h.type);
        System.out.println(h.controls);
        h.powerOn();
        System.out.println(h.power);
        h.powerOff();
        System.out.println(h.power);
        h.VolumeUp();
        System.out.println(h.volume);
        h.VolumeDown();
        System.out.println(h.volume);

    }
}
