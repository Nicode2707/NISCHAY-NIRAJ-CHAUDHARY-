
import java.util.ArrayList;

public class Set {
   public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(5);
    list.add(155);
    list.add(25);
    list.add(35);
    list.add(45);
    list.add(55);

    System.out.println(list);

    list.set(2,10);
    System.out.println(list);
   } 
}


