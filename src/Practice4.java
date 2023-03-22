import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        calRectangleArea();
    }
    public static void calRectangleArea(){
        float width, height, area;
        Scanner myInput = new Scanner(System.in);
        System.out.println("Nhap chieu rong");
        width = myInput.nextFloat();
        System.out.println("nhap chieu cao");
        height = myInput.nextFloat();
        area = width * height;
        System.out.println("Dien tich la " + area);
    }
}
