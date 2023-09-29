package practice_6;

public class FurnitureShop {
    public static void main(String[] args) {
        Chair chair = new Chair("дерево", 50.0, 4);
        Table table = new Table("стекло", 100.0, 6);

        chair.assemble(); // выводит "—обираем стул из материала дерево с ценой 50.0 и 4 ножками"
        table.assemble(); // выводит "—обираем стол из материала стекло с ценой 100.0 и 6 посадочными местами"
    }
}

