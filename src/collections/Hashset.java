package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by DostM on 8/15/2020.
 */
public class Hashset {
    Set set2=new LinkedHashSet<String>();
    public void disp(){
        Set set=new LinkedHashSet<String>();

        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("four");
        set.add(null);
        set.add(null);

        System.out.println(set);
       String[] ar= converttoArra(set);

        for(String s:ar){
            System.out.println(s);
        }

    }

    private String[] converttoArra(Set set) {
        String[] strings=new String[set.size()];
        set.toArray(strings);
        return strings;
    }
}
