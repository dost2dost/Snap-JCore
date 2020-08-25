package randomm;

import java.util.Random;

/**
 * Created by DostM on 8/16/2020.
 */
public class Randoom {
    // 3 ways to generate random Math, Random Class ,Random Thread


    /**
     *
     * @param min
     * @param max
     * @return
     */
    public double findRandom(int min,int max){
        return Math.random()*(max-min+1)+min;
    }
    public void findRandomByClass(){
        Random obj=new Random();
        System.out.println(obj.nextInt(55));
    }
}
