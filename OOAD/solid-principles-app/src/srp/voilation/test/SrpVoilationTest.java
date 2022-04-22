package srp.voilation.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import srp.voilation.Invoice;

class SrpVoilationTest {

	@Test
	void test() {
	Invoice invoice = new Invoice("11","item ",10, 20,1000000);
	invoice.printDetails();
	
	}

}
