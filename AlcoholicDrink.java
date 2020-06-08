package lab2Anna;

public class AlcoholicDrink extends IngredientsForCoctail {
	
	//У класса Алкогольный напиток будут две переменные: крепость алкашки(в 100 мл) и количество этой алкашки в миллилитрах
	private double alcoholStrengthIn100Ml = 0;
	private int volumeInMl = 0;
	
	public AlcoholicDrink(double alcoholStrength, int volumeInMl) {
		
		this.alcoholStrengthIn100Ml = alcoholStrength;
		this.volumeInMl = volumeInMl;
		
	}
	
	public double getAlcoholStrengthIn100Ml () {
		
		return alcoholStrengthIn100Ml;
		
	}
	
	public int getVolumeInMl() {
		
		return volumeInMl;
		
	}
	

}
