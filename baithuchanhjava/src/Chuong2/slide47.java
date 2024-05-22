package Chuong2;
import java.util.Scanner;

public class slide47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("nhập số nguyên: ");
        while (true) {
            int num = scanner.nextInt();
            sum += num;

            if (sum > 100) {
                break;
            }

            System.out.println("nhập số nguyên khác: ");
        }

        System.out.println("tổng của các số đã nhập vào là: " + sum);
    }
}