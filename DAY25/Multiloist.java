import java.util.ArrayList;

public class multilist {
   public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    mainlist.add(list);

    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(3);
    list2.add(4);
    mainlist.add(list2);

    for(int i=0;i<mainlist.size();i++){
        ArrayList<Integer> currentlist = mainlist.get(i);
        for(int j=0; j<currentlist.size();j++){
            System.out.println(currentlist.get(j) + " ");
        }
        System.out.println();
    }
    System.out.println(mainlist);   }
}
