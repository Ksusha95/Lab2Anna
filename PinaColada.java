package lab2Anna;
import static lab2Anna.Main.line;

/*Коктейль "Пина Колада"
 * 
 * Состав и пропорции
 * 
   	налить 30 мл светлого рома как основу для микса;
    добавить 30 мл ликера "Malibu";
	добавить 90 мл ананасового сока;
	добавить 20 мл нежирных сливок;
	добавить несколько кубиков льда (около 50 грамм);
	
	Все перечисленные выше составляющие следует взбить в блендере до получения однородной светлой массы
 * */


public class PinaColada extends AlcoholicCocktail {
	
	private SoftDrink pineappleJuice;
	private SoftDrink cream;
	private AlcoholicDrink liquorMaliby;
	private AlcoholicDrink lightRum;
	private Product ice;
	private String actAdd;
	private String actPour;
	private String actBlender;
	
	public PinaColada() {
		
		//Ещё раз: в алкоконструкторе сначала идёт крепость на 100мл, потом требуемый объём для коктейля
		this.pineappleJuice = new SoftDrink(90);
		this.cream = new SoftDrink(20);
		this.liquorMaliby = new AlcoholicDrink(35, 30);
		this.lightRum =  new AlcoholicDrink(40, 30);
		this.ice = new Product(50);
		this.actAdd = Action.ADD.getAction();
		this.actPour = Action.POUR.getAction();
		this.actBlender = Action.MIX_IN_BLENDER.getAction();
		
	}
	
	//Тут же выведем рецепт коктейля, перегрузив метод toString:
	public String toString() { 
		
		return  line + "\nРецепт коктейля " + getClass().getSimpleName() + " из класса " + getClass().getSuperclass().getSimpleName() + "\n" + line
				+ "\n" + actPour + "   Светлый ром:  \t\t\t" + lightRum.getVolumeInMl() + " мл"
				+ "\n" + actAdd  + " Ликёр Maliby:  \t\t" + liquorMaliby.getVolumeInMl() + " мл"
				+ "\n" + actAdd  + " Ананасовый сок:  \t\t" + pineappleJuice.getVolumeInMl() + " мл"
				+ "\n" + actAdd  + " Нежирные сливки:  \t\t" + cream.getVolumeInMl() + " мл"
				+ "\n" + actAdd  + " Лёд:  \t\t\t\t" + ice.getGramms() + " грамм"
				+ "\n" + actBlender + "\n"
				+ "\nКрепость коктейля " + getClass().getSimpleName()+ ": ";
				
	}

	@Override
	public double AlcoholicCocktailStrength() {
		// Общий объём коктейля:
		int sum = lightRum.getVolumeInMl() + liquorMaliby.getVolumeInMl() + pineappleJuice.getVolumeInMl() + cream.getVolumeInMl() + ice.getGramms();
		
		//Рассчитываем содержание спирта в 30мл светлого рома:
		double containAlcoholInlightRum = (lightRum.getAlcoholStrengthIn100Ml() * lightRum.getVolumeInMl())/100;
		
		//Рассчитываем содержание спирта в 30 мл ликера "Malibu":
		double containAlcoholInliquorMaliby = (liquorMaliby.getAlcoholStrengthIn100Ml() * liquorMaliby.getVolumeInMl())/100;
		
		//Определяем общее содержание спирта в коктейле:
		double SumContainAlcohol = containAlcoholInlightRum + containAlcoholInliquorMaliby;
		
		//Рассчитываем крепость коктейля:
		double cocktailStrength = (100 * SumContainAlcohol) / sum;
		
		return cocktailStrength;
 	
	}

}
