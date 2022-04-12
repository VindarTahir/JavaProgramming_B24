package personal;

public class IsPalindromeNum {

    public static void main(String[] args) {

            int num = 1001;
            int remainder=0;
            int reversed=0;
            int copiednum=num;

            if(num<0){
                System.out.println(false);// 1/10
            }
            while(num>0){

                remainder= num%10; // finding remainder
                reversed=(reversed*10) +remainder; //0*10+1=1

                num/=10; //dividing the number


            }
            if(reversed==copiednum){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
    }

}
