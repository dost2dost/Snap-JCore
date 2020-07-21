package looping;

/**
 * Created by DostM on 7/21/2020.
 */
public class Dowile {

    public void wile(int a){
        int x=0;
        while (x<a){
            System.out.println("iteration: "+x);
            x++;
        }
    }
    public void dowile(int a){
        int x=0;
        do{
            System.out.println("Lets start do while loop "+x);
            x++;
        }while (x<a);
    }
    public void implfor(int a){
        for(int i=0;i<a;i++){
            System.out.println("Iteration : "+i);
        }
    }
}
