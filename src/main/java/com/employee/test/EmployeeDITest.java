package com.employee.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.employee.controller.EmployeeController;
import com.employee.vo.EmployeeVO;

public class EmployeeDITest {

	public static void main(String[] args) {
		Scanner sc = null;
		String employeeName = null, employeeAddress = null, employeeContactNo = null, employeeType = null;
		String numberOfWorkingDays = null, numberOfDaysWorked = null, fullPackage = null;
		EmployeeVO vo = null;
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		EmployeeController controller = null;
		String result = null;
		// read inputs
		sc = new Scanner(System.in);
		System.out.println("enter Customername :: ");
		employeeName = sc.next();
		System.out.println("Enter customer Addrs::");
		employeeAddress = sc.next();
		System.out.println("Enter customer  customerContactNo::");
		employeeContactNo = sc.next();
		System.out.println("Enter customer customerType::");
		employeeType = sc.next();
		System.out.println("Enter numberOfWorkingDays   ::");
		numberOfWorkingDays = sc.next();
		System.out.println("Enter numberOfDaysWorked   ::");
		numberOfDaysWorked = sc.next();
		System.out.println("Enter fullPackage   ::");
		fullPackage = sc.next();
		// Store inputs in VO class object
		vo = new EmployeeVO();
		vo.setCustomerName(employeeName);
		vo.setCustomerAddress(employeeAddress);
		vo.setCustomerContactNo(employeeContactNo);
		vo.setCustomerType(employeeType);
		vo.setNumberOfWorkingDays(numberOfWorkingDays);
		vo.setNumberOfDaysWorked(numberOfDaysWorked);
		vo.setFullPackage(fullPackage);
		// create BEanFacory IOC container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/employee/cfgs/applicationContext.xml");
		// get Controller Bean class object..
		controller = factory.getBean("controller", EmployeeController.class);
		// invoke the method
		try {
			result = controller.processCustomer(vo);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Internal Problem");
			e.printStackTrace();
		}
	}// main
}
