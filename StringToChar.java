//chương trình chuyển đổi từ String sang Char trong java
//chúng ta có thể chuyển đổi 1 String thành Char bằng cách use phương thức CharAt() của lớp String
public class StringToChar
{
    public static void main(String[] args) {
        //Using charAt() method
        String str ="Hello";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            System.out.println("ki tu o vi tri " + i + "la: " + ch);
        }
    }
}