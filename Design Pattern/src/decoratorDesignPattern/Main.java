package decoratorDesignPattern;

public class Main {
	
	public static void main(String[] args) {
		
		BasePizza extraCheese = new ExtraCheese(new Margherita());
		System.out.println(extraCheese.cost());
		BasePizza mushroom = new Mushroom(extraCheese);
		System.out.println(mushroom.cost());
	}

}
