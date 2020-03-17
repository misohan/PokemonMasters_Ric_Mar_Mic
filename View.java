import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class View extends CardParserImpl {
    CardParserImpl cardParser;
    
    
    public void printCard(List<String> card) throws IOException {
        String name = card.get(0);
        String fire = card.get(1);
        String water = card.get(2);
        String leaf = card.get(3);
        System.out.println("|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");
        System.out.println("|----------------------|");
        System.out.println("|     Name: " + name + "");
        System.out.println("|----------------------|");
        System.out.println("|     Fire: " + fire + "         |" );
        System.out.println("|    Water: " + water + "         |" );
        System.out.println("|     Leaf: " + leaf + "         |" );
        System.out.println("|----------------------|");
        System.out.println("|______________________|");
    }
    public void printBattleResult(ArrayList<String> Set1, ArrayList<String> Set2, int listSize){
        if((Set1.size()>0) && (Set2.size()>0)){
            System.out.println("Next round");
        } else if(Set1.size()==0){
            System.out.println("You lost this game");            
        } else if(Set2.size()==0){
            System.out.println("******************");
            System.out.println("******************");
            System.out.println("You won this game");
            System.out.println("  PokemonMaster");
            System.out.println("******************");
            System.out.println("******************");
            
        }
    }
    
}