public class clearithbit  {

    public static int clearpos(int n,int i){
        int bitmask =  ~(1<<i);
        return n & bitmask;
    }
    public static void main(String[] args) {
    System.out.println(clearpos(10, 1));
    }
}
