package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by DostM on 8/15/2020.
 */
public class Hashset {

    public void disp(){
        Set set=new HashSet<String>();

        set.add("zne");
        set.add("awo");
        set.add("dhree");
        set.add("four");
        set.add("zour");
//        set.add(null);
//        set.add(null);
        Set set2=new TreeSet(set);
        System.out.println(set2);
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
