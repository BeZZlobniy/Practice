package Practice_22.t1;


public class Test {
    public static void main(String[] args){
        ComplexFactory fac = new ComplexFactory();
        Complex c1 = fac.createComplex();
        Complex c2 = fac.createComplex(2, 3);
        System.out.println(c1);
        System.out.println(c2);
    }
}
