import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Main{
	Scanner scanner = new Scanner(System.in);
	CardParserDAO parser = new CardParserImpl();
	View view = new View();
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		Player newPlayer = new Player();
		View newView = new View();
		ArrayList<String> Set1 = newPlayer.randomizePlayerSet();
		ArrayList<String> Set2 = newPlayer.randomizePlayerSet();

		System.out.println("This is your set young man, press 1 to see your opponents set " + Set1);
		int nextStep = scanner.nextInt();
		System.out.println("Your Pokemons"+ Set1);
		System.out.println("Your opponent set is: " + Set2);
		System.out.println("Choose what Pokemon you want to play (press 1, 2 or 3): ");
		int choice = scanner.nextInt();
		List<String> card1 = newPlayer.chooseCard(choice, Set1);
		List<String> card2 = newPlayer.chooseCard(nextStep, Set2);
		System.out.println("You choose this strong motherfucker");
		newView.printCard(card1);
		
		System.out.println("Your opponents card is: "+ newPlayer.chooseAttribute(5, card2));

		System.out.println("What attribute do you want to play? Fire 1, Water 2, Leaf 3 ");
		int attribute = scanner.nextInt();

		System.out.println("This is you opponent motherfucker! ");
		newView.printCard(card2);

		boolean checkStatus = newPlayer.compareCards(card1, card2, attribute);

		newPlayer.checkWin(checkStatus);

		scanner.close();
		
		
	}
	
	

    
}

		
		
		
		
		


