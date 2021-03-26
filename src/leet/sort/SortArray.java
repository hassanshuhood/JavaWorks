package leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

import jdk.internal.agent.resources.agent;

public class SortArray {


    class aC implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            // TODO Auto-generated method stub
            return 0;
        }

    }
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        ArrayList<Integer> a = new ArrayList<>();
        
        a.addAll();

        Collections.addAll(a, nums1);
        
        TreeSet<Integer> sortArray = new TreeSet<Integer>(new Comparator<Integer>(){          

            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return o1 - o2;
            }
        });
        int n1 = nums1.length;
        int n2 = nums2.length;
        for(int i = 0; i < nums1.length; i++ )
            a.add(Integer.valueOf(nums1[i]));
        for(int i = 0; i < nums2.length; i++ )
            a.add(new Integer(nums2[i]));    


        Collections.sort(a, new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return 0;
            }
            
        });

        Collections.sort(a, new aC());
        double median = 0;
        int middle = (n1+n2) /2;
        if( (n1+n2) % 2 != 0){
            median = a.get(middle);
        }
        else {
            median = (a.get(middle) + a.get(middle-1))/2.0;
        }


        return median;
    }

    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b ={3,4};

        new SortArray().findMedianSortedArrays( a , b);
    }
}
