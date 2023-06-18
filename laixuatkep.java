import java.util.Scanner;
public class laixuatkep
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double P, R, n,t;
        System.out.println("Nhap so tien goc: ");
        P = sc.nextDouble();
        System.out.println("Nhap lai xuat hang nam: ");
        R = sc.nextDouble();
        System.out.println("Nhap thoi gian tien duoc dau tu: ");
        t = sc.nextDouble();
        n = 12;
        double laikep = P*Math.pow(1+(R/100)/n, n*t);
        System.out.println("Lai xuat kep la: " + laikep);
    }
}