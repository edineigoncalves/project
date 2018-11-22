package project.main;

import java.util.ArrayList;
import java.util.List;

import project.constants.IngredientConstants;
import project.ingredient.Ingredient;
import project.snack.Snack;

public class MainClass {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ingredient alface= new  Ingredient(IngredientConstants.Alface,0.40);
		Ingredient bacon= new  Ingredient(IngredientConstants.Bacon,2.00);
		Ingredient hamburger= new  Ingredient(IngredientConstants.Hamburguer,3.00);
		Ingredient ovo= new  Ingredient(IngredientConstants.Ovo,0.80);
		Ingredient queijo= new  Ingredient(IngredientConstants.Queijo,1.50);
		
		List<Ingredient> listXbacon= new ArrayList<>();
		listXbacon.add(bacon);
		listXbacon.add(hamburger);
		listXbacon.add(queijo);
		
		Snack xBacon = new Snack(listXbacon, "X-Bacon");
		xBacon.setValue(xBacon.calculateValue());
		
		List<Ingredient> listXburger= new ArrayList<>();
		listXburger.add(hamburger);
		listXburger.add(queijo);
		
		Snack xBurger = new Snack(listXburger, "X-Burger");
		xBurger.setValue(xBurger.calculateValue());
		
		List<Ingredient> listXegg= new ArrayList<>();
		listXegg.add(ovo);
		listXegg.add(hamburger);
		listXegg.add(queijo);
		
		Snack xEgg = new Snack(listXegg, "X-Egg");
		xEgg.setValue(xEgg.calculateValue());	
		
		List<Ingredient> listXeggBacon= new ArrayList<>();
		listXeggBacon.add(ovo);
		listXeggBacon.add(hamburger);
		listXeggBacon.add(queijo);
		listXeggBacon.add(bacon);
		
		Snack xEggBacon = new Snack(listXeggBacon, "X-Egg Bacon");
		xEggBacon.setValue(xEggBacon.calculateValue());	
		
		
	}

}
