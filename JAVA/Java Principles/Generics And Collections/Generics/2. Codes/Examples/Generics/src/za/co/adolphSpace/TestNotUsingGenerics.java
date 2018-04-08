package za.co.adolphSpace;

/**
 * Created by TypeAR on 2/25/2018.
 */

// A Simple Java program to demonstrate that NOT using
// generics can cause run time exceptions
import java.util.*;

class TestNotUsingGenerics
{
    public static void main(String[] args)
    {
        // Creatinga an ArrayList without any type specified
        ArrayList al = new ArrayList();

        al.add("adolph");
        al.add("randela");
        al.add(26); // Compiler allows this

        String s1 = (String)al.get(0);
        String s2 = (String)al.get(1);

        // Causes Runtime Exception
        String s3 = (String)al.get(2);
    }
}