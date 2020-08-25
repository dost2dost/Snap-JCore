package collections;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by DostM on 8/15/2020.
 */
public class Quee {

    public void dispQue(){
        Queue que=new LinkedList<String>();
        que.add("three");
        que.add("one");
        que.add("abc");
        que.add("four");
        que.add("teh");

        String[] a=new String[que.size()];
         que.toArray(a);
        for(String s:a) {
            System.out.println(s);

        }

    }
}
