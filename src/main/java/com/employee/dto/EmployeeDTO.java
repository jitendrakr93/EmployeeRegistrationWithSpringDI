package com.employee.dto;

public class EmployeeDTO {

	private String employeeName;
	private String employeeAddress;
	private String employeeContactNo;
	private String employeeType;
	private int numberOfWorkingDays;
	private int numberOfDaysWorked;
	private int fullPackage;
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
	public int getNumberOfWorkingDays() {
		return numberOfWorkingDays;
	}
	public void setNumberOfWorkingDays(int numberOfWorkingDays) {
		this.numberOfWorkingDays = numberOfWorkingDays;
	}
	public int getNumberOfDaysWorked() {
		return numberOfDaysWorked;
	}
	public void setNumberOfDaysWorked(int numberOfDaysWorked) {
		this.numberOfDaysWorked = numberOfDaysWorked;
	}
	public int getFullPackage() {
		return fullPackage;
	}
	public void setFullPackage(int fullPackage) {
		this.fullPackage = fullPackage;
	}

}
