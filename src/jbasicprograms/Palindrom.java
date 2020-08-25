package jbasicprograms;

/**
 * Created by DostM on 8/15/2020.
 */
// palidrom is no that is same after revers
public class Palindrom {
    int revers=0,no=0,temp=0,remainder=0;
    public void findPalidrom(int a){
        temp=a;
        while (a>0){
            remainder=a%10;
            revers=(revers*10)+remainder;
            a=a/10;
        }
        if(temp==revers){
            System.out.println("The no "+temp+" is a Palindrom");
        }else{
            System.out.println("The no"+temp+"is not palindrom !");
        }


    }
}
