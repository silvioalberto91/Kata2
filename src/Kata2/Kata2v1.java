package Kata2;

import java.util.HashMap;

public class Kata2v1 {
    
    public static void main(String[] args){
        //int[] vector = {2,3,4,3,4,5,7,5,6};
        String[] vector = {"Elena", "Giulia", "Susi", "Elena", "Anna", "Giulia"};
        Histogram histo = new Histogram(vector);
        HashMap <String,Integer> histogram = histo.getHistogram();
        
        
        
        for (String key : histogram.keySet()){
            System.out.println(key + "--->" + histogram.get(key));
            
            
        }
    }
    
}
