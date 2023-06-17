import java.util.Scanner;
class TestNguyenAm
{
    public static void main(String[] args) {
        boolean isVowel = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ki tu can kiem tra: ");
        char ch = sc.next().charAt(0);
        sc.close();
        switch(ch)
        {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' : isVowel =true;
        }
        if(isVowel == true)
        {
            System.out.println(ch + " la nguyen am");
        }
        else 
        {
            if((ch>='a' && ch<='z')||(ch>='A'&&ch<='Z'))
                System.out.println(ch + " la phu am");
            else
                System.out.println(" khong nam trong bang chu cai!");
        }
    }
}