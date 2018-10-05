package com.week6.proxy;


public class AbsenteeVoter implements Election {
	
	String name;
	public String ineligibleVoters;
	
	
    @Override
    public void parlimentaryElection(String voterName) throws Exception {
        System.out.println(voterName + " voted in 2017 parliamentry election via proxy.");
    }
    
    
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    
    
}
