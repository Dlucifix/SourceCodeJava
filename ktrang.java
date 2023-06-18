//chương trinh xóa khoảng trắng của chuỗi

/*public class ktrang
{
    public static void main(String[] args) {
        String sentence = "d o  t a n  d a t";
        System.out.println("Chuoi ban dau la: " + sentence);
        sentence = sentence.replaceAll(" ","");
        System.out.println("Chuoi sau khi xoa khoang trang: " + sentence);
    }
}*/
//Chương trình xóa khoảng trắng của chuỗi được nhập từ bàn phím
import java.util.Scanner;
public class ktrang
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi can xoa: ");
        String sentence = sc.nextLine();
        System.out.println("Chuoi ban dau la: " + sentence);
        sentence = sentence.replaceAll(" ","");
        System.out.println("Chuoi sau khi xoa khoang trang: " + sentence);
    }
}