package practice_6;

public class FurnitureShop {
    public static void main(String[] args) {
        Chair chair = new Chair("������", 50.0, 4);
        Table table = new Table("������", 100.0, 6);

        chair.assemble(); // ������� "�������� ���� �� ��������� ������ � ����� 50.0 � 4 �������"
        table.assemble(); // ������� "�������� ���� �� ��������� ������ � ����� 100.0 � 6 ����������� �������"
    }
}

