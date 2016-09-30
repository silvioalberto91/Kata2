package Kata2;

import java.util.HashMap;

public class Kata2v1 {
    
    public static void main(String[] args){
        int[] array = {2,3,4,3,4,5,7,5,6};
        
        HashMap <Integer,Integer> histogram = new HashMap();
        
        for (int key : array) {
            if(histogram.containsKey(key)){
                histogram.put(key, histogram.get(key)+1);
                
            }
            else {
                histogram.put(key, 1);
            }
        }
        for (int key : histogram.keySet()){
            System.out.println(key + "--->" + histogram.get(key));
            
            
        }
    }
    
}
