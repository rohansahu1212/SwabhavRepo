package com.monocept.model;

import java.util.HashMap;

public class AuthService {
	private static AuthService auth=null;
    HashMap<Integer, User> students= new HashMap<Integer, User>();
	private AuthService() {
		students.put(1, new User(1, "pass", "Rohan","rohanshau1212@gmail.com", true));
		students.put(2, new User(2, "pass", "Mohan","mohanshau1212@gmail.com", true));
		students.put(3, new User(3, "pass", "Sohan","sohanshau1212@gmail.com", true));
		students.put(4, new User(4, "pass", "Zohan","zohanshau1212@gmail.com", true));
		students.put(5, new User(5, "pass", "Fohan","fohanshau1212@gmail.com", true));
	}
	public static  AuthService getInstance() {
		if(auth==null)
			auth= new AuthService();
		return auth;
	}
	
	public UserDTO getUser(int loginId, String password) {
		User userdata=students.get(loginId);
		if(userdata.getPassword().equals(password))
			return new UserDTO(userdata.getName(), userdata.getEmail());
		return null;
		

	}
	
	
	
}
