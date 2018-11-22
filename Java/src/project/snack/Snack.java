package project.snack;

import java.util.List;

import project.ingredient.Ingredient;

public class Snack {
	
	private List<Ingredient> listIngredient;
	private String name;
	private double value;
	
	public Snack() {
		super();
	}
	
	public Snack(List<Ingredient> listIngredient, String name) {
		super();
		this.listIngredient = listIngredient;
		this.name = name;
	}

	public Snack(List<Ingredient> listIngredient, String name,double value) {
		super();
		this.listIngredient = listIngredient;
		this.name = name;
		this.value=value;
	}

	public List<Ingredient> getListIngredient() {
		return listIngredient;
	}

	public void setListIngredient(List<Ingredient> listIngredient) {
		this.listIngredient = listIngredient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double calculateValue() {
		double value=0;
		
		for (Ingredient ingredient : listIngredient) {
			value+=ingredient.getValue();
		}
		
		return value;
	}
	
	public void setValue(double value) {
		this.value=value;
	}
	
	public double getValue() {
		return this.value;
	}

}
