package Practice_22.t2;

public class MagicChair implements Chair {
    private double magicEnergy;


    public MagicChair(double magicEnergy) {
        this.magicEnergy = magicEnergy;
    }

    @Override
    public void sit() {
        if(magicEnergy>=100){
            System.out.println("Вы достойны стать магом, таких как вы не было уже 10000 лет");
        }
        else{
            System.out.println("Это был розыгрыш! Как вам стул?");
        }
    }
}
