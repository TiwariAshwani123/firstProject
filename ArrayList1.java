import java.util.ArrayList;
import java.util.Collections;

class ArrayList1{
    public static void main(String[] args){
        ArrayList<Float> list = new ArrayList<>(); 
        list.add(200.4f);
        list.add(8.234f);
        list.add(73.234f);
        
        System.out.println(list);  //elements in square brackets : []

        Collections.sort(list);   // Collections is a class and have sort() method to sort the arraylist
        System.out.println(list);
    }
}