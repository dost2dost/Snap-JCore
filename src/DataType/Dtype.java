package DataType;

/**
 * Created by DostM on 7/15/2020.
 */
public class Dtype {
    private  static byte aByte;
    private  static short aShort;
    private int anInt;
    private String string;
    private boolean aBoolean;
    private long aLong;



    public static <T> String nameOf(T o) {
        return o.getClass().getSimpleName();
    }
    public static DataType chkType(Object o){
        String s=nameOf(o);
        DataType typeMaxMin=null;
        switch(s){
            case "Short":
                typeMaxMin=new DataType(nameOf(o),Short.MIN_VALUE,Short.MAX_VALUE);
                break;
            case "Integer":
                typeMaxMin=new DataType(nameOf(o),Integer.MIN_VALUE,Integer.MAX_VALUE);
                break;
            case "Byte":
                typeMaxMin=new DataType(nameOf(o),Byte.MIN_VALUE,Byte.MAX_VALUE);
                break;
            case "Long":
                typeMaxMin=new DataType(nameOf(o),Long.MIN_VALUE,Long.MAX_VALUE);
                break;
            case "Double":
                typeMaxMin=new DataType(nameOf(o),Double.MIN_VALUE,Double.MAX_VALUE);
                break;
            case "Character":
                typeMaxMin=new DataType(nameOf(o),Character.MIN_VALUE,Character.MAX_VALUE);
                break;

        }
        return typeMaxMin;

    }
    public static void main(String args[]){
        aByte = 25;
        aShort=32767;
        DataType dataType=chkType(aShort);
        System.out.println("Type: "+dataType.getType()+"\nMinV: "+dataType.getMinV()+" MaxV:"+dataType.getMaxV());
    }

}
