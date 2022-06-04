package com.monocept;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import com.monocept.domain.Aircraft;
import com.monocept.domain.FlightInformation;
import com.monocept.domain.FlightType;
@Component
public class ApplicationRunner implements CommandLineRunner {
	 
	
	private MongoTemplate mongoTemplate;
	
	public ApplicationRunner(MongoTemplate mongoTemplate) {
		this.mongoTemplate=mongoTemplate;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		
		FlightInformation flightInfo= new FlightInformation();
		flightInfo.setAircraft(new Aircraft("boeing 76", 120));
		flightInfo.setDepartureCity("mumbai");
		flightInfo.setDestinationCity("delhi");
		flightInfo.setFlightType(FlightType.INTERNAL);
		this.mongoTemplate.save(flightInfo);
		
		System.out.println("aplication started");
		
	}

}
