
class Employee{
	String Name;
	int Age;
	int PhoneNo ;
	String Address;
	int Salary;
		
	 void DisplayEmployeeInfo(){
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Phone Number: "+PhoneNo);
		System.out.println("Address: "+Address);
		System.out.println("Salary: " + Salary );
	}
}

class Officer extends Employee{
	String Specialization;
	//constructer officer
	Officer(String name ,int age, int phoneNo , String address , int salary , String specialization){
		Name = name;
		Age = age;
		PhoneNo = phoneNo;
		Address = address;
		Salary = salary;
		Specialization = specialization;
	}
	void DisplayEmployeeInfo(){
		super.DisplayEmployeeInfo();
		System.out.println("Specialization: " + Specialization );
		System.out.println("\n");
	}
}

class Manager extends Employee{
	String Department;
	//constructer manager
	Manager(String name , int age , int phoneNo , String address , int salary, String department){
		Name = name;
		Age = age;
		PhoneNo = phoneNo;
		Address = address;
		Salary = salary;
		Department = department;
	}
	void DisplayEmployeeInfo(){
		super.DisplayEmployeeInfo();
		System.out.println("Department: " + Department );
		System.out.println("\n");
	}
}

class Employeee{
	public static void main(String[] args){
		Officer D1= new Officer("julia",34,9372482,"ABC valley",9875,"AR");
		Manager M1 = new Manager("jomon",38,9372482,"DEF valley",9465,"CS");
		D1.DisplayEmployeeInfo();
		M1.DisplayEmployeeInfo();
		
	}
}
		
		
