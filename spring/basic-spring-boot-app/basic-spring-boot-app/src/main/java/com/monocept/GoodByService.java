package com.monocept;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("svc1")
public class GoodByService {
	@Value("${message.howdy}")
	 String message;
	public String getMessage() {
	
		return message;
	}
}
