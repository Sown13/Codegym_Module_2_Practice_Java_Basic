import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        readNumber();
    }
    public static void readNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so ban muon doc");
        int numberToRead = scanner.nextInt();
        String numRead, ones, tens, hundreds, thousands;
//        String [] generalRead = {"Billion","Million","Thousand","Hundred"};
        String [] tensRead = {"Ten","Twenty","Thirdty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String [] specialRead = {"twenty","eleven","twelve","thirdteen","fourteen","fifteen","sixteen","seventeen","eightteen","nineteen","ten"};
        String [] onesRead = {"","one","two","three","four","five","six","seven","eight","nine"};
        int length = String.valueOf(numberToRead).length();
        switch (length){
            case 3 -> {
                if (numberToRead % 100 == 0){
                    System.out.println(onesRead[numberToRead / 100] + "hundred");
                } else {
                    ones = onesRead[numberToRead % 100 % 10];
                    tens = tensRead[numberToRead % 100 / 10 - 1];
                    hundreds = onesRead[numberToRead / 100] + "hundred";
                    System.out.println(hundreds + tens + ones);
                }
            }
            case 2 -> {
                if ( numberToRead <= 20 ){
                    numRead = specialRead[numberToRead / 10];
                    System.out.println(numRead);
                } else {
                    ones = onesRead[numberToRead % 10];
                    tens = tensRead[numberToRead / 10];
                    System.out.println(tens + ones);
                }
            }
            case 1 -> System.out.println(onesRead[numberToRead]);
            default -> System.out.println("Tao khong doc duoc");
        }
    }
}
