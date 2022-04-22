package com.monocept.test;

import java.util.Iterator;
import java.util.List;

import com.monocept.check.Builder;
import com.monocept.check.Type;
import com.monocept.check.Wood;
import com.monocept.middle.Guitar;
import com.monocept.middle.GuitarSpec;
import com.monocept.middle.Inventory;

public class FindGuitarTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 12, Wood.ALDER,
				Wood.ALDER);
		List matchingGuitars = inventory.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars: ");
			for (Iterator i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				GuitarSpec spec = guitar.getSpec();
				System.out.println("We have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType() + " "
						+ " guitar:\n" + spec.getBackWood() + " back and sides,\n      " + spec.getTopWood()
						+ " top.\n YOu can have it for only $" + guitar.getPrice() + "\n------------");

			}

		} else
			System.out.println("Sorry,Erin,we have nothing for you");
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("2305", 3450.8, "Stratocastor", 12, Builder.GIBSON, Type.ACOUSTIC, Wood.CEDAR, Wood.COCOBOLO);
		inventory.addGuitar("4005", 3660.8, "Stratocastor", 12, Builder.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
	}
}
