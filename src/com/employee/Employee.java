package com.employee;

public class Employee {
	public enum Grades {
		U1, U2, U3, U4, P1, P2
	}

	public int empId;
	public String empName;
	public String grade;

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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) throws InvalidGradeException {
		try {
			this.grade = Grades.valueOf(grade).name();
		}
		catch (IllegalArgumentException e) {
			throw new InvalidGradeException(grade);
		}
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", grade=" + grade + "]";
	}
	
	public String stringifyForFile() {
		return empId + ", " + empName + ", " + grade + "\n";
	}

}
