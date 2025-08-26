package Day_08;

import java.util.*;

public class topKFreqWord {
     static class Pair implements Comparable<Pair>{
          String word;
          int freq;

          public Pair(String word,int freq){
               this.word=word;
               this.freq=freq;
          }

          @Override
          public int compareTo(Pair p2){
               if(p2.freq != this.freq){
                    return p2.freq-this.freq;
               }
               return this.word.compareTo(p2.word);
          }
     }
     public static List<String> freqWord(String words[],int k){
          HashMap<String, Integer> hm=new HashMap<>();

          for(String key:words){
               hm.put(key,hm.getOrDefault(key, 0)+1);
          }

          PriorityQueue<Pair> pq=new PriorityQueue<>();
          for(String key:hm.keySet()){
               pq.add(new Pair(key, hm.get(key)));
          }

          ArrayList<String> arr=new ArrayList<>();
          for(int i=0;i<k;i++){
               arr.add(pq.poll().word);
          }

          return arr;
     }
     public static void main(String[] args) {
          String words[]={"i","love","leetcode","i","love","coding"};
          int k=2;

          System.out.println(freqWord(words, k));
     }
}
