package jbasicprograms;

/**
 * Created by DostM on 8/15/2020.
 */
//factorial is the product of all decending no
public class FindFactorial {
    int fact=1;
    public int findFact(int a){
        for(int i=1;i<=a;i++){
            fact=(fact*i);
        }
        return fact;
    }
    public int recurFact(int a){
        if(a==0){
            return 1;
        }else{
            return (a*recurFact(a-1));
        }

    }
}
