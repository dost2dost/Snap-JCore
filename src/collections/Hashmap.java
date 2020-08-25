package collections;

import java.util.*;

/**
 * Created by DostM on 8/15/2020.
 */
public class Hashmap {
    public void showMap(){
        Map<Integer,String> mp=new HashMap();
        Map<Integer,String> sortedMap;
        mp.put(5, "A");
        mp.put(11, "C");
        mp.put(4, "Z");
        mp.put(77, "Y");
        mp.put(9, "P");
        mp.put(66, "Q");
        mp.put(0, "R");
        System.out.println("Before Sorting ");
        Set set=mp.entrySet();
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            Map.Entry entry=(Map.Entry)iterator.next();
            System.out.println("key : "+entry.getKey()+" val :"+entry.getValue());

        }
        sortedMap=new TreeMap<Integer,String>(mp);
        Set set1=sortedMap.entrySet();
        Iterator iterator1=set1.iterator();
        System.out.println("After Sorting Hash map");
        while (iterator1.hasNext()){
            Map.Entry entry1= (Map.Entry) iterator1.next();
            System.out.println("key: "+entry1.getKey()+" Value: "+entry1.getValue());

        }

    }

}
