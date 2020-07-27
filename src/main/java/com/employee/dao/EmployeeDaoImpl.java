package com.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.employee.bo.EmployeeBO;

public class EmployeeDaoImpl implements EmployeeDAO {
	private static final String CUSTOMER_INSERT_QUERY = "INSERT INTO CUSTOMER VALUES(CNO_SEQ1.NEXTVAL,?,?,?,?,?,?,?,?,?)";
	private DataSource ds;

	public EmployeeDaoImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(EmployeeBO bo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int count = 0;
		// get pooled jdbc connection
		con = ds.getConnection();
		// create PreparedStatement object
		ps = con.prepareStatement(CUSTOMER_INSERT_QUERY);
		// set values to query params
		ps.setString(1, bo.getCustomerName());
		ps.setString(2, bo.getCustomerAddress());
		ps.setString(3, bo.getCustomerContactNo());
		ps.setString(4, bo.getCustomerType());
		ps.setInt(5, bo.getNumberOfWorkingDays());
		ps.setInt(6, bo.getNumberOfDaysWorked());
		ps.setInt(7, bo.getFullPackage());
		ps.setInt(8, bo.getGrossSalary());
		ps.setInt(9, bo.getNetSalary());
		// execute the SQL query
		count = ps.executeUpdate();
		// close jdbc objs
		ps.close();
		con.close();
		return count;
	}
}
