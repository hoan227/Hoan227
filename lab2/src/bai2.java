import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.print(" nhap vao mot so : ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        if (a % 2 == 0) {
            System.out.println(a + " la so chan");
        } else {
            System.out.print(a + " la so le ");
        }
    }
}