package lab2Anna;
import static lab2Anna.Main.line;

/*Продукты (на 1 порцию)
Банан - 1 шт. (вес мякоти - 130 г)
Мороженое сливочное - 100 г
Молоко - 150 мл

Всё это положить в блендер и перемешать*/

public class MilkshakeWithBananaAndIceCream extends NonAlcoholicCocktail {
	
	private Product banana;
	private Product creamyIceCream;
	private SoftDrink milk;
	private String actAddBlender;
	private String actMixBlender;
	
	public MilkshakeWithBananaAndIceCream() {
		
		this.banana = new Product(130);
		this.creamyIceCream = new Product(100);
		this.milk = new SoftDrink(150);
		this.actAddBlender = Action.ADD_IN_BLENDER.getAction();
		this.actMixBlender = Action.MIX_IN_BLENDER.getAction();
		
	}
	
	public String toString() { 
		
		return  line + "\nРецепт коктейля " + getClass().getSimpleName() + " из класса " + getClass().getSuperclass().getSimpleName() + "\n" + line
				+ "\n" + actAddBlender + " Мякоть банана:  \t\t" + banana.getGramms() + " грамм"
				+ "\n" + actAddBlender + " Сливочное мороженое:  \t" + creamyIceCream.getGramms() + " грамм"
				+ "\n" + actAddBlender + " Молоко:  \t\t\t" + milk.getVolumeInMl() + " мл"
				+ "\n" + actMixBlender + "\n" + line;
				
	}
	
	

}
