package Chuong2;
import java.util.Scanner;

public class slide40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập vào số ngày trong tuần : ");
        int soNgay = sc.nextInt();
        
        switch(songay){
        case 0:System.out.println("chủ nhật");
                    break;
        case 1:System.out.println("thứ hai");
        break;
        case 2:System.out.println("thứ ba");
        break;
        case 3:System.out.println("thứ tư");
        break;
        case 4:System.out.println("thứ năm");
        break;
        case 5:System.out.println("thứ sáu");
        break;
        case 6:System.out.println("thứ bảy");
        break;
        default:System.out.println("số ngày trong tuần sai");
        }

    }
}