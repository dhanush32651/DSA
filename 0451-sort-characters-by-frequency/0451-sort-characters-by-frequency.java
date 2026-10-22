import java.util.*;
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
       PriorityQueue<Character> pq = new PriorityQueue<>(
            (a, b) -> hm.get(b) - hm.get(a)
        );

        for(char ch : hm.keySet()){
            pq.offer(ch);
        }
        StringBuilder ans = new StringBuilder();
        while(!pq.isEmpty()){
            char ch = pq.poll();
            int freq = hm.get(ch);
            for(int i=0;i<freq;i++){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}