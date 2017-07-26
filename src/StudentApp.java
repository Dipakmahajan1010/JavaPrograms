import java.io.*;

class StudentApp
{
	public static void main(String args[])throws IOException
{	
	
	InputStreamReader inputStreamReader=new InputStreamReader(System.in);

	BufferedReader bufferedReader=new BufferedReader(inputStreamReader);

	Student student=new Student();

		Student student1= accept(bufferedReader);
		Student student2= accept(bufferedReader);
		Student student3= accept(bufferedReader);
	print(student1);
	print(student2);
	print(student3);
	
}
	static Student accept(BufferedReader bufferedReader)throws IOException
	{
		Student student=new Student();
		student.name=bufferedReader.readLine();
		student.rollno=Integer.parseInt(bufferedReader.readLine());
		student.marks=Float.parseFloat(bufferedReader.readLine());

		return student;
	}
	public static void print(Student student)
	{
		System.out.println("\n name="+student.name);
		System.out.println("\n roll number="+student.rollno);
		System.out.println("\n marks="+student.marks);
	}
}
