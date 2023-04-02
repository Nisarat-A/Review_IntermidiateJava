package ThisExample;

public class thisExample {
    int a,b ;
    public static void setData(int a , int b ){ a=a; b=b; }

    public static void main(String[] args) {
        Fun f = new Fun() ;
        setData(4,5);
        System.out.println(f.a);
        System.out.println(f.b);

    }

}
