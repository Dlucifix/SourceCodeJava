import java.util.Scanner;
public class NguyenDu
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Nhap vao so nguyen thu nhat: ");
        num1 = sc.nextInt();
        System.out.println("Nhap vao so nguyen thu hai: ");
        num2 = sc.nextInt();
        int pdu = num1%num2;
        int pnguyen = num1/num2;
        System.out.println("Phan nguyen la: " + pnguyen +  " phan du la: " + pdu);
    }
}