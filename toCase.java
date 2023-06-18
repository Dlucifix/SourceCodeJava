//chương trình dùng hàm toUpperCase chuyển chữ thường thành chữ hoa trong java
import java.util.Scanner;
public class toCase
{
    public static void main(String[] args) {
        //sử dụng class Scanner để nhận data từ bàn phím
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("\n\nNhap vao chuoi can in hoa: ");
        message = sc.nextLine();
        System.out.println("Chuoi sau khi in hoa: ");
        //sử dụng phương thức toUpperCase() để in hoa các kí tự trong chuỗi
        System.out.println(message.toUpperCase());
    }
}