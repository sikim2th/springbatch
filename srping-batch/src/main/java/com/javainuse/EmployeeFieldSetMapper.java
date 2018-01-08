package com.javainuse;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.javainuse.model.Employee;

public class EmployeeFieldSetMapper implements FieldSetMapper<Employee> {

	@Override
	public Employee mapFieldSet(FieldSet fieldSet) throws BindException {

		Employee employee = new Employee();
		employee.setEmployeeName(fieldSet.readString(0));
		employee.setEmployeeId(fieldSet.readString(1));
		return employee;

	}

}