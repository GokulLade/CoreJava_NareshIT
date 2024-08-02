/*
Access Modifier=> Control the access of class member.[variable,block,constructor,method]
 * private
 * default
 * protected
 * public
 */

public class StaticProgram {
    public static void main(String[] args) {

        StaticDemo sd = new StaticDemo();
        sd.showA();
        StaticDemo.showB();

    }

}

class StaticDemo {
    static int a = 10;
    public void showA() {
        int b = 12;
        System.out.println(a);
        System.out.println(b);
    }

    public static void showB() {
        int b = 20;
        System.out.println(a);
        System.out.println(b);

    }
}
