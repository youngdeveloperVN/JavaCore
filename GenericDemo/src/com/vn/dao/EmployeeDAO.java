package com.vn.dao;

import com.vn.entity.Employee;

public class EmployeeDAO extends DAOCommon<Employee> {
	
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		Employee employee = new Employee();
		dao.update(employee);
	}

}
