package operators;

/**
 * Created by DostM on 7/19/2020.
 */
public class BinaryOperator {
    public int[] swapBinary(int x,int y){
        int a[]=new int[3];
        x=x^y;
        y=x^y;
        x=x^y;
        a[0]=x;
        a[1]=y;
        return a;


    }
    public String changeBase(String s,int base){
        return Integer.toString(Integer.parseInt(s,base));
    }
    public String changeBase(String s,int fromBase,int toBase){
        return Integer.toString(Integer.parseInt(s,fromBase),toBase);

    }
    public String evenOdd(int x){
        if((x&1)==0){
            return x+"is Even ";
        }else {
            return x+" is odd ";
        }
    }
    public boolean checkPowerof2(int x){
        if((x&x-1)==0){
            return true;
        }else
            return false;
    }

}
