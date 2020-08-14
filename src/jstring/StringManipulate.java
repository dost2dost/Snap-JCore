package jstring;

import java.util.*;

/**
 * Created by DostM on 7/23/2020.
 */
public class StringManipulate {

    public Map<String,Integer> countWrd(String s){
        String[] words=s.split(" ");

        Map<String,Integer> wordCount=new LinkedHashMap<String,Integer>();
        for (String str:words){
            if(wordCount.get(str)==null){
                wordCount.put(str,1);
            }else{
                wordCount.put(str,wordCount.get(str)+1);
            }

        }
        return wordCount;

    }
    public String reversWrd(String s){
        String[] str=s.split(" ");
        List<String> lst=new LinkedList<String>();
        StringBuffer stringBuffer=new StringBuffer();

        for(int i=str.length-1;i>0;i--){
            lst.add(str[i]);
        }
        for(String sk:lst){
            stringBuffer.append(sk);
            stringBuffer.append(" ");

        }
        return stringBuffer.toString();

    }
    public String removDuplicateWrd(String s){
        String[] str=s.split(" ");
        ArrayList<String> lst=new ArrayList<String>();
        StringBuffer buffer=new StringBuffer();
        for(String ss:str){
            if(!lst.contains(ss)){
                lst.add(ss);
            }

        }

        for(String ssp:lst){
            buffer.append(ssp);
            buffer.append(" ");


        }
        return buffer.toString();

    }
    public String removDuplicate(String s){
        char[] chars=s.toCharArray();
        Set<Character> set=new LinkedHashSet<Character>();
        for(char ch:chars){
            set.add(ch);
        }
        StringBuffer buffer=new StringBuffer();
        for(char ch:set){
            buffer.append(ch);
        }

        return buffer.toString();

    }
}
