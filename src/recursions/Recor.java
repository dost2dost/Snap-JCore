package recursions;

/**
 * Created by DostM on 7/22/2020.
 */
public class Recor {
    public void printNumber(int no){
        if(no==0){
            return;
        }else{
            System.out.println(no);
            printNumber(no-1);
        }
    }
    public int sum(int start,int end){
        if(end>start){
            return end +sum(start,end-1);
        }else{
            return end;
        }
    }
}
