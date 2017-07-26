import java.util.Scanner;

/**
 * Created by shree on 14/7/17.
 */
public class Array
{
    public static void main(String args[])
    {
        int no;

        String squareResult=" ";
        String cubeResult=" ";
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many number which u have add in array");
        no = scanner.nextInt();
        int number[]=new int[no];



        System.out.println("Enter elements of array:-");
        for(int i=0;i<no;i++)
        {
            number[i]=scanner.nextInt();
            if(i%2==0)
            {
                int square=(number[i]*number[i]);
                String localResult="square of Number"+number[i]+" is even=="+square+"\n";
                squareResult=squareResult+localResult;
            }
            else
            {
                int cube=number[i]*number[i]*number[i];
                String localResult1="square of Number"+number[i]+" is even=="+cube+"\n";
                cubeResult=cubeResult+localResult1;
                System.out.println();
            }

        }
        System.out.println(squareResult);
            System.out.println(cubeResult);

}
}