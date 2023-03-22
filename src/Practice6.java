import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        checkTotalDaysInMonth();
    }
    public static void checkTotalDaysInMonth(){
        System.out.println("Nhap thang ma ban muon kiem tra:");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month){
            case 2 -> daysInMonth = "28 hoac 29";
            case 1,3,5,7 -> daysInMonth = "31";
            case 4,6,8,10,12 -> daysInMonth = "30";
            default -> daysInMonth = "";
        }
        if (!daysInMonth.equals("")) {
            System.out.printf("Thang %d co %s ngay!", month, daysInMonth);
        }
        else {
            System.out.print("Khong co thang nay");
        }
    }
}

// equals() để so sánh tham trị (primitive value)
// ==, != để so sánh tham chiếu (reference value)