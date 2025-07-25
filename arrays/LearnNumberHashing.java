package arrays;

import java.util.*;
public class LearnNumberHashing {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // precompute
        int [] hash=new int[13];
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }


        int q;
        q=sc.nextInt();
        while(q!=0){
            int number;
            number=sc.nextInt();
            //fetch
            System.out.println(hash[number]);
            q--;
        }
    }
}
