package jbasicprograms;

/**
 * Created by DostM on 8/16/2020.
 */
public class ArmastrongNo {
    int remainder,temp,sum;
    public boolean findArmStrongNo(int no){
    temp=no;
    while (no>0){
        remainder=no%10;
        no=no/10;
        sum=sum+(remainder*remainder*remainder);
    }
    return (temp==sum);
    }
}
