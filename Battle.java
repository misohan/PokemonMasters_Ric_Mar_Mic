import java.util.ArrayList;
import java.util.List;

public class Battle {
    Player player;

    public void AddCardToWinner(boolean isWin, ArrayList<String> Set1, ArrayList<String> Set2, String card1String, String card2String, int indexP1, int indexP2 ){
        if(isWin){
            Set1.add(card2String);
            Set2.remove(indexP2-1);
        } else{
            Set2.add(card1String);
            Set1.remove(indexP1-1);
        }
    }
    public void checkWin(boolean checkStatus){
        if(checkStatus){
            System.out.println("You won this round, you are taking opponents card.");
        } else{
            System.out.println("Sorry about that, your opponent is taking your card.");
        }
    }
    public boolean compareCards(List<String> playerOneCard, List<String> playerTwoCard, int index){
        int playerOneAttributeInt = Integer.parseInt(player.chooseAttribute(index, playerOneCard));
        int playerTwoAttributeInt = Integer.parseInt(player.chooseAttribute(index, playerTwoCard));
        if(playerOneAttributeInt > playerTwoAttributeInt){
            return true;
        }
        else return false;
    }    
}