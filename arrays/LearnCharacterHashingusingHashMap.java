package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LearnCharacterHashingusingHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();

        // pre-compute
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char key=s.charAt(i);
            int freq=0;
            if(mp.containsKey(key)) freq=mp.get(key);
            freq++;
            mp.put(key,freq);
        }

        // Iterate over the map
        for(Map.Entry<Character,Integer> it: mp.entrySet()){
            System.out.println(it.getKey()+"->"+it.getValue());
        }

        int q=sc.nextInt();
        while(q-->0){
            char ch=sc.next().charAt(0);
            if(mp.containsKey(ch)) System.out.println(mp.get(ch));
            else System.out.println(0);
        }
    }
}
