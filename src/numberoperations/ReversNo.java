package numberoperations;

/**
 * Created by DostM on 8/15/2020.
 */
public class ReversNo {

    public void reversNo(int a){
        int revers=0,remainder=0,number;
        number=a;
        while (number>=1){
            remainder=number%10;
            revers=(revers*10)+remainder;
            number=number/10;

        }
        System.out.println("Revers no is "+revers);

    }
}
