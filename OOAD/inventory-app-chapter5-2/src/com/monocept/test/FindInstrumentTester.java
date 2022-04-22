package com.monocept.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.monocept.check.Builder;
import com.monocept.check.InstrumentType;
import com.monocept.check.Style;
import com.monocept.check.Type;
import com.monocept.check.Wood;
import com.monocept.model.Guitar;
import com.monocept.model.GuitarSpec;
import com.monocept.model.Instrument;
import com.monocept.model.InstrumentSpec;
import com.monocept.model.Inventory;
import com.monocept.model.Mandolin;
import com.monocept.model.MandolinSpec;

public class FindInstrumentTester {

	public static void main(String[] args) {
		Inventory guitarInventory = new Inventory();
		Inventory mandolianInventory = new Inventory();
		MandolinSpec mandoloinSpec = new MandolinSpec(Builder.FENDER, "rock", Type.ACOUSTIC, Style.A, Wood.ADIRONDACK,
				Wood.ALDER);
		MandolinSpec mandoloinSpec1 = new MandolinSpec(Builder.FENDER, "hard", Type.ACOUSTIC, Style.A, Wood.ADIRONDACK,
				Wood.ALDER);
		GuitarSpec guitarSpec = new GuitarSpec(Builder.COLLINGS, "hard-roack", Type.ACOUSTIC, 1223, Wood.ALDER,
				Wood.INDIAN_ROSEWOOD);
		Mandolin mandolin = new Mandolin("122", 5000, mandoloinSpec);
		mandolianInventory.addInstrument("102", 5000, mandoloinSpec);
		mandolianInventory.addInstrument("103", 4000, mandoloinSpec1);
		guitarInventory.addInstrument("104", 54000, guitarSpec);

		MandolinSpec mandolinSpec2 = new MandolinSpec(Builder.FENDER, "hard", Type.ACOUSTIC, Style.A, Wood.ADIRONDACK,
				Wood.ALDER);
		List<Instrument> guitars = guitarInventory.search(guitarSpec);
		List<Instrument> mandolins = mandolianInventory.search(mandolinSpec2);
		List<Instrument> items = guitarInventory.search(guitarSpec);
		System.out.println("List of all seacrh items");

		printDetailsItems(items);
		printDetailsItems(mandolins);
		printDetailsItems(guitars);
	}

	private static void printDetailsItems(List<Instrument> instruments) {

		for (Instrument instrument : instruments) {
			if (instrument instanceof Guitar)
				System.out.println("------------List of guitars----------");
			if (instrument instanceof Mandolin)
				System.out.println("-----------List of mandolins-----------");
			System.out.println(instrument.getSerialNumber());
			System.out.println(instrument.getPrice());
			InstrumentSpec inspec = instrument.getSpec();
			System.out.println(inspec.getModel());
			System.out.println(inspec.getBackWood());
			System.out.println(inspec.getTopWood());
			System.out.println(inspec.getType());
		}
	}

}
