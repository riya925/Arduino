package std;

public class Student
{
	public int id,age;
	public String na;
	public Student(int i,String n,int a)
	{
		id=i;
		na=n;
		age=a;
	}
	public void show()
	{
		System.out.println("\n Student's details are.... ");
		System.out.println("\n Student's id is : "+id);
		System.out.println("\n Student's name is : "+na);
		System.out.println("\n Student's age is : "+age);
	}
} 