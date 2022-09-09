package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.sonata.DAO.Emplyoeeimpl;
import com.sonata.emodel.Emplyoee;

class EmplyoeeTest {
	    
	    Emplyoee e1= new Emplyoee();
	    Emplyoeeimpl e2=new Emplyoeeimpl();
	    @Test
	    public void dbTest1() {
	        e1.setEmpid(11);
	        e1.setEmpname("ram");
	        e1.setEmpsal(5000.00);
	        assertEquals(0, e2.save(e1));
	    }
	    
	    @Test
	    public void dbTest2() {
	        e1.setEmpid(13);
	        e1.setEmpname("Raj");
	        e1.setEmpsal(8000.00);
	        assertEquals(1, e2.save(e1));
	    }
	
	
	
	
	}


