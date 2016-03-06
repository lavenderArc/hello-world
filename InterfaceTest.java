/**
*@author jianye li
*@version 0.01
*/
public class InterfaceTest
{
	public static void main(String args[])
	{
		Student s = new Student();
		s.talk();	
	}
}

interface Person
{
	final String name = "Jim";
	int age = 10;
	public abstract void talk();
}

class Student implements Person
{
	public void talk()
	{
		System.out.println(name + " " + age);
	}
}