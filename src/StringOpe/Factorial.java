package StringOpe;

/**
 * Created by shree on 26/7/17.
 */
public class Factorial {
    public static void main(String[] args) {
        int i, fact=1;
        int number=5;
        for(i=1;i<=number;i++){
            fact*=i;
        }
        System.out.println("Factorial="+fact);
    }
}
