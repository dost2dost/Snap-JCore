package maths;

/**
 * Created by DostM on 7/21/2020.
 */
public class MyMath {

    public int minNo(int a,int b){
        return Math.min(a,b);
    }
    public int maxNo(int a,int b){
        return Math.max(a,b);
    }
    // return absolut no
    public double absNo(int x){
        return Math.abs(x);
    }
    public double sqrtNo(int x){
        return Math.sqrt(x);
    }
    public int randomm(){
        return (int)Math.random()*101;
    }
    public double roundoff(double x){
        return Math.ceil(x);
    }
    public double cubeRoot(double d){
        return Math.cbrt(d);
    }
    public double naturalLog(double d){
        return Math.log(d);
    }
    public double tenLog(double d){
        return Math.log10(d);
    }
    public double squareRoot(double d){
        return Math.sqrt(d);
    }
    public String ternaryOperate(int time){
        String result=(time<8)?"Good morning !":"Good Evening !";
        return result;
    }

}
