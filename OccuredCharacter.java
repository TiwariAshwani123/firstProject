// How many no. of times the characters of a String is occured

import java.util.HashMap;
import java.util.Map;

class OccuredCharacter{
    public static void main(String[] args) {
        String word = args[0];
        
        System.out.println("The Word is : " + word);

        char[] arr = word.toCharArray();

        Map<Character , Integer> map = new HashMap<>();

        for(int i = 0 ; i<arr.length ; i++ ){
            if( !map.containsKey(arr[i])) {
                map.put(arr[i] , 1);
            }

            else{
                int count = map.get(arr[i]);
                map.put(arr[i] , count + 1);
            }
        }

        System.out.println(map);
    }
}