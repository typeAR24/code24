package za.co.adolphSpace;

import java.util.ArrayList;

/**
 * Created by TypeAR on 2/25/2018.
 */
public class NoIndividualtypeCast {

    public static void main(String[] args)
    {
        // Creating a an ArrayList with String specified
        ArrayList<String> al = new ArrayList<String> ();

        al.add("Adolph");
        al.add("Randela");

        // Typecasting is not needed
        String s1 = al.get(0);
        String s2 = al.get(1);
    }

}
