//chương trình chuyển hoa thành chữ thường Java bằng mã ASCII
//sử dụng class Scanner để nhận data từ bàn phím
import java.util.Scanner;
public class LowerCase
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;//khai báo một chuỗi có tên message
        System.out.println("\n\nNhap vao chuoi can chuyen doi: ");
        message = sc.nextLine();
        /*
         Khai báo một mảng, sau đó sử dụng phương thức toCharArray()
         để chuyển đổi message(biến message đang ở kiểu data chuỗi) thành một mảng kiểu char(kiểu kí tự)
         */
        char[] charArray = message.toCharArray();
        //sử dụng vòng lặp for để duyệt các phần tử trong charArray
        for(int i = 0;i<charArray.length;i++)
        {
            if(charArray[i]>=65 && charArray[i]<=90)
            {
                charArray[i]+=32;
            }
        }
        //chuyển đổi mảng char thành string
        message = String.valueOf(charArray);
        System.out.println("Chuoi sau khi doi: "+message);
    }
}