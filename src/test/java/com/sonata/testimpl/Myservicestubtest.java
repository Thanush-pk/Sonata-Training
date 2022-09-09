package com.sonata.testimpl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.sonata.impl.Myserviceimpl;
import com.sonata.intf.Myserviceintf;
import com.sonata.servicestub.Myservicestub;

class Myservicestubtest {

	@Test
	void test() {
		
		Myserviceintf my =new Myservicestub();
		Myserviceimpl mys=new Myserviceimpl(my);
		List<String> filtermyser =mys.reterieveRelated("Dummy");
		assertEquals(2, filtermyser.size());
		
//		fail("Not yet implemented");
	}

}
