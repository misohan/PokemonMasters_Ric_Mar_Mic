import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random; 

public class Player extends CardParserImpl {

    public ArrayList<String> randomizePlayerSet() throws IOException {
        ArrayList<String> listOfString = new ArrayList<String>();
        Random random = new Random(); 
        
        
        for(int i = 1; i<4; i++){
            int randInt = random.nextInt(30);
            String elementsData = readFileToList(fileName).get(randInt);
            listOfString.add(elementsData);

        }
        return listOfString;
        
    }
    public List<String> chooseCard(int indexCard, ArrayList<String> playerSet) throws IOException {
        String elementsData = playerSet.get(indexCard-1);
        String[] elements = elementsData.split(",");
        List<String> elementsList = Arrays.asList(elements);
        ArrayList<String> listOfString = new ArrayList<String>(elementsList);
        return listOfString;
    }
    public String chooseAttribute(int indexAttribute, List<String> chosenCard){
        if(indexAttribute == 1){
            return chosenCard.get(1);
        } else if(indexAttribute ==2){
            return chosenCard.get(2);
        } else if(indexAttribute ==3){
            return chosenCard.get(3);
        }
        return chosenCard.get(0);
        
   
    }
    public boolean compareCards(List<String> playerOneCard, List<String> playerTwoCard, int index){
        int playerOneAttributeInt = Integer.parseInt(chooseAttribute(index, playerOneCard));
        int playerTwoAttributeInt = Integer.parseInt(chooseAttribute(index, playerTwoCard));
        if(playerOneAttributeInt > playerTwoAttributeInt){
            return true;
        }
        else return false;
    }
    public void checkWin(boolean checkStatus){
        if(checkStatus){
            System.out.println("You won this round, you are taking opponents card.");
        } else{
            System.out.println("Sorry about that, your opponent is taking your card.");
        }
    }
    public String getCardToString(int indexCard,ArrayList<String> playerSet){
        return playerSet.get(indexCard-1);

    }
    public void AddCardToWinner(boolean isWin, ArrayList<String> Set1, ArrayList<String> Set2, String card1String, String card2String, int indexP1, int indexP2 ){
        if(isWin){
            Set1.add(card2String);
            Set2.remove(indexP2-1);
        } else{
            Set2.add(card1String);
            Set1.remove(indexP1-1);
        }
    }

}