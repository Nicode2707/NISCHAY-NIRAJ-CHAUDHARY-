import java.util.Scanner;

public class javaq2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

    int i=1;    
    System.out.println("enter the number ");  
    int n =  Scanner.nextInt();
    int sum = 0;
    while (i <= n) {
        sum+=i;
        i++;
    }
    System.out.println("sum is : " + sum);
    Scanner.close();
    }
}
