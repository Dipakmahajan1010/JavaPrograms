package StringOpe;

/**
 * Created by shree on 26/7/17.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int m=0,flag=0;
        int n=17;
        m=n/2;
        for(int i=2; i<=m; i++){
            if(n%i==0){
                System.out.println("No is not prime");
                flag=1;
                break;
            }

        }
        if(flag==0)
            System.out.println("Number is prime");
    }
}
