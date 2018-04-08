import java.util.ArrayList;
import java.util.List;

/**
 * Created by TypeAR on 2/24/2018.
 */
public class chrispieVW extends VWCar{

    @Override
    public void carCondition() {
        System.out.println("Is in good condition");



        List<String> list1 = new ArrayList<String>(); // java 7 ? List<String> list1 = new ArrayList<>();
        list1.add("abc");
        //list1.add(new Integer(5)); //compiler error

        for(String str : list1){
            //no type casting needed, avoids ClassCastException
        }







    }
}
