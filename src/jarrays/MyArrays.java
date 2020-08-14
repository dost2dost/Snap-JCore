package jarrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by DostM on 7/22/2020.
 */
public class MyArrays {
    String[] strarray={"BMW","vigo","cultus","suauki"};
    int [] intarray={1,5,6,7,9,8,9,7};
    int[][] dint={{1,5,3},{7,8,9},{4,5,6}};
    int smallest=Integer.MAX_VALUE;
    int secondsmallest=Integer.MAX_VALUE;

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

    public int secndSmallestNo(int [] ar){
        for(int i:ar){
            if(ar[i]<smallest){
                smallest=ar[i];
            }else if(ar[i]>smallest && ar[i]<secondsmallest){
                secondsmallest=ar[i];
            }
        }
        return secondsmallest;

    }
    /*
     Merge two sorted arrays in new one
     */
    public int[] mergsortedArray(int a[],int[] b){
        int[] result=new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<a.length && j<b.length){
            if(a[i]<b[j]){
                result[k++]=a[i++];
            }else{
                result[k++]=b[j++];
            }
        }
        while (i<a[i]){
            result[k++]=a[i++];
        }
        while (j<b[j]){
            result[k++]=b[j++];
        }
    return result;
    }
    /**
     *  pair of no  which sum is equals to given no
     */
    public void printPairSum(int[] ar,int sum){
        int low=0;
        int high=ar.length-1;
        while(low<high){
            if(ar[low]+ar[high]>sum){
            high--;
            }else if(ar[low]+ar[high]<sum){
                low++;
            }else if(ar[low]+ar[high]==sum){
                System.out.println("pair "+ar[low]+":"+ar[high]);
                low++;
                high--;
            }
        }
    }
    /**
     * Remove duplicates in array using set
     */
    public void printDuplicate(int[] ar){
        Set<Integer> uniqNumbers=new HashSet<Integer>();
        boolean b=false;
        for(int i:ar){
            if(uniqNumbers.isEmpty()){
                uniqNumbers.add(i);
            }else if(uniqNumbers.contains(i)){
                b=true;
                System.out.println("already present : "+i);
            }else{
                uniqNumbers.add(i);
            }
        }
        if(b==false){
            System.out.println("No any duplicate Value !");
        }

    }
    /**
     * Q:Find Commom elements in arrays?
     */
    public void findCommonElements(int[] a,int [] b,int[] c){
        int i,j,k;
        i=j=k=0;
        while(i<a.length-1 && j< b.length-1 && j<c.length-1){
            if(a[i]==b[j] && b[j]==c[k]){
                System.out.println("Common: "+a[i]);
                i++;
                j++;
                k++;
            }else if(a[i]>b[j]){
                j++;
            }else if(b[j]>c[k]){
                k++;
            }else{
                i++;
            }

        }

    }
    /**
     * Q:Find elemets apeared once in sorted array
     */
    public void apearOnce(int[] a){
        boolean b=false;
        Map<Integer,Integer> elements=new HashMap<Integer,Integer>();

        for(int i:a){
            if(elements.isEmpty()){
                elements.put(i,1);
            }else if(elements.containsKey(i)){
                elements.put(i,elements.get(i)+1);
            }else{
                elements.put(i,1);
            }

        }
        for(Integer key:elements.keySet()){
            if(elements.get(key)==1){
                System.out.println("Apeared once element is :"+key);
                b=true;
            }
        }
        if(!b){
            System.out.println("No once is appeared !");
        }
    }
}
