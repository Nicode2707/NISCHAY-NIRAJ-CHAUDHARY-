class Solution {
    public void reverseString(char[] s) {
        String reversed = "";

        for (int i = s.length - 1; i >= 0; i--) {
            reversed += s[i];
        }

        System.out.println("Reversed: " + reversed);
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        
        Solution solution = new Solution();
        System.out.println("Original: " + String.valueOf(s));
        solution.reverseString(s);
    }
}
