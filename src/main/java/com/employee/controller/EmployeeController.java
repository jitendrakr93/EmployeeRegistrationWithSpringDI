package com.employee.controller;

import com.employee.dto.EmployeeDTO;
import com.employee.service.EmployeeService;
import com.employee.vo.EmployeeVO;

public class EmployeeController {
	private EmployeeService service;
	 
	  //for constructor injection
	public EmployeeController(EmployeeService service) {
		this.service = service;
	}
	
	public  String  processCustomer(EmployeeVO  vo)throws Exception{
		EmployeeDTO dto=null;
		String result=null;
		//convert  VO class object to DTO class object
		dto=new EmployeeDTO();
		dto.setCustomerName(vo.getCustomerName());
		dto.setCustomerAddress(vo.getCustomerAddress());
		dto.setCustomerContactNo(vo.getCustomerContactNo());
		dto.setCustomerType(vo.getCustomerType());
		dto.setNumberOfWorkingDays(Integer.parseInt(vo.getNumberOfWorkingDays()));
		dto.setNumberOfDaysWorked(Integer.parseInt(vo.getNumberOfDaysWorked()));
		dto.setFullPackage(Integer.parseInt(vo.getFullPackage()));
		//use service
		result=service.calculateIntrestAmount(dto);
		return result;
	}

}
