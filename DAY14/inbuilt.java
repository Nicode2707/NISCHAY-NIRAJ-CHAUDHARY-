import java.util.Arrays;

public class inbuiltsort {
    
    public static void printarr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
     System.out.println();
     }
        public static void main(String[] args) {
             int arr[] = { 5,4,1,2,3,};
             Arrays.sort(arr);
             printarr(arr);
        }
    }

