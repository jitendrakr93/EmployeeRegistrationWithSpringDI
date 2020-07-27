package com.employee.service;

import com.employee.bo.EmployeeBO;
import com.employee.dao.EmployeeDAO;
import com.employee.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {

	private  EmployeeDAO dao;
	
	public EmployeeServiceImpl(EmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public String calculateIntrestAmount(EmployeeDTO dto) throws Exception {
	    EmployeeBO bo=null;
	    int count=0;
		//calculate net salary amount
	   int netSalary=dto.getFullPackage()-5000;
	   ////calculate gross salary amount
	   int grossSalary=dto.getFullPackage()-5000;
		//prepare CustomerBO object having persistable data...
	    bo=new EmployeeBO();
	   bo.setCustomerName(dto.getCustomerName()); 
	bo.setCustomerAddress(dto.getCustomerAddress());	
	bo.setCustomerContactNo(dto.getCustomerContactNo());	
	bo.setCustomerType(dto.getCustomerType());
	bo.setNumberOfWorkingDays(dto.getNumberOfWorkingDays());
	bo.setNumberOfDaysWorked(dto.getNumberOfDaysWorked());
	bo.setFullPackage(dto.getFullPackage());
	bo.setGrossSalary(grossSalary);	
	bo.setNetSalary(netSalary);
	    //use dAO
	    count=dao.insert(bo);
	    // process the result
	    if(count==0)
	    	  return "Customer Registration failed ";
	    else 
	    	 return "Customer Registration Succeded ";
	}
}
