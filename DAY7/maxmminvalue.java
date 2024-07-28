public class arr3 {
    
    public static int getLaregest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i] ){
                smallest = numbers[i];
            }

        }
        System.out.println("smallest value is : " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = { 4,5,8,7,12};
        System.out.println("largest number is :" + getLaregest(numbers));
    }
}
