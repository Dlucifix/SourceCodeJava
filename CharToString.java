//chương trình chuyển đổi từ char sang string trong java
/*
có 2 cách chuyển đổi từ char sang string:
1.sử dụng phương thức toString()
2.sủ dụng phương thức valueOf()
 */ 
public class CharToString
{
    public static void main(String[] args) {
        //Sử dụng cách 1: Dùng phương thức toString()
        char ch = 'a';
        String str = Character.toString(ch);
        System.out.println("Chuoi la: " + str);
        //Sủ dụng cách 2: Dùng phương thức valueOf()
        String str2 = String.valueOf(ch);
        System.out.println("Chuoi la: " + str2);
    }
}
