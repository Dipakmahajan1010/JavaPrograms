package MallApp;

/**
 * Created by shree on 24/7/17.
 */

    public class Toy extends Item
    {
        static final int GST_RATE=18;
         Toy(String name,double price,int qty)
        {
            this.name=name;
            this.price=price;
            this.qty=qty;
        }
        public double getGST()
        {
            double gst=(price*GST_RATE/100)*qty;
            return gst;
        }
    }


