import java.util.Scanner;

public class arry {
    public static void main(String[] args) {
        
    
   int marks[] =new int[100]; 

   Scanner Scanner = new Scanner(System.in);

   marks[0] = Scanner.nextInt();
   marks[1] = Scanner.nextInt();
   marks[2] = Scanner.nextInt();

   System.out.println(" phy " + marks[0]);
   System.out.println(" che " + marks[1]);
   System.out.println(" maths " + marks[2]);

   marks[2]=100;
   System.out.println(" maths " + marks[2]);



   Scanner.close();
    }
}
