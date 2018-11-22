package project.ingredient;

public class Ingredient {
	
	private String name;
	private double value;
	private int qty;
	
	public Ingredient() {
		super();
	}
	
	public Ingredient(String name, double value) {
		super();
		this.name = name;
		this.value = value;
	}
	
	public Ingredient(String name, double value, int qty) {
		super();
		this.name = name;
		this.value = value;
		this.qty=qty;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
}
