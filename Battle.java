import java.util.ArrayList;
import java.util.List;
import java.util.Random; 


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
            System.out.println("Player2: You won this round, you are taking opponents card.");
        }
    }
    public boolean compareCards(List<String> playerOneCard, List<String> playerTwoCard, int index){
        int playerOneAttributeInt = Integer.parseInt(player.chooseAttribute(index, playerOneCard));
        int playerTwoAttributeInt = Integer.parseInt(player.chooseAttribute(index, playerTwoCard));
        if(playerOneAttributeInt > playerTwoAttributeInt){
            return true;
        } else if(playerOneAttributeInt == playerTwoAttributeInt){
            System.out.println("Attributes draw RNG God must decide!");
            return setRandomWinner();
        }
        else return false;
    }
    public void roundWinner(boolean whoWon, String identifyPlayer){
        if(whoWon){
            System.out.println("Player1 is called");
            identifyPlayer  = "Player1";
        } else {
            System.out.println("Player2 is called");
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
    public boolean setRandomWinner(){
        Random randomNumber = new Random();
        int playerOneNumber = randomNumber.nextInt(1000);
        int playerTwoNumber = randomNumber.nextInt(1000);
        if(playerOneNumber>playerTwoNumber){
            System.out.println("Player1 was chosen by RNG God");
            return true;
        } else if(playerOneNumber==playerTwoNumber){
            System.out.println("RNG draw! This is madness! Again");
            return setRandomWinner();
        }
        System.out.println("Player2 was chosen by RNG God");
        return false;
        
    }    
}