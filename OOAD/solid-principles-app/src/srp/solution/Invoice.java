package srp.solution;

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

	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public double getAmount() {
		return amount;
	}

	public float getTax() {
		return tax;
	}

	public double getDiscountPercent() {
		return discountPercent;
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

}
