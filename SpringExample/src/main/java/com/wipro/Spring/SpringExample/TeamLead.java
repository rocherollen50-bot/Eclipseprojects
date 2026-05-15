package com.wipro.Spring.SpringExample;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class TeamLead implements Allocator{


	public void taskAllocation(String user) {
		// TODO Auto-generated method stub
		
		System.out.println("The task is allocated by TeamLeader to " + user);
		
	}

	
}
