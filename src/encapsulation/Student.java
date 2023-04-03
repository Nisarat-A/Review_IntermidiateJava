package encapsulation;

public class Student {
    String name ;
    int age ;

    public void setName(String newName){
        name = newName;
    }
    public String getName () {return name;}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
