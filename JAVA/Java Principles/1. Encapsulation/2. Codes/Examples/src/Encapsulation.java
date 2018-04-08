/**
 * Created by TypeAR on 2/24/2018.
 */
public class Encapsulation {

    private int myNumber1;
    private int myNumber2;

    public void setMyNumber1(int myNumber1) {
        this.myNumber1 = myNumber1;
    }
    public void setMyNumber2(int myNumber2) {
        this.myNumber2 = myNumber2;
    }
    public int addTwoNumbers(){
        return myNumber1 + myNumber2;
    }

}
