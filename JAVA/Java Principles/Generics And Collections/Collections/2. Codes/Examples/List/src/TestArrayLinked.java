import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayLinked {

    public static void main(String[] args) {

        List<String> al=new ArrayList<String>();//creating arraylist of string object
        al.add("one");//adding string object in arraylist
        al.add("two");
        al.add("three");
        al.add("four");

        List<String> al2=new LinkedList<String>();//creating linkedlist  of string objects
        al2.add("abc");//adding string object in linkedlist
        al2.add("def");
        al2.add("dcs");
        al2.add("health");

        System.out.println("arraylist: "+al);
        System.out.println("linkedlist: "+al2);
    }
}
