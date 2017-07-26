/**
 * Created by shree on 19/7/17.
 */
public class ABC
{
    private ABC()
    {
        System.out.println("print ABC");
    }
    public static ABC createABC()
    {
        return new ABC();
    }
    public void print()
    {
        System.out.println("Done");
    }
}

