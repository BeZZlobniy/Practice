package practice2;

public class HomeForCat {
    private Cat[] cats;
    private int count;

    public HomeForCat(int maxCount) {
        cats = new Cat[maxCount];
        count = 0;
    }

    public void addCat(Cat dog) {
        if (count < cats.length) {
            cats[count] = dog;
            count++;
        } else {
            System.out.println("Дом уже полон котиками");
        }
    }

    public void printCats() {
        for (int i = 0; i < count; i++) {
            System.out.println(cats[i]);
        }
    }

    public static void main(String[] args) {

        HomeForCat CatHome = new HomeForCat(3);

        Cat cat1 = new Cat("Чемпион", 2);
        Cat cat2 = new Cat("Барс", 7);
        Cat cat3 = new Cat("Феликс", 14);

        CatHome.addCat(cat1);
        CatHome.addCat(cat2);
        CatHome.addCat(cat3);
        CatHome.printCats();
    }
}
