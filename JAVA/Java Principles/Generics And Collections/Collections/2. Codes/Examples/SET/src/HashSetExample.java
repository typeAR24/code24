import java.util.HashSet;

/**
 * Created by TypeAR on 2/25/2018.
 */
public class HashSetExample {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hset = new HashSet<String>();


        //note "AA" entry is added many times so : HashSet does not allow duplicate elements that means you can not store duplicate values in HashSet.


        //add elements to HashSet
        hset.add("AA");
        hset.add("AA");
        hset.add("AA");
        hset.add("BB");
        hset.add("CC");
        hset.add("DD");

        // Displaying HashSet elements
        System.out.println("HashSet contains: ");
        for(String temp : hset){
            System.out.println(temp);
        }
    }
}
