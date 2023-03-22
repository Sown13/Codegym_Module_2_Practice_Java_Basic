import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh chi so can nang BMI");
        calBMI();
    }
    public static void calBMI(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap can nang cua ban theo don vi kg");
        double weight = scanner.nextDouble();
        System.out.println("Nhap chieu cao cua ban theo don vi m");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("Chi so BMI cua ban la: %f\n", bmi);
        if (bmi < 18.5){
            System.out.println("Ban qua gay");
        } else if (bmi >= 18.5 && bmi < 25 ) {
            System.out.println("Ban rat can doi");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println(("Ban bi thua can"));
        } else if (bmi >= 30){
            System.out.println("Ban bi beo phi");
        }
    }
}
