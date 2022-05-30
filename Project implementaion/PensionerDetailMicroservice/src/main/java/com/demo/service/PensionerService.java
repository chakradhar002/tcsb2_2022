package com.demo.service;

import com.demo.bean.Pensioner;

public interface PensionerService {
	
	//GET PensionerDetailss servcie
	Pensioner getPensionerDetailsByAaddhar(long aadharcardid);

	
	//post
	Integer pensionCalculator(double basicsalary,double dearnessallowance,int workedageinorganization);

}
