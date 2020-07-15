package DataType;

/**
 * Created by DostM on 7/15/2020.
 */
public class Dtype {

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
            case "Float":
                typeMaxMin=new DataType(nameOf(o),Float.MIN_VALUE,Float.MAX_VALUE);
                break;
            case "Character":
                typeMaxMin=new DataType(nameOf(o),0,0);
                break;
            case "String":
                typeMaxMin=new DataType(nameOf(o),0,0);
                break;
            case "Boolean":
                typeMaxMin=new DataType(nameOf(o),0,0);
                break;



        }
        return typeMaxMin;

    }

}
