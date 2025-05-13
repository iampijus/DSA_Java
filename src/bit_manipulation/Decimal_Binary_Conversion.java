package bit_manipulation;

public class Decimal_Binary_Conversion {
    public static void main(String[] args) {
        int res=convert2Decimal("1101");
        System.out.println(res);
    }

    public static String convert2Binary(int n){
        String res="";
        while(n>1){
            if(n%2==1) res+='1';
            else res+='0';
            n=n/2;
        }
        res+='1'; //add the last bit;
        String reversed=new StringBuilder(res).reverse().toString();
        return reversed;
    }

    public static int convert2Decimal(String x){
        int len=x.length();
        int num=0,p2=1;
        for(int i=len-1;i>=0;i--){
            if(x.charAt(i)=='1'){
                num=num+p2;
            }
            p2=p2*2;
        }
        return num;
    }
}
