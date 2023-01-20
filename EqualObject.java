class Employee {
 private int emp_id;
 private String emp_name;
 private String country;
 
public Employee(int emp_id, String emp_name, String country) {
	super();
	this.emp_id = emp_id;
	this.emp_name = emp_name;
	this.country = country;
}

public int getEmp_id() {
	return emp_id;
}

public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}

public String getEmp_name() {
	return emp_name;
}

public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}
}

public class EqualObject {

	public static void main(String[] args) {
		
		Employee emp= new Employee(001, "ABC", "India");
		Employee emp1= new Employee(001, "ABC", "India");
		
		if(emp.equals(emp1))
		{
			System.out.println("Both object are equals");
		}
		else
		{
			System.out.println("Both are not equals");
		}

	}

}
