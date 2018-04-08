package za.co.adolphSpace;


// base class
public class Calculator {

    int answer;

    public void addition(int x, int y) {
        answer = x + y;
        System.out.println("The sum of the given numbers:"+answer);
    }

    public void Subtraction(int x, int y) {
        answer = x - y;
        System.out.println("The difference between the given numbers:"+answer);
    }

}
