//chương trình in hoa ký tự đầu tiên của mỗi chữ trong chuỗi
import java.util.Scanner;
public class UpperCase
{
    public static void main(String[] args) 
    {
        //sử dụng class Scanner để nhận data từ bàn phím
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("\n\nNhap vao chuoi can in hoa ky tu dau: ");
        message = sc.nextLine();
        /*
         Khai báo một mảng, sau đó sử dụng phương thức toCharArray()
         để chuyển đổi message thành một mảng kiểu char
         */
        char[] charArray = message.toCharArray();
        boolean foundSpace = true;
        //sử dụng vòng lặp for để duyệt các phần tử trong charArray
        for(int i = 0;i<charArray.length;i++)
        {
            //nếu phần tử trong mảng là một chữ cái
            if(Character.isLetter(charArray[i]))
            {
                if(foundSpace)
                {
                //đổi chữ cái thành chữ in hoa bằng phương thức toUpperCase()
                charArray[i] = Character.toUpperCase(charArray[i]);
                foundSpace = false;
                }
            }
        else 
            {
            foundSpace = true;
            }
        }
    //chuyển đổi mảng char thành string
    messagedo = String.valueOf(charArray);
    System.out.println("Chuoi sau khi doi: \n" + message);
    }
}