/**
 * Created by shree on 21/7/17.
 */
public class Addition {

    double sum(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public static void main(String arg[]) {


        Addition addition = new Addition();
        double res = addition.sum(10.6,12.8);
        System.out.println(res);
    }
}