package com.monocept.test;

import com.monocept.model.DogDoor;
import com.monocept.model.Remote;

public class DogDoorSimulatorTest {
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		System.out.println();
		remote.pressButton();
		System.out.println("\n Fido's gone outside ");
		 try {
			 System.out.println("sleepin");
			 Thread.currentThread().sleep(10000);
			 System.out.println("exit");
		 }
		 catch(InterruptedException e) {
			 System.out.println("...but he's stuck outside ");
			 System.out.println("\n fido's start barking.....");
			 System.out.println(".... so gina grabs the remote control.");
			 remote.pressButton();
			 System.out.println("\n fido's back inside");
		 }
	}
}
