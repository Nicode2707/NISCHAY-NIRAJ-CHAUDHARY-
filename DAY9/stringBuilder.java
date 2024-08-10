public class strinbuilder {
   
    public static void main(String[] args) {
     StringBuilder sb = new StringBuilder("");
     for(char ch = 'a' ;ch<='z'; ch++) {
          sb.append(ch);
          //abcdefhijklmnopqrstuvwxyz
          //0(26)
          //0(26 *n^2)
     }  
     System.out.print(sb);
    }
}
