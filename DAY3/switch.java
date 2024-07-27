import java.util.Scanner;

public class switch{

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter the number  ");
        int day = Scanner.nextInt();
    
      switch (day) {
        case 1:
            System.out.println("Monday");
            break;
      
            case 2:
            System.out.println("Tuesday");
            break;

            case 3:
            System.out.println("Wednesday");
            break;

            case 4:
            System.out.println("Thursday");
            break;

            case 5:
            System.out.println("Friday");
            break;

            case 6:
            System.out.println("Saturday");
            break;
            
            case 7:
            System.out.println("Sunday");
            break;
        default:
        System.out.println("this is not correct input plz check your input");
            break;
      }

      Scanner.close();
    
    }


}
