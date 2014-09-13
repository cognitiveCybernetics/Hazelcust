package com.hazelcast;

import java.util.Map;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class GettingStarted {
	
	public static void main(String[] args) {
		
		HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance();
		Map<Integer, String> customers = hazelcastInstance.getMap( "customers" );	
		
		for (int j=0;j<1000;j++) {
			customers.put(j, "value "+j);
		}
		
		System.out.println( "Customer with key 1: " + customers.get(1) );
		//System.out.println( "Map Size:" + ((Map<Integer, String>) hazelcastInstance).size() );
		
	}
}
