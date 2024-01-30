import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so thu nhat : ");
        double a = sc.nextDouble();
        System.out.print("nhap vao so thu hai : ");
        double b = sc.nextDouble();
        double tong = a + b;
        double hieu = a - b;
        double tich = a * b;
        double thuong = 0;
        double chiaDu = 0;
        if (b != 0) {
            thuong = a / b;
            chiadu = a % b;
        } else {
            System.out.println("khong the chia cho 0");
        }
        System.out.println("tong :" + tong);
        System.out.println("hieu :" + hieu);
        System.out.println("tich :" + tich);
        if (b != 0) {
            System.out.println("thuong :" + thuong);
            System.out.println("chia lay phan du :" + chiadu);
        }
        if (a > b) {
            System.out.println(a + " lon hon " + b);
        } else if (a < b) {
            System.out.println(a + " be hon " + b);
        } else {
            System.out.println(" hai so bang nhau");
        }

    }
}