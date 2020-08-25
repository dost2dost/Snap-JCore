import DataType.DataType;
import DataType.Dtype;
import casting.NarrowCastinManualy;
import casting.WideningCastingAuto;
import casting.WrapperCasting;
import characterss.Alphabate;
import collections.Hashmap;
import collections.Hashset;
import collections.Quee;
import ifelsbool.Swithching;
import jarrays.MyArrays;
import jbasicprograms.ArmastrongNo;
import jbasicprograms.Fibonici;
import jbasicprograms.FindFactorial;
import jbasicprograms.Palindrom;
import jstring.MyString;
import jstring.StringManipulate;
import looping.Dowile;
import maths.MyMath;
import numberoperations.ReversNo;
import operators.BinaryOperator;
import randomm.Randoom;
import recursions.Recor;
import threads.Sumcall;

import java.util.Map;
import java.util.concurrent.*;

public class Main {

    private static String s;
    private static boolean b;
    private static int anInt;
    private static char aChar;
    private static short aShort;
    private static double aDouble;
    private static float aFloat;
    private static long aLong;

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        try {
            callSum(10);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // findRandom();
        //chkAlphabate('Z');
        //findAmastrongNo(377);
        //findFact(5);
        //palindrom(454);
        //reversNo(54);
        //System.out.println(1+""+2);
        //fibonacci(10);

         //dispR(5);
        //queImplementation();


        // hashmap();
        //hasdisp();
        //stringManipulate();
        // rekors();
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

    private static void callSum(int i) throws ExecutionException, InterruptedException {
        ExecutorService service= Executors.newFixedThreadPool(10);
        Future<Integer> future=service.submit(new Sumcall(i));
        try {
            System.out.println(future.get(2, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

    }

    private static void findRandom() {
        Randoom obj=new Randoom();
        //System.out.println(obj.findRandom(200,400));
        obj.findRandomByClass();
    }

    private static void chkAlphabate(char c) {
        Alphabate obj=new Alphabate();
        if(obj.chkAlphabate(c)){
            System.out.println(" It is Alpha bate ");
        }else{
            System.out.println(" It is not Alpha bate! ");
        }
    }

    private static void findAmastrongNo(int i) {
        ArmastrongNo obj=new ArmastrongNo();
        if(obj.findArmStrongNo(i)){
            System.out.println("The No "+i+" is amastrong no");
        }else {
            System.out.println("The No "+i+" is not  amastrong no!");
        };

    }

    private static void findFact(int i) {
        FindFactorial obj=new FindFactorial();
        System.out.println("Fact of "+i+" is : "+obj.recurFact(i));
    }

    private static void palindrom(int i) {
        Palindrom palindrom=new Palindrom();
        palindrom.findPalidrom(i);
    }

    private static void reversNo(int i) {
        ReversNo obj=new ReversNo();
        obj.reversNo(i);
    }

    private static void fibonacci(int i) {
        Fibonici obj=new Fibonici();
        //obj.fibonacciNonRecursive(i);
        System.out.print(0+""+1);
        obj.fibonacciRecursive(i-2);
    }

    private static void dispR(int i) {
        if(i<1){
            return;
        }else{
            System.out.println(i);
            dispR(i-1);
        }
    }

    private static void queImplementation() {
        Quee obj=new Quee();
        obj.dispQue();
    }

    private static void hashmap() {
        Hashmap hashmap=new Hashmap();
        hashmap.showMap();
    }

    private static void stringManipulate() {

//        StringManipulate stringManipulate=new StringManipulate();
//        String str=stringManipulate.removDuplicateWrd("hello it is working working fine fine just just only test test ! !");
//        Map wordcount=stringManipulate.countWrd("hello hello word word test test again ");
//        wordcount.forEach((k,v)->{
//            System.out.println(k+" repeating time : "+v);
//        });
        //System.out.println(stringManipulate.reversWrd(str));
    }

    private static void hasdisp() {
        Hashset obj=new Hashset();
        obj.disp();
    }

    private static void rekors() {
        Recor obj=new Recor();
        obj.printNumber(5);
//        int result=obj.sum(5,10);
//        System.out.println(result);
    }

    private static void arrays() {

        MyArrays obj=new MyArrays();
        int a[]={1,1,2,2,3,3,4,4,5};
        obj.apearOnce(a);
       // obj.intarray();
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
