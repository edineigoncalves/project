package project.promotion;

import java.util.List;

import project.constants.IngredientConstants;
import project.ingredient.Ingredient;
import project.snack.Snack;

public final class Promotion {
	
	private Promotion() {
		super();
	}
		
	public static double calculeValueLight(Snack snack) {
		boolean containsAlface=false;
		boolean containsBacon=false;
		
		containsAlface=searchItemInList(snack.getListIngredient(),IngredientConstants.Alface);
		
		if(containsAlface) {			
			containsBacon=searchItemInList(snack.getListIngredient(),IngredientConstants.Bacon);
		}				
		return !containsBacon && containsAlface ? snack.getValue()*0.90 : snack.getValue();
	}

	private static boolean searchItemInList(List<Ingredient> listIngredient,String item) {
		boolean contains=false;
		for (Ingredient ingredient : listIngredient) {
			if(verifyItemInSnack(ingredient, item)) {
				contains=true;
				break;
			}
		}
		return contains;
	}
	
	
	private static int searchItemInListAndReturnQty(List<Ingredient> listIngredient,String item) {
		int qty=0;
		for (Ingredient ingredient : listIngredient) {
			if(verifyItemInSnack(ingredient, item)) {
				qty++;
			}
		}
		return qty;
	}

	private static boolean verifyItemInSnack(Ingredient ingredient,String item) {
		return ingredient.getName().equals(item);
	}
	
	
	public static int moreBeefOrChesse(Snack snack,String item) {
		boolean containsHamburger= searchItemInList(snack.getListIngredient(), item);
		int qtyPay=0;
		
		if(containsHamburger) {
			int qtyFound=searchItemInListAndReturnQty(snack.getListIngredient(), item);
			if(qtyFound % 3 ==0) {
				qtyPay = (qtyFound/3)*2;
			}
		}
		return qtyPay;		
	}
	
	public static double minusInflation(Snack snack,double valueInflacion) {
		double valueInflation=snack.calculateValue()*((100-valueInflacion)/100);
		return snack.calculateValue()-valueInflation;
	}
	
	
}
