import java.util.Scanner;

public class func {

     public static void printhello(){
        System.out.println("Niraj");
        System.out.println("ashish");
        System.out.println("kanhaiya");
        System.out.println("ekram");
        System.out.println("sakir");

     }

     public static void calculatesum(int a, int b){
        int sum = a + b;
        System.out.println("sum is " + sum);

     }
    public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
      int a = Scanner.nextInt();
      int b = Scanner.nextInt();
      calculatesum(a,b);
      Scanner.close();

    }
}
