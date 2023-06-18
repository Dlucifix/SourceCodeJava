/*
tạo class Main để thực hiện gọi các phương thức vừa được gọi
Trong class này chúng ta sẽ yêu cầu nhập thông tin của 3 sinh 
viên, lưu data được nhập vào và hiển thị nó ra màn hình dưới dạng bảng
(sử dụng printf trong C)
*/

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        /*khởi tạo và nhập value cho các thuộc tính thuộc lớp SinhVien
        theo đề bài yêu cầu chúng ta sẽ thực hiện việc tạo 3 sinh viên
        vì vậy chúng ta sẽ đi tạo từng sinh viên
        */
        
        //------------------sinh viên 1----------------
        SinhVien sv1 = new SinhVien();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien 1: ");
        sv1.setMaSV(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ten sinh vien 1: ");
        sv1.setTenSV(sc.nextLine());
        System.out.println("Nhap diem li thuyet: ");
        sv1.setDiemTL(sc.nextFloat());
        System.out.println("Nhap diem thuc hanh: ");
        sv1.setDiemTH(sc.nextFloat());
        //---------sinh viên 2------------------
        SinhVien sv2 = new SinhVien();
        System.out.println("Nhap ma sinh vien 2: ");
        sv2.setMaSV(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ten sinh vien 2: ");
        sv2.setTenSV(sc.nextLine());
        System.out.println("Nhap diem li thuyet: ");
        sv2.setDiemTL(sc.nextFloat());
        System.out.println("Nhap diem thuc hanh: ");
        sv2.setDiemTH(sc.nextFloat());
        //-------------sinh viên 3
        SinhVien sv3 = new SinhVien();
        System.out.println("Nhap ma sinh vien 3: ");
        sv3.setMaSV(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ten sinh vien 3: ");
        sv3.setTenSV(sc.nextLine());
        System.out.println("Nhap diem li thuyet: ");
        sv3.setDiemTL(sc.nextFloat());
        System.out.println("Nhap diem thuc hanh: ");
        sv3.setDiemTH(sc.nextFloat());
        //in theo format
        System.out.printf("%6s %10s %20s %10s %10s \n", "Ma sinh vien", "Ho ten", "Diem lí thuyet", "Diem thuc hanh", "Diem trung binh");
        //gọi phương thức in đã được viết ở class SinhVien cho các sinh viên để hiển thị kết quả đã nhập
        sv1.inSV();
        sv2.inSV();
        sv3.inSV();
        System.out.println("----------------end--------------------");
    }
}
