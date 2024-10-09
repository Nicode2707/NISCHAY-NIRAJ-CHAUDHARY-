import java.util.ArrayList;

public class Reverse {
   public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(5);
    list.add(155);
    list.add(25);
    list.add(35);
    list.add(45);
    list.add(55);
    
    System.out.println("Before reverse ");
    System.out.println(list);

    System.out.println(" After reverse");

    for(int i=list.size() - 1;i>=0;i--){
        System.out.print(list.get(i));
    }
   } 
}
