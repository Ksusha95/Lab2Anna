package lab2Anna;
import static lab2Anna.Main.line;

/*Коктейль "Отвёртка"
 * 
 * Состав и пропорции:

	апельсиновый сок (желательно свежевыжатый) — 150 мл;
	водка (не самогон) — 50 мл;
	кубики льда — 200 грамм.
	
 * Приготовление:
 *  1. Наполнить стакан кубиками льда.
	2. Добавить 50 мл водки
	3. Добавить 150 мл апельсинового сока, 
	4. Аккуратно перемешать ложкой.
*/

public class Otvertka extends AlcoholicCocktail {

	private SoftDrink orangeJuice;
	private AlcoholicDrink vodka;
	private Product ice;
	private String actAdd;
	private String actMix;
	
	public Otvertka() {
		
		this.orangeJuice = new SoftDrink(150);
		this.vodka = new AlcoholicDrink(45, 50);
		this.ice = new Product(200);
		this.actAdd = Action.ADD.getAction();
		this.actMix = Action.MIX.getAction();
		
	}
	
	//Тут же выведем рецепт коктейля, перегрузив метод toString:
	public String toString() { 
		
		return  line + "\nРецепт коктейля " + getClass().getSimpleName() + " из класса " + getClass().getSuperclass().getSimpleName() + "\n" + line
				+ "\n" + actAdd + " Лёд:  \t\t\t\t" + ice.getGramms() + " грамм"
				+ "\n" + actAdd + " Водка:  \t\t\t" + vodka.getVolumeInMl() + " мл"
				+ "\n" + actAdd + " Апельсиновый сок:  \t\t" + orangeJuice.getVolumeInMl() + " мл"
				+ "\n" + actMix + "\n"
				+ "\nКрепость коктейля " + getClass().getSimpleName()+ ": ";
				
	}

	@Override
	public double AlcoholicCocktailStrength() {
		
		// Общий объём коктейля:
		int sum = ice.getGramms() + vodka.getVolumeInMl() + orangeJuice.getVolumeInMl();
		
		//Рассчитываем содержание спирта в 50мл водки:
		double containAlcoholInVodka = (vodka.getAlcoholStrengthIn100Ml() * vodka.getVolumeInMl())/100;
		
		//Общая крепость коктейля:
		double cocktailStrength = (100 * containAlcoholInVodka) /sum;
		
		return cocktailStrength;
		
	}
	
	
	
}
