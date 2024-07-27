import java.util.Scanner;

public class condq2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("enter the marks of maths");
        int math = Scanner.nextInt();

        System.out.println("enter the marks of che");
        int che = Scanner.nextInt();
        
        System.out.println("enter the marks of phys");
        int phys = Scanner.nextInt();

        float total = (math + che +phys)/3 ;

        System.out.println("the total marks ");
        System.out.println(total);
      
        float percentage = (total / 300) * 100;
       
        boolean isPass = (percentage >= 40) && (math >= 33) && (che >= 33) && (phys >= 33);


        if (isPass) {
            System.out.println("The student passes!");
        } else {
            System.out.println("The student fails.");
        }

      Scanner.close();
    }
}
