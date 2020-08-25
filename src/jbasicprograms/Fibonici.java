package jbasicprograms;

/**
 * Created by DostM on 8/15/2020.
 */
public class Fibonici {

    int n1=0,n2=1,n3;
    public void fibonacciNonRecursive(int n)
    {
        int n1=0,n2=1,n3;
        System.out.print(n1+""+n2);
        for(int i=2;i<n;i++){
            n3=n1+n2;
        System.out.print(n3);
        n1=n2;
        n2=n3;
    }
    }
    public void fibonacciRecursive(int n){
       if(n>0){
           n3=n1+n2;
           System.out.print(n3);
           n1=n2;
           n2=n3;
           fibonacciRecursive(n-1);
       }
    }
}
