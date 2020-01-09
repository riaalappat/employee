package com.deloitte.Emp.Employee.model;

import javax.persistence.*;

@Entity
@Table(name="Employee_details")

public class Employee{
	
		@Id
		@Column(name="empId")
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int empId;
		private String empName;
		private float salary;
		
		
		public Employee() {}
		
		public Employee(int empId, String empName, float salary) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.salary = salary;
		}



		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public float getSalary() {
			return salary;
		}

		public void setSalary(float salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
		}
		
		

	}




