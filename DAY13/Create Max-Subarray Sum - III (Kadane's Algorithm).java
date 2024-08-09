public class kadnes {
    
    public static void kadane(int numbers[]){
        int maxsum = Integer.MIN_VALUE;
        int currentsum =0;

        for(int i=0; i<numbers.length;i++){
            currentsum = currentsum + numbers[i];
            if(currentsum<0){
                currentsum =0;
            }
            maxsum = Math.max(currentsum,maxsum);
        }

        System.out.println("our max subarray sum is " + maxsum);
    }

    public static void main(String[] args) {
       int numbers[] = {-2,-3,4,-2,1,5,-3}; 
       kadane( numbers);
    }  
}
