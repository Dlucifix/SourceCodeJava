//chương trình chuyển chữ thành chữ hoa trong java sử dụng mã ASCII
import java.util.Scanner;
public class toASCII
{
    public static void main(String[] args) {
        //sử dụng class Scanner để nhận data từ bàn phím
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("\n\nNhap vao chuoi can in hoa: ");
        message = sc.nextLine();
        /*
         Khai báo một mảng, sau đó sử dụng phương thức toCharArray()
         để chuyển đổi message thành một mảng kiểu char
         */
        char[] charArray = message.toCharArray();
        //sử dụng vòng lặp for để duyệt các phần tử trong charArray
        for(int i=0;i<charArray.length;i++)
        {
            if(charArray[i]>=97 && charArray[i]<=122)
            {
                charArray[i] -=32;
            }
        }
        //chuyển đổi mảng char thành String
        message = String.valueOf(charArray);
        System.out.println("Chuoi sau khi doi: \n"+message);
    }
}