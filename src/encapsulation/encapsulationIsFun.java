package encapsulation;

public class encapsulationIsFun {
    public static void main(String[] args) {
        Student s = new Student() ;
        s.setName("Suzie");
        s.setAge(18);
        System.out.println(s.age+" "+s.name);
    }
}
