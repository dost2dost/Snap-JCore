import DataType.DataType;
import DataType.Dtype;

public class Main {

    private static String s;
    private static boolean b;
    private static int anInt;
    private static char aChar;
    private static short aShort;
    private static double aDouble;
    private static float aFloat;
    private static long aLong;

    public static void main(String[] args) {


        /**
         * Datatype check
         *
         */

        Dtype obj=new Dtype();
        s="hello testing ";
        anInt=105;
        aShort=15478;
        DataType dataType=Dtype.chkType(aShort);
        System.out.println(dataType.toString());



/**
 * Generics Implementations
 */
//    Test<String,Integer> obj=new Test<>("hello",10);
//    Test<Short,Double> obj2=new Test<Short,Double>((short) 32766,56789.52);
//    obj2.print();
   }
}
