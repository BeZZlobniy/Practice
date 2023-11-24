package Practice_18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        TaskGeneric<Double, Integer, String>TestClass = new TaskGeneric<>(7.7, 29, "Солнце красит нежным светом стены красного кремля");
        System.out.println(TestClass.toString());
        TestClass.getClassName();

        Integer[] array = {1, 2, 3, 4, 5};
        System.out.println('\n' + Arrays.toString(array) + '\n');
        MinMax<Integer> checkMinMax = new MinMax<>(array);
        System.out.println("Минимум: " + checkMinMax.min() + "\nМаксимум: " + checkMinMax.max());

        System.out.println(Calculator.div(4, 2));
        System.out.println(Calculator.mul(5, 7.7));
        System.out.println(Calculator.sub(45, 7.99));
        System.out.println(Calculator.sum(12, 11));

        System.out.println();
        Integer[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        Matrix<Integer> testMatrix = new Matrix<>(2, 3, matrix);
        testMatrix.show();
        System.out.println();
        testMatrix.trans();
        testMatrix.show();
    }
}

