package Practice_22.t2;

public class VictorianChair implements Chair{
    private int cost;

    public VictorianChair(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public void sit() {
        System.out.println("Этот стул слишком дорогой: "+ cost +  " чтобы на нем вот так сидеть");
    }
}
