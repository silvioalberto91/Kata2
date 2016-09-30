package Kata2;

import java.util.HashMap;

public class Kata2v1 {
    
    public static void main(String[] args){
        int[] vector = {2,3,4,3,4,5,7,5,6};
        Histogram histo = new Histogram(vector);
        HashMap <Integer,Integer> histogram = histo.getHistogram();
        
        
        
        for (int key : histogram.keySet()){
            System.out.println(key + "--->" + histogram.get(key));
            
            
        }
    }
    
}
