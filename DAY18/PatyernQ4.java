public class Q4 {
    public static void main(String[] args) {
        char ch ='A';
        for (int line = 1; line <= 4; line++) {
            for (int alpha = 1; alpha<=line; alpha++) {
                System.out.print(ch);
                ch++; 
            }
            System.err.println();
        }
    }
}
