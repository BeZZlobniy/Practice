package Practice_16;

public class TestExceptions {
    public static void main(String[] args) {
        Exception1 exception1 = new Exception1();
        exception1.exceptionDemo1();
        exception1.exceptionDemo2();

        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo2();

        Exception3 exception = new Exception3();
        exception.exceptionDemo();
    }
}
