package OOPSConcepts;

class Employee {
	private String name;
	private String jobTitle;
	private double Salary;

	public Employee(String name, String jobTitle, double Salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.Salary = Salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public double getSalary() {
		return Salary;
	}
	
	public void setSalary(double Salary) {
		this.Salary = Salary;
	}
	
	public void updateSalary(double percentage) {
		Salary= Salary + Salary * percentage/100;
	}
}

public class CalculateAndUpdateSalary {

	public static void main(String[] args) {

		Employee ep = new Employee("Prajakta", "QA Engineer", 40000);
		System.out.println(ep.getName()+", "+ep.getJobTitle()+","+ep.getSalary());
		Employee ep2 = new Employee("Amar", "Networking", 80000);
		
		ep.updateSalary(10);
		System.out.println(ep.getName()+", "+ep.getJobTitle()+","+ep.getSalary());
	}

}
