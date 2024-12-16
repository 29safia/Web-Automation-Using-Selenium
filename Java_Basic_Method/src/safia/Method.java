package safia;

public class Method {

    /*static int x = 30;
    int y = 20;

    public static void case1(){
        Method obj = new Method();
        System.out.println(x+obj.y);
    }

    public void case2(){
        System.out.println(x+y);
    }*/

    public static void sum(int a, int b) {
        System.out.println("Sum :" +(a + b));
    }

    public static void sum(int a, int b, int c) {
        System.out.println("Sum :"+(a + b + c));
    }

    public static void mul(int a, int b, int c, int d) {
        System.out.println("Mul :"+(a * b * c * d));
    }
    public static void main(String[] args) {

        sum (10,20);
        sum (30,40);
        sum (50,60);
        sum (70,80,100);


        Method obj = new Method();
        obj.mul (10,20,30,40);


    }
}
