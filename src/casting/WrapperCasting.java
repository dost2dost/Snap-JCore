package casting;

/**
 * Created by DostM on 7/16/2020.
 */
public class WrapperCasting {
    private int anInt;
    private double aDouble;
    public Double getDouble(int anInt){
        return Double.valueOf(anInt);
    }
    public Integer getInteger(double aDouble){
        return Integer.valueOf((int) aDouble);
    }
}
