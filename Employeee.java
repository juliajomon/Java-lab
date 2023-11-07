
class Employee{
	String Name;
	int Age;
	int PhoneNo ;
	String Address;
	int Salary;
	
	Employee(String name ,int age, int phoneNo , String address , int salary){
		Name = name;
		Age = age;
		PhoneNo = phoneNo;
		Address = address;
		Salary = salary;
	}
		
	public String toString(){
		return "Name: "+Name + "\nAge: "+Age + "\nPhone Number: "+PhoneNo + "\nAddress: "+Address + "\nSalary: " + Salary ;
	}
}
class Officer extends Employee{
	String Specialization;
	//constructer officer
	Officer(String name ,int age, int phoneNo , String address , int salary, String specialization){
		super(name,age,phoneNo,address,salary);
		Specialization = specialization;
	}
	
	public String toString(){
		return "Name: "+Name + "\nAge: "+Age + "\nPhone Number: "+PhoneNo + "\nAddress: "+Address + "\nSalary: " + Salary +"\nSpecialization: " + Specialization;
	}
}

class Manager extends Employee{
	String Department;
	//constructer manager
	Manager(String name ,int age, int phoneNo , String address , int salary, String department){
		super(name,age,phoneNo,address,salary);
		Department = department;
	}
	
	public String toString(){
		return "Name: "+Name + "\nAge: "+Age + "\nPhone Number: "+PhoneNo + "\nAddress: "+Address + "\nSalary: " + Salary 			+ 	"\nDepartment: " + Department;
	}
}

class Employeee{
	public static void main(String[] args){
		Officer D1= new Officer("julia",34,9372482,"ABC valley",9875,"AR");
		Manager M1 = new Manager("jomon",38,9372482,"DEF valley",9465,"CS");
		System.out.println(D1.toString());
		System.out.println(M1.toString());
		
	}
}
		
		
