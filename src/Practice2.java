import java.util.Date;

public class Practice2 {
    public static void main(String[] agrs){
        showDate();
    }
    public static void showDate(){
        Date now = new Date();
        Date randomDate = new Date();
        System.out.println("Date now is:" + now);
        System.out.println("Try date:" + randomDate.getTime());
    }
}
