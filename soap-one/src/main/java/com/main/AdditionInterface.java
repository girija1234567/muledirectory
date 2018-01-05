package com.main;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface AdditionInterface 
{
	@WebMethod
	int add(int a,int b);


}
