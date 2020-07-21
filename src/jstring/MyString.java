package jstring;

/**
 * Created by DostM on 7/20/2020.
 */
public class MyString {

    public void toLower(String s){
        System.out.println(s.toLowerCase());
    }
    public void toUpper(String s){
        System.out.println(s.toUpperCase());
    }
    public int findLength(String s){
        return s.length();
    }
    public boolean isEmpty(String s){
        return s.isEmpty();

    }
    public boolean isString(Object s){
        String name=s.getClass().getName();
        if(name.equals("String")){
            return true;

        }else
            return false;
    }
    public void findIndex(String s,String searchStr){
        System.out.println(searchStr+"Index is : "+s.indexOf(searchStr));

    }
    public void substringg(String s){
        String subStr1=s.substring(s.length()/2);
        String subStr2=s.substring(0,s.length()/2);
        System.out.println(""+subStr1+" Substr2:"+subStr2);

    }
    public void useSpecialCharacter(){
        String s="this is jus \"Oppenings\"";

    }
    public void startEnd(String s){
        System.out.println("Start with Hello "+s.startsWith("Hello")+"End with "+s.endsWith("ing"));
    }
    public void concate(String s,String s2){
        System.out.println(s.concat(s2));
    }
    public boolean contains(String s,String searchStr){
        return s.contains(searchStr);
    }
    public String removWhiteSpace(String s){
        return s.trim();
    }
    public byte[] getBytes(String s){
        return s.getBytes();
    }
    public boolean compare(String s,String s2){
        return (s.equals(s2));
    }
    public void replaceAll(String s,String search,String replace){
        String sd=s.replaceAll(search,replace);
        System.out.println(search+"is Replaced with "+replace+"\n new String :"+sd);
    }
    public char[] creatArray(String a){
        return a.toCharArray();
    }
}
