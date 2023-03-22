import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        System.out.println("Giải phương trình tuyến tính");
        System.out.println("Cho phương trình 'a * x + b = c', hãy nhập vào giá trị hằng số: ");
        LinearEquationResolver();
    }
    public static void LinearEquationResolver(){
        Scanner myConst = new Scanner(System.in);
        System.out.println("a: ");
        double a = myConst.nextDouble();
        System.out.println("b: ");
        double b = myConst.nextDouble();
        System.out.println("c: ");
        double c = myConst.nextDouble();
        if (a != 0){
            double x = (c - b) / a;
            System.out.println("Kết quả: x = " + x);
        } else if (b == c){
            System.out.println("x có thể là bất kỳ số nào");
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
