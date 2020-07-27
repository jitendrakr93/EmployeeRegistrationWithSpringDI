package com.employee.vo;

public class EmployeeVO {
	private String employeeName;
	private String employeeAddress;
	private String employeeContactNo;
	private String employeeType;
	private String numberOfWorkingDays;
	private String numberOfDaysWorked;
	private String fullPackage;

	public String getCustomerName() {
		return employeeName;
	}

	public void setCustomerName(String customerName) {
		this.employeeName = customerName;
	}

	public String getCustomerAddress() {
		return employeeAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.employeeAddress = customerAddress;
	}

	public String getCustomerContactNo() {
		return employeeContactNo;
	}

	public void setCustomerContactNo(String customerContactNo) {
		this.employeeContactNo = customerContactNo;
	}

	public String getCustomerType() {
		return employeeType;
	}

	public void setCustomerType(String customerType) {
		this.employeeType = customerType;
	}

	public String getNumberOfWorkingDays() {
		return numberOfWorkingDays;
	}

	public void setNumberOfWorkingDays(String numberOfWorkingDays) {
		this.numberOfWorkingDays = numberOfWorkingDays;
	}

	public String getNumberOfDaysWorked() {
		return numberOfDaysWorked;
	}

	public void setNumberOfDaysWorked(String numberOfDaysWorked) {
		this.numberOfDaysWorked = numberOfDaysWorked;
	}

	public String getFullPackage() {
		return fullPackage;
	}

	public void setFullPackage(String fullPackage) {
		this.fullPackage = fullPackage;
	}
}
