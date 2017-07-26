class Operations
{
	static double subtraction;
	public float multipication(float number1,float number2)
	{
		return number1*number2;
		
		
		
	}
	public int division(int number3,int number4)
	{
		
		return number3/number4;
		
	}
	public double subtraction(double number5,double number6)
	{
		
		return number5-number6;
		
	}
	
	public static void main(String []args)
	{
		Operations operations=new Operations();

		 float result1=operations.multipication(10.5f,22.3f);
		System.out.println("Multipication"+result1);

			int result2=operations.division(20,5);
		System.out.println("Division"+result2);
		
		double result3=operations.subtraction(33,22);
		System.out.println("Subtraction="+result3);
	
	}
}

