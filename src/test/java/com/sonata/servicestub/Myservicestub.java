package com.sonata.servicestub;

import java.util.Arrays;
import java.util.List;



import com.sonata.intf.Myserviceintf;

public class Myservicestub implements Myserviceintf {

	@Override
	public List<String> retrieveusers(String users) {
		// TODO Auto-generated method stub
		return Arrays.asList("Lesrn Spring MVC","learn Spring","Learn dance");
		
	}

}
