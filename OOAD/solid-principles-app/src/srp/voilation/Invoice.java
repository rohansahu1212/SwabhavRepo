package srp.voilation;

public class Invoice {
	private String id;
	private String description;
	private double amount;
	private float tax;
	private double discountPercent;

	public Invoice(String id, String description, float tax, double discountPercent, double amount) {

		this.id = id;
		this.description = description;
		this.tax = tax;
		this.discountPercent = discountPercent;
		this.amount = amount;

	}

	public double calculateTax() {
		double tax = (20.0 / 100.00) * amount + amount;
		return tax;
	}

	public double calculateDiscount() {
		double discount = amount - (discountPercent / 100.00);
		return discount;
	}

	public double calculateTotal() {
		double total = amount + calculateTax() - calculateDiscount();
		return total;
	}

	public void printDetails() {
		System.out.println("Customer id " + id);
		System.out.println("Item Descirption " + description);
		System.out.println("Item cost " + amount);
		System.out.println("GST tax + " + calculateTax());
		System.out.println("Discount -" + calculateDiscount());
		System.out.println("final payble amount " + calculateTotal());
	}
}
