package practice1;

public class FactorialCalculator {
    // ����� ��� ���������� ���������� �����
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("��������� ��������� ������ ��� ��������������� �����.");
        }
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        // ������ ������������� ������ ��� ���������� ����������
        int number = 5; // ����� �� ������ �������� ����� ��� ���������� ����������
        long result = calculateFactorial(number);
        System.out.println("��������� ����� " + number + " ����� " + result);
    }
}