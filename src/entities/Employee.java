package entities;

public class Employee {

	private Double salary;
	private Double vacation;
	private Double thirtheenthSalary;
	private Integer workedMonths;
	
	public Employee() {
		
	} 

	public Employee(Double salary, Double vacation, Double thirtheenthSalary, Integer workedMonths) {
		this.salary = salary;
		this.vacation = vacation;
		this.thirtheenthSalary = thirtheenthSalary;
		this.workedMonths = workedMonths;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getVacation() {
		return vacation;
	}

	public void setVacation(Double vacation) {
		this.vacation = vacation;
	}

	public Double getThirtheenthSalary() {
		return thirtheenthSalary;
	}

	public void setThirtheenthSalary(Double thirtheenthSalary) {
		this.thirtheenthSalary = thirtheenthSalary;
	}

	public Integer getWorkedMonths() {
		return workedMonths;
	}

	public void setWorkedMonths(Integer workedMonths) {
		this.workedMonths = workedMonths;
	}

	public double raiseSalary() {
		if (salary < 1100.00) {
			return salary += salary * 0.15;
		} else if (salary >= 1100.00 && salary >= 2600.00) {
			return salary += salary * 0.10;
		} else {
			return salary += salary * 0.05;
		}
	}
	
	public double vacationSalary() {
		return vacation = salary + salary / 3;
		
	}
	
	public double handleThirtheenthSalary() {
		return thirtheenthSalary = (salary / 12) * workedMonths;
	}
	
}
