import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào một số nguyên từ 1 - 12: ");
        int monthNumber = scanner.nextInt();

        switch(monthNumber) {
            case 1:
                System.out.println("tháng: tháng một");
                break;
            case 2:
                System.out.println("tháng: tháng hai");
                break;
            case 3:
                System.out.println("tháng: tháng ba");
                break;
            case 4:
                System.out.println("tháng: tháng tư");
                break;
            case 5:
                System.out.println("tháng: tháng năm");
                break;
            case 6:
                System.out.println("tháng: tháng sáu");
                break;
            case 7:
                System.out.println("tháng: tháng bảy");
                break;
            case 8:
                System.out.println("tháng: tháng tám");
                break;
            case 9:
                System.out.println("tháng: tháng chín");
                break;
            case 10:
                System.out.println("tháng: tháng mười");
                break;
            case 11:
                System.out.println("tháng: tháng mười một");
                break;
            case 12:
                System.out.println("tháng: tháng mười hai");
                break;
            default:
                System.out.println("nhập vào không hợp lệ. vui lòng nhập một số từ 1 đến 12.");
        }

        scanner.close();
    }
}