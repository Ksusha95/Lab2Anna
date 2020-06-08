package lab2Anna;
import static lab2Anna.Main.line;

/*Молоко - 400 мл
  Бананы - 3-4 шт (500 г).
  Апельсиновый сок - 400 мл
  Сахар - 5 г
  Лед - 25 г 
  
  *
  *Всё добавить в блендер, взбить и добавить лёд */

public class Tropical extends NonAlcoholicCocktail {
	
	private Product banana;
	private Product sugar;
	private Product ice;
	private SoftDrink milk;
	private SoftDrink orangeJuice;
	private String actAddBlender;
	private String actMixBlender;
	private String actAdd;
	
	
	public Tropical() {
		
		this.banana = new Product(500);
		this.sugar = new Product(5);
		this.ice = new Product(25);
		this.orangeJuice = new SoftDrink(400);
		this.milk = new SoftDrink(400);
		this.actAddBlender = Action.ADD_IN_BLENDER.getAction();
		this.actMixBlender = Action.MIX_IN_BLENDER.getAction();
		this.actAdd = Action.ADD.getAction();
		
	}
	
	public String toString() { 
		
		return  line + "\nРецепт коктейля " + getClass().getSimpleName() + " из класса " + getClass().getSuperclass().getSimpleName() + "\n" + line
				+ "\n" + actAddBlender + " Мякоть банана:  \t\t" + banana.getGramms() + " грамм"
				+ "\n" + actAddBlender + " Апельсиновый сок:  \t\t" + orangeJuice.getVolumeInMl() + " мл"
				+ "\n" + actAddBlender + " Молоко:  \t\t\t" + milk.getVolumeInMl() + " мл"
				+ "\n" + actAddBlender + " Сахар:  \t\t\t" + sugar.getGramms() + " грамм"
				+ "\n" + actMixBlender
				+ "\n" + actAdd		   + " Лёд:  \t\t\t\t\t" + ice.getGramms() + " грамм"
				+ "\n" + line;
				
	}

}
