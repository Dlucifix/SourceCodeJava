//chương trình chuyển chữ hoa thành chữ thường java bằng hàm toLowerCase()
//sử dụng Scanner để nhận data từ bàn phím
import java.util.Scanner;
public class toLower
{
    public static void main(String[] args) {
        //sử dụng class Scanner để nhận data từ bàn phím
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("\n\nNhap vao chuoi can in thuong: ");
        message = sc.nextLine();
        System.out.println("Chuoi sau khi in hoa: ");
        //sử dụng phương thức toLowerCase() để in thường các kí tự trong chuỗi
        System.out.println(message.toLowerCase());
    } 
}