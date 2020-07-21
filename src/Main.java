import DataType.DataType;
import DataType.Dtype;
import casting.NarrowCastinManualy;
import casting.WideningCastingAuto;
import casting.WrapperCasting;
import ifelsbool.Swithching;
import jarrays.MyArrays;
import jstring.MyString;
import looping.Dowile;
import maths.MyMath;
import operators.BinaryOperator;
import recursions.Recor;

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

        rekors();
            //arrays();
        //looping();
        //switchtest();
       // myMath();

        //String
//        String s="Hello testing for dummy";
//        MyString myString=new MyString();
//        myString.replaceAll(s,"for","with");
//        byte[] bytes=myString.getBytes(s);
//        for(byte b:bytes){
//            System.out.println(b);
//        }
//        char[] a=myString.creatArray(s);
//        for(char ch:a){
//            System.out.println(ch);
//        }
        //System.out.println(myString.compare(s,s));
        //myString.substringg(s);




        //Bianry operator swap two no
//        int x=10;int y=5;
//        int[] a=new int[3];
//        BinaryOperator binaryOperator=new BinaryOperator();
//        a=binaryOperator.swapBinary(x,y);

       // System.out.println(binaryOperator.changeBase("45",2));

       // System.out.println(binaryOperator.evenOdd(7));
        //System.out.println(binaryOperator.checkPowerof2(16));
       // System.out.println(2>>2);



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

    private static void rekors() {
        Recor obj=new Recor();
        obj.printNumber(5);
//        int result=obj.sum(5,10);
//        System.out.println(result);
    }

    private static void arrays() {

        MyArrays obj=new MyArrays();
        obj.intarray();
        //obj.dint();
        //obj.strarray();
    }

    public static void looping(){
       Dowile obj=new Dowile();
       int no=11;
       obj.dowile(no);
       //obj.wile(no);

   }
   public static void switchtest(){
       Swithching obj=new Swithching();
       System.out.println(obj.Day(7));

   }
   public static void myMath(){
        double d=10.5;
        int a=45;
        int b=70;

        MyMath math=new MyMath();
        double dd=math.naturalLog(100.10);
       System.out.println(math.ternaryOperate(10));
        //System.out.println("natural log : "+dd+"\nRound off "+math.roundoff(dd));
       //System.out.println("Max is : "+math.maxNo(a,b)+" Min is : "+math.minNo(a,b));


   }

}
