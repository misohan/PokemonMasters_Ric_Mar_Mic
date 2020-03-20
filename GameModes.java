import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameModes {

    public void PVP() throws IOException {
        Scanner scanner = new Scanner(System.in);

        Player newPlayer = new Player();
		View newView = new View();
		Battle newBattle = new Battle();

		ArrayList<String> Set1 = newPlayer.randomizePlayerSet();
        ArrayList<String> Set2 = newPlayer.randomizePlayerSet();
		
		String identifyPlayer = "Player1";
		int choice = 0;
		int listSize = Set1.size();
		while(listSize>0){
			
			newView.printPlayersSets(Set1, Set2);
			
	
			List<String> card1 = newPlayer.chooseCard(choice, Set1);
			List<String> card2 = newPlayer.chooseCard(choice, Set2);
			String card1String = newPlayer.getCardToString(choice, Set1);
			String card2String = newPlayer.getCardToString(choice, Set2);

			newView.printPlayersCards(card1, card2);

			System.out.println(identifyPlayer  + ": What attribute do you want to play? Fire 1, Water 2, Leaf 3?");
			int attribute = scanner.nextInt();

			boolean checkWinner = newPlayer.compareCards(card1, card2, attribute);

			newBattle.redistributeCardsToPlayers(checkWinner, Set1, Set2, card1String, card2String, choice);
			newBattle.checkWin(checkWinner);			

			newView.printBattleResult(Set1, Set2, listSize);

			if(checkWinner){
				identifyPlayer= "Player1";
			} else{
				identifyPlayer = "Player2";
			}
			
			
			if((Set1.size()==0) || (Set2.size()==0)){
				System.out.println("End of the Game");
				break;

            }
        }
        scanner.close();
    }
}