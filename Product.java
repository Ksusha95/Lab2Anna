package lab2Anna;

public class Product extends IngredientsForCoctail {
	
	//У класса Продукт будет одна переменная - количество грамм (сколько грамм продуктов нужно взять для конкретного коктейля)
	private int gramms = 0;
	
	public Product(int gramms) {
		
		this.gramms = gramms;
		
	}
	
	public int getGramms() {
		
		return gramms;
		
	}

}
