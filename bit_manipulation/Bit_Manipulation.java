package bit_manipulation;

public class Bit_Manipulation {
    public static void main(String[] args) {
//        int res=convert2Decimal("1101");
//        System.out.println(res);
        System.out.println(checkBit_Right_Shift(13,2));
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

    // check if the i th bit is set or not in a number.
    public static boolean checkBit_Left_Shift(int n,int i){
        if((n & (1<<i))!=0) return true;
        else return false;
    }

    public static boolean checkBit_Right_Shift(int n,int i){
        if((1&(n>>i))!=0) return true;
        else return false;
    }

    // set i th bit of a number
    public static int set_bit(int number,int i){
        int result=(number|(1<<i));
        return result;
    }

    // clear i th bit of a number
    public static int clear_bit(int number,int i){
        int result=(number&~(1<<i));
        return result;
    }

    // toggle i th bit of a number
    public static int toggle_bit(int number,int i){
        int result=number^(1<<i);
        return result;
    }

    // remove the last set bit(rightmost)
    public static int remove_lastSetBit(int number){
        int result=number&(number-1);
        return result;
    }

    // check if the number is a power of 2.
    public static boolean check_powerOf2(int number){
        if((number&(number-1))==0){
            return true;
        }
        return false;
    }

    // count the number of set bits
    public static int count_set_bits(int number){
        int count=0;
        while(number>1){
            count+=number&1;
            number=number>>1;
        }
        if(number==1) count++;
        return count;

    }
    
    // count the number of set bits - 2nd approach
    public static int count_set_bits2(int N){
        int count=0;
        while(N!=0){
            N=N&(N-1);
            count++;
        }
        return count;
    }
}
