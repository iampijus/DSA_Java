package arrays;

import java.util.*;
public class LearnCharacterHashing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        // precompute
//        int [] hash=new int[26];
        int [] hash=new int[256];
        for(int i=0;i<s.length();i++){
//            hash[s.charAt(i)-'A']++;
            hash[s.charAt(i)]++;
        }

        int q=sc.nextInt();
        while(q!=0){
            char ch=sc.next().charAt(0);
//            System.out.println(hash[ch-'A']);
            System.out.println(hash[ch]);
            q--;
        }
    }
}
