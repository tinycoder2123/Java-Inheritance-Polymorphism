package Practice;

public class Person 
{
	String name;
	int age;
	char gender;
	
	public Person(String name, int age, char gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString()
	{
		return "name= " + name + ", age = " + age + ", gender = " + gender;
	}
}
