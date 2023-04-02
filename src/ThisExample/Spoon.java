package ThisExample;

public class Spoon {
    String food;
    char size;
    public void setData(String food,char size){

    }

    public static void main(String[] args) {
        Spoon s =new Spoon();
        s.setData("soup",'m');
        System.out.println(s.food);
        System.out.println(s.size);
    }
}
