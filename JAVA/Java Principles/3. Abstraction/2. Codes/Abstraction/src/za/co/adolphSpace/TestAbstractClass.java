package za.co.adolphSpace;

public class TestAbstractClass extends myAbstractClass {

    void whoIsChrispie() {
        System.out.print("A good guy :-)");
    }


    public static void main(String[] args) {
        TestAbstractClass testAbstractClass  =  new TestAbstractClass();
        testAbstractClass.whoIsChrispie();
    }
}
