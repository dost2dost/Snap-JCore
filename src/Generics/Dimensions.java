package Generics;

/**
 * Created by DostM on 7/15/2020.
 */
public class Dimensions {

    public static void main(String args[]){
    Test<String,Integer> obj=new Test<>("hello",10);
    Test<Short,Double> obj2=new Test<Short,Double>((short) 32766,56789.52);
    obj2.print();
    }

}
