import java.util.Scanner;

public class Bai_16 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\033[1;31m");
            System.out.println("Ngày đầu tiên Anh yêu Em <3");
            for (int i = 1; i <= 365; i++) {
                System.out.println("Ngày thứ "+i+" Anh yêu Em <3");
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\033[0m");
            System.out.println("Biết sao lại là 365 ngày không ?");
            System.out.print("Nhập 1 hoặc 0: ");
            int n = sc.nextInt();
            if (n == 1)
                System.out.println("Đúng như em nghĩ đó, vì anh yêu em quanh năm hihi!");
            else
                System.out.println("Bởi vì, anh yêu em trọn Một Năm!");
        }
    }
}