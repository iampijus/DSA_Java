package arrays;

import java.util.*;
public class LearnNumberHashingusingHashMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        //pre-compute
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int key=arr[i];
            int freq=0;
            if(mp.containsKey(key)) freq=mp.get(key);
            freq++;
            mp.put(key,freq);
        }

        // Iterate over the map
//        for(Map.Entry<Integer,Integer> it: mp.entrySet()){
//            System.out.println(it.getKey()+"->"+it.getValue());
//        }


        int q=sc.nextInt();
        while(q-->0){
            int num=sc.nextInt();
            if(mp.containsKey(num)) System.out.println(mp.get(num));
            else System.out.println(0);
        }
    }
}
