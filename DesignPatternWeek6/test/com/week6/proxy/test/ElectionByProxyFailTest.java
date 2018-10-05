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
 *		  *** THIS TEST SHOULD FAIL BECAUSE THE VOTER IS NOT ELIGIBLE TO VOTE ****
 *        
 */

public class ElectionByProxyFailTest {


	// ***** THIS TEST SHOULD FAIL BECAUSE THE VOTER IS NOT ELIGIBLE TO VOTE ********
	@Test
	public void unQualifiedVoter() {
		 Election election = new ProxyVoter();
		 AbsenteeVoter absenteeVoter = new AbsenteeVoter();
		 
		// Frank's name exist in (ProxyVoter.java) ineligible voters ArrayList.
		 // ineligibleVoters.add("frank"); 
		  
 	        try {
	            election.parlimentaryElection("frank");
	             } catch (Exception e) {
	            System.out.println(e.getMessage());
	        	assertEquals("frank", absenteeVoter.getName());
	        }
	

	}
}
