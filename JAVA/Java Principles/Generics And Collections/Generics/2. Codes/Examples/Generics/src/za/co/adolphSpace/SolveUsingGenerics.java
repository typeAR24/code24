package za.co.adolphSpace;

import java.util.ArrayList;

public class SolveUsingGenerics {

    public static void main(String[] args)
    {
        // Creating a an ArrayList with String specified
        ArrayList<String> al = new ArrayList<String> ();

        al.add("Adolph");
        al.add("Randela");

        // Now Compiler doesn't allow this
        al.add(26);

        String s1 = (String)al.get(0);
        String s2 = (String)al.get(1);
        String s3 = (String)al.get(2);
    }
}
