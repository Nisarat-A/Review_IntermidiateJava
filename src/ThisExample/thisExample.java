package ThisExample;

public class thisExample {
    int a,b ;
    public void setData(int a , int b ){
        this.a =a; this.b=b; }

    public static void main(String[] args) {

       thisExample t = new thisExample() ;
       t.setData(4,5);
        System.out.println(t.a);
        System.out.println(t.b);

    }

}
