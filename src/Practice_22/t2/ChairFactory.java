package Practice_22.t2;

public class ChairFactory implements AbstractChairFactory {

    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(10000);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair(98.0);
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
