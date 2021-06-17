package Practice;
// extending from person class
public class Employee extends Person
{

		Address address;
		// Person person;           (removed)
		double salary;
		int id;
		
		public Employee(String name, int age, char gender, 
				String locality, String city, String state, 
				int zipcode, int id, double salary)
		{
		//	person = new Person(name, age, gender);        (removed)
			super(name, age, gender);
			address = new Address(locality, city, state, zipcode);
			this.salary = salary;
			this.id = id;
		}
		@Override
		public String toString()
		{
			return "Employe [address= " + address.toString() + 
		//			", person = " + person.toString() +     (removed)
			 ", salary = " + salary + ", id = " + id + "]";
		}
		
public static void main(String[] args) 
		{
		Employee emp1 = new Employee ("ABC",23,'F',"Urban estate","Ludhiana","Delhi",141033, 123, 8500);
		System.out.println(emp1.toString());
		}

}
