package za.co.adolphSpace;

/**
 * Created by TypeAR on 2/24/2018.
 */


public class TestCalculator extends Calculator{

    public static void main(String[] args) {
        int myNumber1 = 10;
        int myNumber2 = 5;

        Calculator calculator = new Calculator();
        calculator.addition(myNumber1, myNumber2);
        calculator.Subtraction(myNumber1,myNumber2);

    }
}
