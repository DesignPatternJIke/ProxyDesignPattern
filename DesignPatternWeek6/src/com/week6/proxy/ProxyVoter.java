package com.week6.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyVoter implements Election {
	private AbsenteeVoter election = new AbsenteeVoter();
	private static List<String> ineligibleVoters;

	// If the name exist in (ineligible voter list)
	// Refuse to vote for the person.
	static {
		ineligibleVoters = new ArrayList<>();
		ineligibleVoters.add("frank");

	}

	@Override
	public void parlimentaryElection(String voterName) throws Exception {
		if (ineligibleVoters.contains(voterName.toLowerCase())) {
			throw new Exception(voterName + " you cannot vote!  Your name is in the inegligible voters list!");
		}

		election.parlimentaryElection(voterName);
	}

}
