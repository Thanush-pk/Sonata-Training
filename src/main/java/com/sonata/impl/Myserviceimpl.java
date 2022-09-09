package com.sonata.impl;

import java.util.*;

import com.sonata.intf.Myserviceintf;

public class Myserviceimpl {
	Myserviceintf service;
	Myserviceimpl(){}
	public Myserviceimpl( Myserviceintf service){
		this.service=service;
	}
	public List<String> reterieveRelated(String user){
		
		List<String> filterValue=new ArrayList<String>();
		List<String> alltoDo=service.retrieveusers(user);
		for(String all:alltoDo) {
			if (all.contains("Spring"))
				filterValue.add(all);
			
		}
		
		return filterValue;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
