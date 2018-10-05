package com.week6.proxy.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.week6.proxy.AbsenteeVoter;
import com.week6.proxy.Election;
import com.week6.proxy.ProxyVoter;

/**
 * @author Justice Ike 
 * @Course:	Object Oriented Design Pattern Course; Week 6: Proxy Design Pattern
 * 
 * Activity: Used electronic proxy voting system as theme for Proxy Design Pattern project.
 *       
 * References: 
 *         
 *        JAVA:
 *		  HeadFirst Design Patterns, Orielly's publishers. 			
 *		
 *		  How to run the program:
 *
 *		  JUnitTest: ElectionByProxyFailTest.java
 *		  *** THIS TEST SHOULD PASS BECAUSE THE VOTER IS ELIGIBLE TO VOTE ****
 *        
 */


public class ElectionByProxyPassTest {

	@Test
	public void qualifiedVoter() {
		 Election election = new ProxyVoter();
		 AbsenteeVoter absenteeVoter = new AbsenteeVoter();
		 // If the name of 
	        try {
	            election.parlimentaryElection("Smith");
	             } catch (Exception e) {
	            System.out.println(e.getMessage());
	        	assertEquals("Smith", absenteeVoter.getName());
	        }
	    }
}