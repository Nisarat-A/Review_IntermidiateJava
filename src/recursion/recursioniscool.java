package recursion;
public class recursioniscool {
    public static void main(String[] args) {
      /*  sayhi(5);*/
        countBackwards(15);
    }
    /*public static  void sayhi(int n) { //needbase case
       if(n==0){System.out.println("Done");}
       else{
        System.out.println("Hi");
       n--;
       sayhi(n);}
    }*/
    public static void countBackwards(int n){
        if(n == 0){
            System.out.println("Done");
        }
        else {
            System.out.println(n);
            n--;
            countBackwards(n);}
    }
}
