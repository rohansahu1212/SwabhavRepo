package com.swabhav;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("svc2")
public class HowdyService {
	@Value("${message.goodbye}")
	 String message;
	public  String getMessages() {
		return message;
	}
}
