public class prefix {
    public static void maxsubarray(int numbers[]){
        int currentsum =0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];

        //calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];

        }

         for(int i=0;i<numbers.length;i++){
            int start =i;
            for(int j=i;j<numbers.length;j++){
                int end =j;
                currentsum = start == 0 ? prefix[end] : prefix[end] -prefix[start-1] ;
                if(maxsum<currentsum ){
                   maxsum = currentsum ;
                } 
            }
        }
        System.err.println( "max sub array " + maxsum );
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10}; 
        maxsubarray( numbers);
    }
}
