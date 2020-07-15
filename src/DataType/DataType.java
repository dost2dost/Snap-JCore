package DataType;

/**
 * Created by DostM on 7/15/2020.
 */
public class DataType {
    private Object type;
    private Object minV;
    private Object maxV;

    public DataType() {
    }

    public DataType(Object type, Object minV, Object maxV) {
        this.type = type;
        this.minV = minV;
        this.maxV = maxV;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Object getMinV() {
        return minV;
    }

    public void setMinV(Object minV) {
        this.minV = minV;
    }

    public Object getMaxV() {
        return maxV;
    }

    public void setMaxV(Object maxV) {
        this.maxV = maxV;
    }
}
