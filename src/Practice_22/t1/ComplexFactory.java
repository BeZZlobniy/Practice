package Practice_22.t1;


public class ComplexFactory implements ComplexAbstractFactory {

    @Override
    public Complex createComplex() {
        return new Complex(1, 2);
    }

    @Override
    public Complex createComplex(double real, double image) {
        return new Complex(real, image);
    }
}
