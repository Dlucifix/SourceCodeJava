import java.util.Scanner;
public class LaiXuat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double P,R,T, laixuat;
        System.out.println("Nhap so tien goc: ");
        P = sc.nextDouble();
        System.out.println("Nhap lai xuat moi nam: ");
        R = sc.nextDouble();
        System.out.println("Nhap thoi gian: ");
        T = sc.nextDouble();
        laixuat = (P*R*T)/100;
        System.out.println("Lai xuat la: " + laixuat + " VND");
    }
}
