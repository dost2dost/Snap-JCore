package ifelsbool;

/**
 * Created by DostM on 7/21/2020.
 */
public class Swithching {
    String day="";
    public String Day(int no){
        switch (no){
            case 1:
             day="Monday";
                break;
            case 2:
             day="Tuesday";
                break;
            case 3:
                day="Wednesday";
                break;
            case 4:
                day="Thursday";
                break;
            case 5:
                day="Friday";
                break;
            case 6:
                day="Saturday";
                break;
            case 7:
                day="Suday-Week day";
                break;
            default:
                System.out.println("Looking for week ends");
        }
        return day;
    }
}
