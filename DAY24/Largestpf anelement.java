import java.util.ArrayList;

public class Maxm {
   public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(5);
    list.add(155);
    list.add(25);
    list.add(35);
    list.add(45);
    list.add(55);

    System.out.println(list);

 int largest = Integer.MIN_VALUE;
  for(int i = 0; i<list.size()-1;i++){
    if(list.get(i) > largest){
        largest = list.get(i);
    }
  }

  System.out.println("max element = " + largest);
   } 
}

