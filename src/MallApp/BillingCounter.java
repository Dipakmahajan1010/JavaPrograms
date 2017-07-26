package MallApp;

/**
 * Created by shree on 24/7/17.
 */
public class BillingCounter
{


    public static void main(String []args)
    {
        Cloth c=new Cloth("shirt denim",1399,2);
        Toy t=new Toy("teddyBear",500,2);


        double clothGst=c.getGST();
        System.out.println("cloth gst="+clothGst);
        double toyGst=t.getGST();
        System.out.println("toy gst="+toyGst);
    }
}
