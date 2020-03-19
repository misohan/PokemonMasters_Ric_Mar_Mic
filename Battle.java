import java.util.ArrayList;
import java.util.List;

public class Battle {
    Player player;

    public void redistributeCardsToPlayers(boolean isWin, ArrayList<String> Set1, ArrayList<String> Set2, String card1String, String card2String, int index){
        if(isWin){      
            Set1.add(card2String);
            Set1.add(card1String);
           
            Set2.remove(0);       
            Set1.remove(0);
           
        } else{
            Set2.add(card1String);
            Set2.add(card2String);

            Set1.remove(0);
            Set2.remove(0);
        }
    }
  
    public void checkWin(boolean checkStatus){
        if(checkStatus){
            System.out.println("Player1: You won this round, you are taking opponents card.");
        } else{
            System.out.println("Player: You won this round, you are taking opponents card.");
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
    public void checkWinner(boolean whoWon, String identifyPlayer){
        if(whoWon){
            identifyPlayer  = "Player1";
        } else if(whoWon==false){
            identifyPlayer = "Player2";
        }
    }
    public boolean setWinner(boolean checkWinner){
        if(checkWinner){			
            return true;            
        } else{            
            return false;            
        }
    }    
}