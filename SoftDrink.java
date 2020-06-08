package lab2Anna;

public class SoftDrink extends IngredientsForCoctail {
	
	//У класса Безалкогольный напиток будет одна переменная: количество этого напитка в миллилитрах
		private int volumeInMl = 0;
		
		public SoftDrink(int volumeInMl) {
			
			this.volumeInMl = volumeInMl;
			
		}
		
		public int getVolumeInMl() {
			
			return volumeInMl;
			
		}

}
