import java.io.Console;

public class slide35 {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.err.println("không thể truy cập bộ nhập, chương trình sẽ thoát");
            System.exit(1);
        }

        System.out.print("nhập số thứ nhất: ");
        int num1 = Integer.parseInt(console.readLine());

        System.out.print("nhập số thứ hai: ");
        int num2 = Integer.parseInt(console.readLine());

        int min = findMin(num1, num2);
        System.out.println("số nhỏ nhất trong hai số là: " + min);
    }

    private static int findMin(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}