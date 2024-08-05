public class setithbit  {

    public static int setpos(int n,int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static void main(String[] args) {
    System.out.println(setpos(10, 2));
    }
}
