class Palindromee{

   static boolean Palindrome(String word){
        char[] chararray = word.toCharArray();
        int start = 0;
        int end = chararray.length-1;
        
        while(start < end){
            if(chararray[start] != chararray[end] ){
                return false;
            }
            start++;
            end--;
        }
        return true ;
    }
    public static void main(String[] args) {
        String word = args[0];
        System.out.println(Palindrome(word));
    }
}