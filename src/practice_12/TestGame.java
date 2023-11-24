package practice_12;

public class TestGame {
    public TestGame() {
    }

    public static void main(String[] args) {
        System.out.println((new GameDequeue("13579", "24680")).play());
        System.out.println((new GameDequeue("98765", "43210")).play());
        System.out.println((new GameDequeue("13029", "42685")).play());
        System.out.println("\n");
        System.out.println((new GameStack("13579", "24680")).play());
        System.out.println((new GameStack("98765", "43210")).play());
        System.out.println((new GameStack("13029", "42685")).play());
        System.out.println("\n");
    }
}

