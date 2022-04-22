package srp.solution;

public class InvoiceConsolePrinter {
	public void printDetails(Invoice invoice) {

		System.out.println("Customer id " + invoice.getId());
		System.out.println("Item Descirption " + invoice.getDescription());
		System.out.println("Item cost " + invoice.getAmount());
		System.out.println("GST tax + " + invoice.calculateTax());
		System.out.println("Discount - " + invoice.calculateDiscount());
		System.out.println("final payble amount " + invoice.calculateTotal());
	}
}
