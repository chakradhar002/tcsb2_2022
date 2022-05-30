package com.demo.service;

import com.demo.bean.Pensioner;

public interface PensionerService {
	
	//GET PensionerDetailss servcie
	Pensioner getPensionerDetailsByAaddhar(long aadharcardid);
	
	//GET  procession service
	Pensioner processPension(Pensioner Pensioner);
	
	//POST  loign  service
	
	Pensioner loginPension(String username,String password);
	
	//post
	Integer pensionCalculator(double basicsalary,double dearnessallowance,int workedageinorganization);

}
