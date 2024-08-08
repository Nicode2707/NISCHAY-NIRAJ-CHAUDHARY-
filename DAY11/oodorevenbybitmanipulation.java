public class Bitmanipulation {

    public static void OddorEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            //even number
            System.out.println("even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        OddorEven(3);
        OddorEven(2);
        OddorEven(4);
    }
}
