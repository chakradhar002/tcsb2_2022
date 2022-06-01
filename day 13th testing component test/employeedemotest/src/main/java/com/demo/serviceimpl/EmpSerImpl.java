package com.demo.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jca.cci.RecordTypeNotSupportedException;
import org.springframework.stereotype.Service;

import com.demo.bean.Employee;
import com.demo.exceptionlayer.RecordNotFoundException;
import com.demo.repo.EmpRepo;
import com.demo.service.EmpService;

@Service
public class EmpSerImpl implements EmpService {

	@Autowired
	EmpRepo emprepo;

	@Override
	public Employee addEmployee(Employee emp) {

		if (emp.getId() == null) {

			emp = emprepo.save(emp);
			return emp;

		} else {

			Optional<Employee> empoptionl = emprepo.findById(emp.getId());

			if (empoptionl.isPresent()) {

				Employee newrecord = empoptionl.get();
				newrecord.setFirstname(emp.getFirstname());
				newrecord.setLastname(emp.getLastname());

				newrecord = emprepo.save(newrecord);
				return newrecord;
			} else {

				throw new RecordNotFoundException("no employee record exist for given id");
			}
		}

	}

}
