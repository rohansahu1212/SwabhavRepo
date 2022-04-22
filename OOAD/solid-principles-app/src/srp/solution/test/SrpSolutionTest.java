package srp.solution.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import srp.solution.Invoice;
import srp.solution.InvoiceConsolePrinter;

class SrpSolutionTest {

	@Test
	void test() {
		Invoice invoice = new Invoice("102", "tax on item", 10, 20, 400000);
		InvoiceConsolePrinter invoiceConPrint = new InvoiceConsolePrinter();
		invoiceConPrint.printDetails(invoice);
	}

}
