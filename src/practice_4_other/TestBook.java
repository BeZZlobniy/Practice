package practice_4_other;

public class TestBook {
    public static void main(String[] args){
        Book book = new Book();
        book.setAuthor("������ ����");
        book.setTitle("������ �����: �������");
        book.setYear(1982);

        System.out.println("�����: " + book.getAuthor());
        System.out.println("��������: " + book.getTitle());
        System.out.println("��� ��������� "+ book.getYear());

        book.toString();
    }
}
