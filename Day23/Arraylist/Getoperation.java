import java.util.ArrayList;

public class GET {
   public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(5);
    list.add(155);
    list.add(25);
    list.add(35);
    list.add(45);
    list.add(55);

    System.out.println(list);

    int element = list.get(2);
    System.out.println(element); 
   } 
}
