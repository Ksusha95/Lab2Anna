/**
ЗАДАНИЕ N2.
1. Разработать иерархию классов – коктейлей. Коктейль определяется ингредиентами, их количеством, 
а так же последовательностью действий по приготовлению (налить, размешать, взболтать, добавить). 
Действие необходимо реализовать в виде класса-перечисления.
2. У класса коктейля предусмотреть метод, вычисляющий крепость коктейля.
3. Разработать программу, демонстрирующую модель 1—2 коктейлей.
 * */

/*В файле Main будем демонстрировать данную программу. */

package lab2Anna;

import java.util.Scanner;

public class Main {
	
	public static final String line = "--".repeat(40);

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		var otvertka = new Otvertka();
		var pinaColada = new PinaColada();
		var milkshakeWithBananaAndIceCream = new MilkshakeWithBananaAndIceCream();
		var tropical = new Tropical();
		
		System.out.print("Вам уже исполнилось 18 лет? Д/н: ");
		String choose = in.nextLine();
		
		if (choose.equalsIgnoreCase("д")) {
			
			in.close();
			System.out.println("\n[ ДЕМОНСТРАЦИЯ АЛКОГОЛЬНЫХ КОКТЕЙЛЕЙ ]");
			System.out.printf("\n" + otvertka.toString());
			System.out.printf("%.2f", otvertka.AlcoholicCocktailStrength());
			System.out.println(" градусов\n" + line);
		
			System.out.printf("\n" + pinaColada.toString());
			System.out.printf("%.2f", pinaColada.AlcoholicCocktailStrength());
			System.out.println(" градусов\n" + line);
		
			System.out.println("\n[ ДЕМОНСТРАЦИЯ БЕЗАЛКОГОЛЬНЫХ КОКТЕЙЛЕЙ ]");
			System.out.printf("\n" + milkshakeWithBananaAndIceCream.toString());
			System.out.printf("\n\n" + tropical.toString());
		
		}
		
		else if (choose.equalsIgnoreCase("н")) {
			
			in.close();
			System.out.println("\n[ ДЕМОНСТРАЦИЯ БЕЗАЛКОГОЛЬНЫХ КОКТЕЙЛЕЙ ]");
			System.out.printf("\n" + milkshakeWithBananaAndIceCream.toString());
			System.out.printf("\n\n" + tropical.toString());
		}
		
		else {
			
			in.close();
			System.out.println("\n[ Ошибка ввода ]");
		}

	}

}
