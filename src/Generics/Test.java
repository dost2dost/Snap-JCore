package Generics;

/**
 * Created by DostM on 7/15/2020.
 */
public class Test<T,U> {
    T objT;
    U objU;

    public Test(T objT, U objU) {
        this.objT = objT;
        this.objU = objU;
    }

    public Test() {
    }

    public void print(){
        System.out.println(objT);
        System.out.println(objU);
    }
}
