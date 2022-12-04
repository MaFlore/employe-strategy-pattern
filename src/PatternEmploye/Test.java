package PatternEmploye;

import java.util.Scanner;

import strategy.IGRCalculStrategy;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
		Employe employe = new Employe();
		Scanner scanner = new Scanner(System.in);
		boolean fin=false;
		while(!fin)
		{
			System.out.println("Donner le nom de l'algorithme IGR : ");
			String algoName = scanner.nextLine();
			System.out.println("Donner votre salaire mensuel : ");
			float salaireBrutMensuel = scanner.nextFloat();
			IGRCalculStrategy strategy = (IGRCalculStrategy)Class.forName(algoName).getDeclaredConstructor().newInstance();
			employe.setStrategy(strategy);
			System.out.println("Salaire mensuel après le calcul de l'IGR : "+employe.getSalaireNetMensuel(salaireBrutMensuel));
		}
		

	}

}
