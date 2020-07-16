import DataType.DataType;
import DataType.Dtype;
import casting.NarrowCastinManualy;
import casting.WideningCastingAuto;
import casting.WrapperCasting;

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
         * casting widining and narrow
         */
        /*
        anInt=10;
        aDouble=20.5;
        NarrowCastinManualy narrowCastinManualy=new NarrowCastinManualy();
        WideningCastingAuto wideningCastingAuto=new WideningCastingAuto();
        WrapperCasting wrapperCasting=new WrapperCasting();
        System.out.println("WideCasting: "+wideningCastingAuto.getaDouble(anInt));
        System.out.println("Narrow Casting : "+ narrowCastinManualy.getInt(aDouble));
        System.out.println("WraperCasting : "+ wrapperCasting.getDouble(anInt)+" wrapercasting int:"+wrapperCasting.getInteger(aDouble));
                *********/
        /**
         * Datatype check
         *


        Dtype obj=new Dtype();
        s="hello testing ";
        anInt=105;
        aShort=15478;
        DataType dataType=Dtype.chkType(aShort);
        System.out.println(dataType.toString());
         */



/**
 * Generics Implementations
 */
//    Test<String,Integer> obj=new Test<>("hello",10);
//    Test<Short,Double> obj2=new Test<Short,Double>((short) 32766,56789.52);
//    obj2.print();
   }
}
