import java.util.HashMap;

/**
 * Created by TypeAR on 2/25/2018.
 */
public class HashmapExample {

    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        //HashMap does not allow duplicate keys however it allows to have duplicate values.

        //add elements to HashMap
        hmap.put(1, "AA");
        hmap.put(1, "BB");
        hmap.put(1, "AA");
        hmap.put(2, "BB");
        hmap.put(3, "CC");
        hmap.put(4, "DD");

        // Displaying HashMap elements
        System.out.println("HashMap contains: "+hmap);
    }
}
