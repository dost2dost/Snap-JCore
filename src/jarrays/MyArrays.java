package jarrays;

/**
 * Created by DostM on 7/22/2020.
 */
public class MyArrays {
    String[] strarray={"BMW","vigo","cultus","suauki"};
    int [] intarray={1,5,6,7,9,8,9,7};
    int[][] dint={{1,5,3},{7,8,9},{4,5,6}};

    public void dint(){
        for(int i=0;i<dint.length;i++){
            for(int j=0;j<dint[0].length;j++){
                System.out.println(dint[i][j]);
            }
        }
    }
    public void intarray(){
        for(int a:intarray){
            System.out.println(a);
        }

    }
    public void strarray(){
        for(String s:strarray){
            System.out.println(s);
        }

    }
}
