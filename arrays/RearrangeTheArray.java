package arrays;

import java.util.*;
public class RearrangeTheArray {
    public static int [] Rearrange(int [] a,int n){
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(a[i]>0) pos.add(a[i]);
            else neg.add(a[i]);
        }

        if(pos.size()>neg.size()){
            for(int i=0;i<neg.size();i++){
                a[2*i]=pos.get(i);
                a[2*i+1]=neg.get(i);
            }

            int index=neg.size()*2;
            for(int i=neg.size();i<pos.size();i++){
                a[index]=pos.get(i);
                index++;
            }
        }else{
            for(int i=0;i<pos.size();i++){
                a[2*i]=pos.get(i);
                a[2*i+1]=neg.get(i);
            }
            int index=pos.size()*2;
            for(int i=pos.size();i<neg.size();i++){
                a[index]=neg.get(i);
                index++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int [] ans;
        ans=Rearrange(a,n);

        System.out.println("Your array after rearranging the elements");
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
