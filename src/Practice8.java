import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        checkLeapYear();
    }
    public static void checkLeapYear(){
        System.out.println("Nhap so ngay ban muon kiem tra");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0){
            System.out.printf("Nam %d la nam nhuan",year);
        }
        else if (year % 100 == 0 && year % 400 != 0){
            System.out.printf("Nam %d la nam nhuan",year);
        }
        else if (year % 400 == 0){
            System.out.printf("Nam %d la nam nhuan",year);
        }
        else {
            System.out.printf("Nam %d khong phai la nam nhuan",year);
        }
    }
}
