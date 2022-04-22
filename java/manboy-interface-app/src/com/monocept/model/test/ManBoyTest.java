package com.monocept.model.test;

import com.monocept.model.Boy;
import com.monocept.model.IEmotional;
import com.monocept.model.IMannerable;
import com.monocept.model.Man;

public class ManBoyTest {
	public static void main(String[] args) {
		Man man = new Man();
		Boy boy = new Boy();
		
		atTheMovieHall(boy);
		atThePartyHall(boy);
		
	//	atTheMovieHall(man);
		atThePartyHall(man);
		
	}

	public static void atTheMovieHall(IEmotional obj) {
		System.out.println("at the movie");
		obj.cry();
		obj.laugh();
	}
	public static void atThePartyHall(IMannerable obj) {
		System.out.println("at the party hall");
		obj.wish();
		obj.depart();
		
	}
}
